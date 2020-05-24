package simbolos;

import analizadorlexico.*;

public class Tipo extends Palabra{
	public int anchura = 0;
	
	 public Tipo(String s, int etiqueta, int w) { 
		 super(s, etiqueta); anchura = w; 
		 }
	 
	 public static final Tipo Int   = new Tipo( "int",   Etiqueta.BASIC, 4 );
	 public static final Tipo Float = new Tipo( "int",   Etiqueta.BASIC, 8 );
	 public static final Tipo Char  = new Tipo( "int",   Etiqueta.BASIC, 1 );
	 public static final Tipo Bool   = new Tipo( "int",   Etiqueta.BASIC, 1 );

	 public static boolean numerico(Tipo p) { 
		 if (p == Tipo.Char || p == Tipo.Int || p == Tipo.Float) return true; 
		 else return false; 
	 }
	 
	 public static Tipo max(Tipo p1, Tipo p2) { 
		 if ( ! numerico(p1) || ! numerico(p2) ) return null; 
		 else if (p1 == Tipo.Float || p2 == Tipo.Float ) return Tipo.Float;
		 else if (p1 == Tipo.Int   || p2 == Tipo.Int ) return Tipo.Int;
		 else return Tipo.Char;
	 }
}
