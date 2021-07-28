import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Visitors<T> extends picalcBaseVisitor<T> {

    // TODO: clase para procesos y clase para canales. E incluir hashmaps con referencias a esos objetos

    // Jorge


    class Process {
        String name;
        Integer status;
        Runnable target;
        ArrayList<Pair<String, Parameter>> args;

        Process (Runnable target) {
            this.status = 0;
            this.target = target;
            this.args = new ArrayList<>();
        }

        public void run() {
            Thread thread = new Thread(this.target);
            this.status = 1;
            thread.start();
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

    private HashMap<String, Process> threads;
    private HashMap<String, Channel> channels;
    private HashMap<String, ArrayList<Object>> types;

    public Visitors() {
        super();
        this.threads = new HashMap<>();
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
        Process process = new Process(() -> {
            System.out.println("Semantica");
        });
        process.setName(id);
        for (int l = 0; l < elements.get(0).getSize(); l += 2) {
            process.addArgument(new Pair<>(
                    elements.get(0).getParameter(l).getStr(),
                    elements.get(0).getParameter(l + 1))
            );
        }
        this.threads.put(id, process);
    }

    // Hacer uso del HashMap de procesos (threads)Lanzar la ejecucion del hilo (execute)
    @Override public T visitProgram(picalcParser.ProgramContext ctx) {
        System.out.println("program first rule");
        visitProc(ctx.proc());
        String name = "name";
        this.threads.get(name).run();
        return null;
    }

    // Creacion de canales -> almacenarlos en el mapa processes
    @Override public T visitProc(picalcParser.ProcContext ctx) {
        if (ctx.val().size() == 2 && ctx.getText().contains("!")) {
            System.out.println("proc first rule");
            visitVal(ctx.val(0));
            visitVal(ctx.val(1));
        } else if (ctx.val() != null && ctx.abs() != null) {
            if (ctx.RINPUT() != null) {
                System.out.println("proc third rule");
                visitVal(ctx.val(0));
                visitAbs(ctx.abs());
            } else if (ctx.INPUT() != null) {
                System.out.println("proc second rule");
                visitVal(ctx.val(0));
                visitAbs(ctx.abs());
            }
        } else if (ctx.getText().equals("()")) {
            System.out.println("proc fourth rule");
        } else if (ctx.proc().size() == 2 && ctx.PC() != null) {
            System.out.println("proc fifth rule");
            visitProc(ctx.proc(0));
            visitProc(ctx.proc(1));
        } else if (ctx.dec() != null) {
            System.out.println("proc sixth rule");
            visitDec(ctx.dec());
            visitProc(ctx.proc(0));
        } else if (ctx.getChild(0).getText().equals("if")) {
            System.out.println("proc seventh rule");
            visitVal(ctx.val(0));
            visitProc(ctx.proc(0));
            visitProc(ctx.proc(1));
        }
        return null;
    }

    //Sebastian
    // Retornar en una lista los argumentos de la declaracion -> definir el formato de lo envia
    @Override public T visitDec(picalcParser.DecContext ctx) {
        int a = 10;
        Process p1 = new Process(() -> {
            System.out.println("Hello World! I hate Pict!");
            System.out.println(a + 1);
        });
        this.threads.put("name", p1);
        if (ctx.getText().charAt(0) == 'n') {
            System.out.println("DEC Rule one");
            String name = ctx.ID(0).getText();
            Object element = visitType(ctx.type());
            if (element instanceof String) {
                ArrayList<Parameter> parameters = new ArrayList<>();
                parameters.add(recognizeElementType(element));
                Channel channel = new Channel(0, parameters);
                this.channels.put(name, channel);
            } else {
                ArrayList<Parameter> parameters = (ArrayList<Parameter>) element;
                int type = (parameters.get(0).getStr().equals("I/O") ? 0 : 1);
                Channel channel = new Channel(type, parameters);
                this.channels.put(name, channel);
            }
        } else if (ctx.getText().charAt(0) == 'd') {
            System.out.println("DEC Rule two");
            String id = ctx.ID(0).getText();
            System.out.println(id);
            createProcess(id, (ArrayList<Parameter>) visitAbs(ctx.abs(0)));
            for (int i = 1; i < ctx.abs().size(); i++) {
                System.out.println(ctx.ID(i).getText());
                visitAbs(ctx.abs(i));
            }
        } else if (ctx.getText().charAt(0) == 't') {
            System.out.println("DEC Rule three");
            String line = ctx.getText();
            String id = ctx.ID(0).getText();
            System.out.println(id);
            visitType(ctx.type());
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