import gen.picalcBaseVisitor;
import gen.picalcParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class Visitors<T> extends picalcBaseVisitor<T> {

    // TODO: clase para procesos y clase para canales. E incluir hashmaps con referencias a esos objetos

    // Jorge
    @Override public T visitProgram(picalcParser.ProgramContext ctx) {
        visitProc(ctx.proc());
        return null;
    }


    @Override public T visitProc(picalcParser.ProcContext ctx) {
        if (ctx.val().size() == 2 && ctx.getText().contains("!")) {
            System.out.println("first rule");
        } else if (ctx.val() != null && ctx.abs() != null) {
            if (ctx.RINPUT() != null) {
                System.out.println("third rule");
            } else if (ctx.getText().contains("!")) {
                System.out.println("second rule");
            }
        } else if (ctx.getText().equals("()")) {
            System.out.println("fourth rule");
        } else if (ctx.proc().size() == 2) {

        }
        return null;
    }


    //Sebastian
    @Override public T visitDec(picalcParser.DecContext ctx) {

        if (ctx.getText().charAt(0) == 'n'){

        }else if (ctx.getText().charAt(0) == 'd'){

        }else if (ctx.getText().charAt(0) == 't'){

        }

        return visitChildren(ctx);
    }

    @Override public T visitPat(picalcParser.PatContext ctx) {

        //if ()
        return visitChildren(ctx);
    }


    //Tovar
    @Override public T visitOtype(picalcParser.OtypeContext ctx) {
        if (ctx.type() != null) {
            ArrayList<T> args = (ArrayList) visitType(ctx.type());
        }

        return visitChildren(ctx.type());
    }



    @Override public T visitType(picalcParser.TypeContext ctx) {
        ArrayList<String> args = new ArrayList<>();
        if (ctx.getText().charAt(0) == '^') {
            System.out.println("primera regla");
        } else if (ctx.getText().charAt(0) == '[') {
            for (int i = 0; i < ctx.label().size(); i++) {
                visitLabel(ctx.label(i));
                visitType(ctx.type(i));
            }
            System.out.println("segunda regla");
        } else {
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

    @Override public T visitAbs(picalcParser.AbsContext ctx) { return visitChildren(ctx); }


    //Juan
    @Override public T visitVal(picalcParser.ValContext ctx) {

        char firstChar = ctx.getText().charAt(0);

        if (ctx.path() != null) {
            System.out.println("primera regla");
        }
        else if (ctx.) {
            for (int i = 0; i < ctx.val().size(); i++) {
                visitLabel(ctx.label(i));
                visitVal(ctx.val(i));
            }
            System.out.println("segunda regla");
        }
        return visitChildren(ctx); }

    @Override public T visitPath(picalcParser.PathContext ctx) { return visitChildren(ctx); }



    @Override public T visitLabel(picalcParser.LabelContext ctx) {

        return visitChildren(ctx);
    }
}