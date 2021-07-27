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

        Process (Runnable target) {
            this.status = 0;
            this.target = target;
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
    }

    private HashMap<String, Process> threads;
    private HashMap<String, Channel> channels;
    private HashMap<String, ArrayList<Object>> types;

    public Visitors() {
        super();
        this.threads = new HashMap<>();
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
        if (ctx.getText().charAt(0) == 'n'){
            // TODO: create channel
            System.out.println("DEC Rule one");
            ctx.ID(0).getText();
            visitType(ctx.type());
        }else if (ctx.getText().charAt(0) == 'd'){
            System.out.println("DEC Rule two");
            String id = ctx.ID(0).getText();
            System.out.println(id);
            visitAbs(ctx.abs(0));
            for (int i = 1; i < ctx.abs().size(); i++) {
                System.out.println(ctx.ID(i).getText());
                visitAbs(ctx.abs(i));
            }
        }else if (ctx.getText().charAt(0) == 't'){
            System.out.println("DEC Rule three");
            String line = ctx.getText();
            String id = ctx.ID(0).getText();
            System.out.println(id);
            visitType(ctx.type());
        }
        return null;
    }

    @Override public T visitPat(picalcParser.PatContext ctx) {
        if (ctx.ID() != null) {
            System.out.println("pat rule one");
            ArrayList<Object> items = new ArrayList<>();
            items.add(ctx.ID().getText());
            items.add(visitOtype(ctx.otype()));
            return (T) items;
        } else if (ctx.OSB() != null) {
            System.out.println("pat rule two");
            ArrayList<Object> items = new ArrayList<>();
            for (int i = 0; i < ctx.label().size(); i++) {
                items.add(visitLabel(ctx.label(i)));
                items.add(visitPat(ctx.pat(i)));
            }
            return (T) items;
        } else if (ctx.US() != null) {
            System.out.println("pat rule three");
            ArrayList<Object> items = new ArrayList<>();
            items.add(ctx.US().getText());
            items.add(visitOtype(ctx.otype()));
            return (T) items;
        }
        return null;
    }


    //Tovar
    @Override public T visitOtype(picalcParser.OtypeContext ctx) {
        if (ctx.type() != null) {
            System.out.println("otype first rule");
            return (T) visitType(ctx.type());
        }
        return null;
    }

    @Override public T visitType(picalcParser.TypeContext ctx) {
        ArrayList<Object> args = new ArrayList<>();
        if (ctx.getText().charAt(0) == '^') {
            System.out.println("type rule first");
            args.add("I/O");
            args.add(visitType(ctx.type(0)));
            return (T) args;
        } else if (ctx.getText().charAt(0) == '[') {
            System.out.println("type rule second");
            ArrayList<Object> items = new ArrayList<>();
            for (int i = 0; i < ctx.label().size(); i++) {
                String id = (String) visitLabel(ctx.label(i));
                items.add(id);
                System.out.println("Label [" + i + "] = " + id);
                Object el = visitType(ctx.type(i));
                items.add(el);
            }
            return (T) items;
        } else if (ctx.getText().charAt(0) == 'B' ||
                ctx.getText().charAt(0) == 'C' ||
                ctx.getText().charAt(0) == 'I' ||
                ctx.getText().charAt(0) == 'S' ) {
            System.out.println("type rule three");
            ArrayList<Object> type = new ArrayList<>();
            System.out.println(ctx.getText());
            type.add(ctx.getText());
            return (T) type;
        }
        return null;
    }

    @Override public T visitAbs(picalcParser.AbsContext ctx) {
        if (ctx.pat() != null) {
            System.out.println("abs first rule");
            visitPat(ctx.pat());
            visitProc(ctx.proc());
        } else if (ctx.OSB() != null) {
            System.out.println("abs second rule");
            ArrayList<String> ids = new ArrayList<>();
            for (int i = 0; i < ctx.ID().size(); i++) {
                ids.add(ctx.ID(i).getText());
            }
            return (T) ids;
        }
        return null;
    }


    //Juan
    @Override public T visitVal(picalcParser.ValContext ctx) {
        if (ctx.path() != null) {
            System.out.println("val primera regla");
            return (T) visitPath(ctx.path());
        }
        else if (ctx.OSB() != null) {
            System.out.println("val segunda regla");
            ArrayList<Object> list = new ArrayList<>();
            if (ctx.label() != null) {
                for (int i = 0; i < ctx.val().size(); i++) {
                    String id = (String) visitLabel(ctx.label(i));
                    list.add(id);
                    Object element = visitVal(ctx.val(i));
                    list.add(element);
                }
            } else if (ctx.ID() != null) {
                for (int i = 0; i < ctx.ID().size(); i++) {
                    list.add(ctx.ID(i).getText());
                }
            }
            return (T) list;
        }
        else if (ctx.BOOL() != null){
            System.out.println("Regla de bool");
            return (T) ctx.BOOL().getText();
        }
        else if (ctx.CHAR() != null){
            System.out.println(("Regla de char"));
            return (T) ctx.CHAR().getText();
        }
        else if (ctx.INT() != null) {
            System.out.println("Regla de int");
            return (T) ctx.INT().getText();
        }
        else if (ctx.STRING() != null){
            System.out.println("Regla de String");
            return (T) ctx.STRING().getText();
        }
        return null;
    }

    // Returns PATH -> ArrayList<Parameter>
    @Override public T visitPath(picalcParser.PathContext ctx) {
        ArrayList<String> ids = new ArrayList<>();
        if (ctx.ID() != null) {
            System.out.println("path first rule");
            ids.add(ctx.ID(0).getText());
            for (int i = 1; i < ctx.ID().size(); i++) {
                ids.add(ctx.ID(i).getText());
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