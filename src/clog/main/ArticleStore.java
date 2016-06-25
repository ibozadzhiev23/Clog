package clog.main;

import java.util.ArrayList;

import about.article.CatchWord;
import article.Article;


public class ArticleStore{

	private ReadPrint io; 
	private ArrayList<Article> store;
	
	public ArticleStore(){
		store = new ArrayList<>();
		io = new ReadPrint();
	}
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
