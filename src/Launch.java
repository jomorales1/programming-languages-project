import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java.io.IOException;
import static  org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String[] args) {
        try {
            String source = "test.txt";
            CharStream cs = fromFileName(source);
            gLexer lexer = new gLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            gParser parser = new gParser(token);

            // run any rule
            // ParseTree tree = parser.prule();

            MyVisitor visitor = new MyVisitor();
            // visitor.visit(tree);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
