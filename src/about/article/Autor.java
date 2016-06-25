package about.article;

import java.io.Serializable;

public class Autor implements Serializable {

	private Name name;
	private Place place;
	
	public Autor(Name name,Place place){
		this.name = name;
		this.place = place;
	}
	
	@Override
	public String toString(){
		return name + "\n Wohnort : " + place;
	}
}
