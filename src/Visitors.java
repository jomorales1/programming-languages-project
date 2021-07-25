import gen.picalcBaseVisitor;
import gen.picalcParser;

public class Visitors<T> extends picalcBaseVisitor<T> {

    // TODO: clase para procesos y clase para canales. E incluir hashmaps con referencias a esos objetos

    // Jorge
    @Override public T visitProgram(picalcParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }


    @Override public T visitProc(picalcParser.ProcContext ctx) { return visitChildren(ctx); }


    //Sebastian
    @Override public T visitDec(picalcParser.DecContext ctx) { return visitChildren(ctx); }



    @Override public T visitPat(picalcParser.PatContext ctx) { return visitChildren(ctx); }


    //Tovar
    @Override public T visitOtype(picalcParser.OtypeContext ctx) { return visitChildren(ctx); }



    @Override public T visitType(picalcParser.TypeContext ctx) { return visitChildren(ctx); }



    @Override public T visitAbs(picalcParser.AbsContext ctx) { return visitChildren(ctx); }


    //Juan
    @Override public T visitVal(picalcParser.ValContext ctx) { return visitChildren(ctx); }



    @Override public T visitPath(picalcParser.PathContext ctx) { return visitChildren(ctx); }



    @Override public T visitLabel(picalcParser.LabelContext ctx) { return visitChildren(ctx); }
}