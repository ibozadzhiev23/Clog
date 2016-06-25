package about.article;

import java.io.Serializable;

public class Place implements Serializable {

	private static final long serialVersionUID = 1L;
	String place ;
	
	public Place(String place){
		this.place = place;
	}
	
	@Override
	public String toString(){
		return place;
	}
}
