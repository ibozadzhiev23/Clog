package about.article;

import java.io.Serializable;

public class Title implements Serializable {

	private static final long serialVersionUID = 1L;
	private String title;
	public Title(String title){
		this.title = title;
	}
	
	@Override
	public String toString(){
		return title;
	}
}
