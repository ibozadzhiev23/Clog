package clog.main;

import java.io.Serializable;
import java.util.ArrayList;

import about.article.CatchWord;
import article.Article;


public class ArticleStore implements Serializable{

	private ArrayList<Article> store = new ArrayList<>();
	
	public void store(Article a){
		store.add(a);
	}
	
	public int size(){
		return store.size();
	}
	
	public boolean search(CatchWord w){
		boolean hasW = false;
		for(Article a : store){
			if(a.hasWords(w)){
				hasW = true;
				a.print();
			}		
		}
		return hasW;
	}
}
