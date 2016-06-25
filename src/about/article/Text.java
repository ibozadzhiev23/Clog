package about.article;

import java.io.Serializable;

public class Text implements Serializable {

	private static final long serialVersionUID = 1L;
	private Title title;
	private TextInhalt textInhalt;
	
	public Text(Title title , TextInhalt textInhalt){
		this.title = title;
		this.textInhalt = textInhalt;
	}
	
	@Override
	public String toString(){
		return "Title : " + title + "\n " + textInhalt;
	}
}
