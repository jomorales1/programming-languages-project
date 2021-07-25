public class MyVisitor extends gBaseVisitor<Object> {
    @Override public Object visitPrule(gParser.PruleContext ctx) {
        return visitChildren(ctx);
    }

    @Override public Object visitDfarule(gParser.DfaruleContext ctx) {
        return visitChildren(ctx);
    }
}