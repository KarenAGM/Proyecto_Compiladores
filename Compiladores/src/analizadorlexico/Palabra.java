package analizadorlexico;

public class Palabra extends Token{
	 public String lexema = "";
	    
	    public Palabra(String s, int etiqueta) {
	        super(etiqueta); 
	        lexema = s;
	    }
	    
	    public String toString () {
	    	return lexema;
	    }
	    
	    public static final Palabra and = new Palabra("&&",Etiqueta.AND);
	    public static final Palabra or = new Palabra("||",Etiqueta.OR);
	    public static final Palabra eq = new Palabra("==",Etiqueta.EQ);
	    public static final Palabra ne = new Palabra("!=",Etiqueta.NE);
	    public static final Palabra le = new Palabra("<=",Etiqueta.LE);
	    public static final Palabra ge = new Palabra(">=",Etiqueta.GE);
	    public static final Palabra minus = new Palabra("minus",Etiqueta.MINUS);
	    public static final Palabra True = new Palabra("true",Etiqueta.TRUE);
	    public static final Palabra False = new Palabra("false",Etiqueta.FALSE);
	    public static final Palabra temp = new Palabra("t",Etiqueta.TEMP);
	    

}
