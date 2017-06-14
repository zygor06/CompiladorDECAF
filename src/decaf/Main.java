package decaf;

import java.io.*;
//import antlr.Token;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import java6035.tools.CLI.*;

class Main{

    public static void imprimirToken(Token token, String type){
        System.out.println (token.getLine() + type + " " + token.getText());
    }

    public static void main(String[] args){
        try {
        	CLI.parse (args, new String[0]);

        	InputStream inputStream = args.length == 0 ?
                    System.in : new java.io.FileInputStream(CLI.infile);

        	if (CLI.target == CLI.SCAN)
        	{
        		DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
        		Token token;
        		boolean done = false;
        		while (!done)
        		{
        			try
        			{
		        		for (token=lexer.nextToken(); token.getType()!=Token.EOF; token=lexer.nextToken())
		        		{
                            String fileName = args[0].toString();
		        			String type = "";

		        			switch (token.getType()){
		        			case DecafLexer.IDENTIFIER:
		        				type = " IDENTIFIER";
		        				break;
                            case DecafLexer.CHAR_LITERAL:
                                type = " CHARLITERAL";
                                break;
                            case DecafLexer.STRING_LITERAL:
                                type = " STRINGLITERAL";
                                break;
                            case DecafLexer.INTEGER_LITERAL:
                                type = " INTLITERAL";
                                break;
                            case DecafLexer.BOOLEAN_LITERAL:
                                type = " BOOLEANLITERAL";
                                break;
		        			}
                            imprimirToken(token, type);
		        			
		        		}
		        		done = true;
        			} catch(Exception e) {
        	        	// print the error:
        	            System.out.println(CLI.infile+" "+e);
                        //print error
                        //e.printStackTrace();
        	            lexer.skip();
        	        }
        		}
        	}
        	else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT)
        	{
        		DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                DecafParser parser = new DecafParser(tokens);
                parser.program();
        	}
        	
        } catch(Exception e) {
        	// print the error:
            System.out.println(CLI.infile+" "+e);
        }
    }
}

