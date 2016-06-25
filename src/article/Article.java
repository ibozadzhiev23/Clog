package article;

import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;

import about.article.CatchWord;
import about.article.Text;

public class Article implements Serializable {

	private Text text;
	protected TextInfo info;
	
	public Article(TextInfo info,Text text){
		this.info = info;
		this.text = text;
	}
	
	public void print(){
		PrintStream print = System.out;
		print.println(info);
		print.println(text);
	}
	
	public boolean hasWords(CatchWord word){
		boolean hasWord = false;
		ArrayList<CatchWord> wordsList = new ArrayList<CatchWord>();		
		wordsList = info.words;
		for(CatchWord wordFromList : wordsList){
			if(word.equals(wordFromList)) hasWord = true; 
		}
		return hasWord;
	}
	
}
