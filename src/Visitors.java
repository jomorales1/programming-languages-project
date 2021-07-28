import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Visitors<T> extends picalcBaseVisitor<T> {

    static class Process {
        String name;
        Integer status;
        ArrayList<Runnable> targets;
        ArrayList<Pair<String, Parameter>> args;

        Process (String name) {
            this.name = name;
            this.status = 0;
            this.targets = new ArrayList<>();
            this.args = new ArrayList<>();
        }

        public void addTarget(Runnable target) {
            this.targets.add(target);
        }

        public void run() {
            this.status = 1;
            for (Runnable runnable : this.targets) {
                Thread thread = new Thread(runnable);
                thread.start();
            }
            this.status = 2;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getStatus() {
            return status;
        }

        public void addArgument(Pair<String, Parameter> arg) {
            this.args.add(arg);
        }
    }

    private final HashMap<String, Process> threads;
    private final HashMap<String, Channel> channels;
    private final HashMap<String, Parameter> types;

    public Visitors() {
        super();
        this.threads = new HashMap<>();
        this.channels = new HashMap<>();
        this.types = new HashMap<>();
    }

    public Parameter recognizeElementType(Object element) {
        if (element instanceof String) {
            return new Parameter((String) element);
        }
        Parameter parameter = new Parameter();
        parameter.setParameters((ArrayList<Parameter>) element);
        return parameter;
    }

    public void createProcess(String id, ArrayList<Parameter> elements) {
        if (this.threads.containsKey(id)) {
            throw new RuntimeException();
        }
        Process process = new Process(id);
        for (int l = 0; l < elements.get(0).getSize(); l += 2) {
            process.addArgument(new Pair<>(
                    elements.get(0).getParameter(l).getStr(),
                    elements.get(0).getParameter(l + 1))
            );
        }
        Parameter instructions = elements.get(1);
        for (int i = 0; i < instructions.getSize(); i += 3) {
            int finalI = i;
            process.addTarget(() -> {
                String n1 = instructions.getParameter(finalI).getStr();
                String n2 = instructions.getParameter(finalI + 2).getStr();
                if (!instructions.getParameter(finalI + 1).getStr().equals("print")) {
                    if (!channels.containsKey(n1) || !channels.containsKey(n2)) {
                        System.out.println("Error");
                        Thread.currentThread().interrupt();
                    }
                }
                switch (instructions.getParameter(finalI + 1).getStr()) {
                    case "!":
                        try {
                            channels.get(n1).write(channels.get(n2).read());
                        } catch (Channel.WriteException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "?":
                        try {
                            int mseconds = 0;
                            while (channels.get(n1).isEmpty()) {
                                TimeUnit.MILLISECONDS.sleep(1);
                                mseconds++;
                                if (mseconds > 1000) {
                                    break;
                                }
                            }
                            if (mseconds <= 1000) {
                                channels.get(n2).write(channels.get(n1).read());
                            }
                        } catch (Channel.WriteException | InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "?*":
                        try {
                            for (int j = 0; j < 10; j++) {
                                channels.get(n2).write(channels.get(n1).read());
                                TimeUnit.MILLISECONDS.sleep(100);
                            }
                        } catch (Channel.WriteException | InterruptedException e) {
                            e.printStackTrace();
                        }
                        break;
                    case "print":
                        System.out.println(n2);
                        break;
                }
            });
        }
        this.threads.put(id, process);
    }

    @Override public T visitBlock(picalcParser.BlockContext ctx) {
        int index = 0, program = 0, dec = 0;
        while (!(ctx.getChild(index) instanceof picalcParser.ProgramContext) ||
                !(ctx.getChild(index) instanceof picalcParser.DecContext)) {
            if (ctx.getChild(index) instanceof picalcParser.ProgramContext) {
                visitProgram(ctx.program(program++));
            } else if (ctx.getChild(index) instanceof picalcParser.DecContext) {
                visitDec(ctx.dec(dec++));
            }
            index++;
        }
        return null;
    }

    // Hacer uso del HashMap de procesos (threads)Lanzar la ejecucion del hilo (execute)
    @Override public T visitProgram(picalcParser.ProgramContext ctx) {
        System.out.println("program first rule");
        ArrayList<Parameter> list = (ArrayList<Parameter>) visitProc(ctx.proc());
        String name = list.get(0).getStr();
        this.threads.get(name).run();
        return null;
    }

    // Returns
    @Override public T visitProc(picalcParser.ProcContext ctx) {
        if (ctx.ID().size() == 2 && ctx.getText().contains("!")) {
            System.out.println("proc first rule");
            ArrayList<Parameter> args = new ArrayList<>();
            args.add(new Parameter(ctx.ID(0).getText()));
            args.add(new Parameter("!"));
            args.add(new Parameter(ctx.ID(1).getText()));
            return (T) args;
        } else if (ctx.ID().size() == 2 && ctx.getText().contains("?")) {
            ArrayList<Parameter> args = new ArrayList<>();
            args.add(new Parameter(ctx.ID(0).getText()));
            if (ctx.RINPUT() != null) {
                System.out.println("proc third rule");
                args.add(new Parameter("?*"));
            } else if (ctx.INPUT() != null) {
                System.out.println("proc second rule");
                args.add(new Parameter("?"));
            }
            args.add(new Parameter(ctx.ID(1).getText()));
            return (T) args;
        } else if (ctx.getText().equals("()")) {
            System.out.println("proc fourth rule");
        } else if (ctx.proc().size() == 2 && ctx.PC() != null) {
            System.out.println("proc fifth rule");
            ArrayList<Parameter> processes = new ArrayList<>();
            processes.add(recognizeElementType(visitProc(ctx.proc(0))));
            processes.add(recognizeElementType(visitProc(ctx.proc(1))));
            return (T) processes;
        } else if (ctx.dec() != null) {
            ArrayList<Parameter> list = new ArrayList<>();
            list.add(recognizeElementType(visitDec(ctx.dec())));
            list.add(recognizeElementType(visitProc(ctx.proc(0))));
            return (T) list;
        } else if (ctx.getChild(0).getText().equals("if")) {
            System.out.println("proc seventh rule");
            visitVal(ctx.val(0));
            visitProc(ctx.proc(0));
            visitProc(ctx.proc(1));
        } else if (ctx.getText().contains("print")) {
            ArrayList<Parameter> args = new ArrayList<>();
            args.add(new Parameter(ctx.ID(0).getText()));
            args.add(new Parameter(ctx.STRING().getText()));
        }
        return null;
    }

    // Creates processes, channels and types
    @Override public T visitDec(picalcParser.DecContext ctx) {
        if (ctx.getText().charAt(0) == 'n') {
            System.out.println("dec first rule");
            String name = ctx.ID(0).getText();
            if (this.channels.containsKey(name)) {
                throw new RuntimeException();
            }
            Object element = visitType(ctx.type());
            if (element instanceof String) {
                ArrayList<Parameter> parameters = new ArrayList<>();
                parameters.add(recognizeElementType(element));
                Channel channel = new Channel(name, 0, parameters);
                this.channels.put(name, channel);
            } else {
                ArrayList<Parameter> parameters = (ArrayList<Parameter>) element;
                int type = (parameters.get(0).getStr().equals("I/O") ? 0 : 1);
                Channel channel = new Channel(name, type, parameters);
                this.channels.put(name, channel);
            }
        } else if (ctx.getText().charAt(0) == 'd') {
            System.out.println("dec second rule");
            String id = ctx.ID(0).getText();
            createProcess(id, (ArrayList<Parameter>) visitAbs(ctx.abs(0)));
            for (int i = 1; i < ctx.abs().size(); i++) {
                String id1 = ctx.ID(i).getText();
                createProcess(id1, (ArrayList<Parameter>) visitAbs(ctx.abs(i)));
            }
        } else if (ctx.getText().charAt(0) == 't') {
            System.out.println("dec third rule");
            String id = ctx.ID(0).getText();
            if (this.types.containsKey(id)) {
                throw new RuntimeException();
            }
            this.types.put(id, recognizeElementType(visitType(ctx.type())));
        }
        return null;
    }

    // Returns ArrayList<Parameter>
    @Override public T visitPat(picalcParser.PatContext ctx) {
        if (ctx.ID() != null) {
            System.out.println("pat rule one");
            ArrayList<Parameter> items = new ArrayList<>();
            items.add(new Parameter(ctx.ID().getText()));
            items.add(recognizeElementType(visitOtype(ctx.otype())));
            return (T) items;
        } else if (ctx.OSB() != null) {
            System.out.println("pat rule two");
            ArrayList<Parameter> items = new ArrayList<>();
            for (int i = 0; i < ctx.label().size(); i++) {
                items.add(new Parameter((String) visitLabel(ctx.label(i))));
                items.add(recognizeElementType(visitPat(ctx.pat(i))));
            }
            return (T) items;
        } else if (ctx.US() != null) {
            System.out.println("pat rule three");
            ArrayList<Parameter> items = new ArrayList<>();
            items.add(new Parameter(ctx.US().getText()));
            items.add(recognizeElementType(visitOtype(ctx.otype())));
            return (T) items;
        }
        return null;
    }

    // Returns ArrayList<Parameter>
    @Override public T visitOtype(picalcParser.OtypeContext ctx) {
        if (ctx.type() != null) {
            System.out.println("otype first rule");
            return (T) visitType(ctx.type());
        }
        return null;
    }

    // Returns ArrayList<Parameter> | String
    @Override public T visitType(picalcParser.TypeContext ctx) {
        ArrayList<Parameter> args = new ArrayList<>();
        if (ctx.getText().charAt(0) == '^') {
            System.out.println("type first rule");
            args.add(new Parameter("I/O"));
            args.add(recognizeElementType(visitType(ctx.type(0))));
            return (T) args;
        } else if (ctx.getText().charAt(0) == '[') {
            System.out.println("type second rule");
            for (int i = 0; i < ctx.label().size(); i++) {
                args.add(new Parameter((String) visitLabel(ctx.label(i))));
                args.add(recognizeElementType(visitType(ctx.type(i))));
            }
            return (T) args;
        } else if (ctx.getText().charAt(0) == 'B' ||
                ctx.getText().charAt(0) == 'C' ||
                ctx.getText().charAt(0) == 'I' ||
                ctx.getText().charAt(0) == 'S' ) {
            System.out.println("type third rule");
            return (T) ctx.getText();
        }
        return null;
    }

    // Returns ArrayList<Parameter>
    @Override public T visitAbs(picalcParser.AbsContext ctx) {
        if (ctx.pat() != null) {
            System.out.println("abs first rule");
            ArrayList<Parameter> args = new ArrayList<>();
            args.add(recognizeElementType(visitPat(ctx.pat())));
            args.add(recognizeElementType(visitProc(ctx.proc())));
            return (T) args;
        } else if (ctx.OSB() != null) {
            System.out.println("abs second rule");
            ArrayList<Parameter> ids = new ArrayList<>();
            for (int i = 0; i < ctx.ID().size(); i++) {
                ids.add(new Parameter(ctx.ID(i).getText()));
            }
            return (T) ids;
        }
        return null;
    }

    // Returns ArrayList<Parameter> | String
    @Override public T visitVal(picalcParser.ValContext ctx) {
        if (ctx.path() != null) {
            System.out.println("val first rule");
            return (T) visitPath(ctx.path());
        }
        else if (ctx.OSB() != null) {
            System.out.println("val second rule");
            ArrayList<Parameter> list = new ArrayList<>();
            if (ctx.label() != null) {
                for (int i = 0; i < ctx.val().size(); i++) {
                    list.add(new Parameter((String) visitLabel(ctx.label(i))));
                    list.add(recognizeElementType(ctx.val(i)));
                }
            } else if (ctx.ID() != null) {
                for (int i = 0; i < ctx.ID().size(); i++) {
                    Parameter idVal = new Parameter();
                    idVal.setStr(ctx.ID(i).getText());
                    list.add(idVal);
                }
            }
            return (T) list;
        }
        else if (ctx.BOOL() != null){
            System.out.println("val third rule -> bool");
            return (T) ctx.BOOL().getText();
        }
        else if (ctx.CHAR() != null){
            System.out.println(("val third rule -> char"));
            return (T) ctx.CHAR().getText();
        }
        else if (ctx.INT() != null) {
            System.out.println("val third rule -> int");
            return (T) ctx.INT().getText();
        }
        else if (ctx.STRING() != null){
            System.out.println("val third rule -> string");
            return (T) ctx.STRING().getText();
        }
        return null;
    }

    // Returns PATH -> ArrayList<Parameter>
    @Override public T visitPath(picalcParser.PathContext ctx) {
        ArrayList<Parameter> ids = new ArrayList<>();
        if (ctx.ID() != null) {
            System.out.println("path first rule");
            Parameter id = new Parameter();
            id.setStr(ctx.ID(0).getText());
            ids.add(id);
            for (int i = 1; i < ctx.ID().size(); i++) {
                Parameter optionalId = new Parameter();
                optionalId.setStr(ctx.ID(i).getText());
                ids.add(optionalId);
            }
            return (T) ids;
        }
        return null;
    }


    // Returns ID -> String
    @Override public T visitLabel(picalcParser.LabelContext ctx) {
        if (ctx.ID() != null) {
            System.out.println("label first rule");
            return (T) ctx.ID().getText();
        }
        return null;
    }
}