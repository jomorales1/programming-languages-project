import java.util.ArrayList;

public class Visitors<T> extends picalcBaseVisitor<T> {

    // TODO: clase para procesos y clase para canales. E incluir hashmaps con referencias a esos objetos

    // Jorge
    @Override public T visitProgram(picalcParser.ProgramContext ctx) {
        System.out.println("program first rule");
        visitProc(ctx.proc());
        return null;
    }


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
    @Override public T visitDec(picalcParser.DecContext ctx) {
        int a = 10;
        String p = "3 + 1 | 2 + 2";
        Thread thread = new Thread(() -> {
            System.out.println("Hello World");
            System.out.println(a + 1);
        });
        thread.start();
        if (ctx.getText().charAt(0) == 'n'){
            System.out.println("DEC Rule one");
            String line = ctx.getText();
            String id = ctx.ID(0).getText();
            System.out.println(id);
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

        if (ctx.ID() != null){
            System.out.println("pat Rule one");
            visitOtype(ctx.otype());
        }else if (ctx.OSB() != null){
            System.out.println("pat Rule two");
            for (int i=0; i<ctx.label().size(); i++){
                visitLabel(ctx.label(i));
                visitPat(ctx.pat(i));
            }
        }else if (ctx.US() != null){
            visitOtype(ctx.otype());
            System.out.println("pat Rule three");
        }
        return null;
    }


    //Tovar
    @Override public T visitOtype(picalcParser.OtypeContext ctx) {
        if (ctx.type() != null) {
            System.out.println("otype first rule");
            ArrayList<T> args = (ArrayList<T>) visitType(ctx.type());
        }
        return null;
    }

    @Override public T visitType(picalcParser.TypeContext ctx) {
        ArrayList<String> args = new ArrayList<>();
        if (ctx.getText().charAt(0) == '^') {
            System.out.println("type rule first");
        } else if (ctx.getText().charAt(0) == '[') {
            System.out.println("type rule second");
            for (int i = 0; i < ctx.label().size(); i++) {
                visitLabel(ctx.label(i));
                visitType(ctx.type(i));
            }
        } else {
            System.out.println("type rule three");
            switch (ctx.getText()) {
                case "Boolean":
                    System.out.println("Boolean");
                    break;
                case "Char":
                    System.out.println("Char");
                    break;
                case "Int":
                    System.out.println("Int");
                    break;
                case "String":
                    System.out.println("String");
                    break;
            }
        }
        // System.out.println(ctx.getRuleContext());
        return null;
    }

    @Override public T visitAbs(picalcParser.AbsContext ctx) {
        if (ctx.pat() != null) {
            System.out.println("abs first rule");
            visitPat(ctx.pat());
            visitProc(ctx.proc());
        }
        return null;
    }


    //Juan
    @Override public T visitVal(picalcParser.ValContext ctx) {

        if (ctx.path() != null) {

            System.out.println("val primera regla");
        }

        else if (ctx.OSB() != null) {
            for (int i = 0; i < ctx.val().size(); i++) {
                visitLabel(ctx.label(i));
                visitVal(ctx.val(i));
            }
            System.out.println("val segunda regla");
        }
        else if(ctx.BOOL() != null){
            System.out.println("Regla de bool");
        }
        else if(ctx.CHAR() != null){
            System.out.println(("Regla de char"));
        }
        else if(ctx.INT() != null) {
            System.out.println("Regla de int");
        }
        else{
            System.out.println("Regla de String");
        }

        // No hay que retornar un tipo distinto?
        return null;
    }

    @Override public T visitPath(picalcParser.PathContext ctx) {
        if (ctx.ID() != null) {
            System.out.println("path first rule");
        }
        return null;
    }


    @Override public T visitLabel(picalcParser.LabelContext ctx) {
        if (ctx.ID() != null) {
            System.out.println("label first rule");
        }
        return null;
    }
}