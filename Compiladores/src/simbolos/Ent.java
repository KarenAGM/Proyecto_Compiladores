package simbolos;

import java.util.*;
import analizadorlexico.*;
import inter.*;

public class Ent {
	private Hashtable tabla;
	protected Ent ant;
	
	public Ent(Ent n) {
		tabla = new Hashtable();
		ant = n;
	}
	public void put(Token w, Id i) {
		tabla.put(w, i);}
	
	public Id get(Token w) {
		for (Env e = this; e != null ; e = e.ant) {
			Id enconto = (Id)(e.tabla.get(w));
			if(encontro != null) return encontro;
		}
		return null;
	}	
}

