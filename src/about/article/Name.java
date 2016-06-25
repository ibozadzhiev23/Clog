package about.article;

import java.io.Serializable;

public class Name implements Serializable {

	private static final long serialVersionUID = 1L;
	String vorname;
	String nachname;
	
	public Name(String vorname , String nachname){
	this.vorname = vorname;
	this.nachname = nachname;
	}
	
	@Override
	public String toString(){
		return vorname + " " + nachname;
	}
}
