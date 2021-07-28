import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Launch {
    public static void main(String[] args) {

        try {
            String source = "test.txt";
            CharStream cs = fromFileName(source);
            picalcLexer lexer = new picalcLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            picalcParser parser = new picalcParser(token);

            // run any rule
            //ParseTree tree = parser.program();
            picalcParser.BlockContext tree = parser.block();

            Visitors visitor = new Visitors();
            visitor.visit(tree);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
