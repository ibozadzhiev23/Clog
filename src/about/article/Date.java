package about.article;

import java.io.Serializable;

public class Date implements Serializable {

	String date;
	
	public Date(String date){
		this.date = date;
	}
	
	@Override
	public String toString(){
		return date;
	}
}
