package decaf;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.misc.NotNull;

import symbols.Scope;
import symbols.Symbol;

public class DecafSymbolsAndScope extends DecafParserBaseListener
{
	
	Scope currentScope;
	
	@Override
	public void enterProgram(@NotNull DecafParser.ProgramContext ctx)
	{	
		/*Map<String, Symbol> symbols = new HashMap<String, Symbol>();
		ctx.scope = symbols;*/
	}
	
	private void pushScope(Scope s) {
		currentScope = s;
	}

	private void popScope() {
		currentScope = currentScope.getEnclosingScope();
	}
}