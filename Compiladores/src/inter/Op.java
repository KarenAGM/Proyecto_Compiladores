package inter;

import analizadorlexico.*;
import simbolos.*;

public class Op extends Expr{
	public Op(Token tok, Tipo p) { 
		super(tok, p); } 

	public Expr reducir() { 
		Expr x = gen();
		Temp t = new Temp(tipo); 
		emitir( t.toString() + " = " + x.toString() ); 
		return t; 
	}
}
