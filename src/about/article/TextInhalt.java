package about.article;

import java.io.Serializable;

public class TextInhalt implements Serializable {

	private static final long serialVersionUID = 1L;
	private String textInhalt ;
	
	public TextInhalt(String textInhalt){
		this.textInhalt = textInhalt;
	}
	
	@Override
	public String toString(){
		return textInhalt;
	}
}
