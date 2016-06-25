package article;

import java.io.Serializable;
import java.util.ArrayList;

import about.article.Autor;
import about.article.CatchWord;
import about.article.Date;

public class TextInfo implements Serializable{

	private Autor autor;
	private Date date;
	protected ArrayList<CatchWord> words;
	
	public TextInfo(Autor autor ,Date date, ArrayList<CatchWord> words){
		this.autor = autor;
		this.date = date;
		this.words = words;
	}
	
	@Override
	public String toString(){
		return "Von : " + autor + "\n Datum : " + date + "\n Schlagwoerter : " + words;
	}
}
