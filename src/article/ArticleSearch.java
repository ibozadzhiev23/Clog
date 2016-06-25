package article;

import java.util.ArrayList;

import about.article.CatchWord;
import clog.main.ReadPrint;

public class ArticleSearch {

	private ReadPrint io = new ReadPrint();
	private ArrayList<Article> articleList;
	
	public void run(ArrayList<Article> list){
		io.println("Geben Sie bitte das Schlagwort ein : ");
		CatchWord word = new CatchWord(io.next());
		ArrayList<Article> articleList = list;
		
		search(articleList);
	}
	
	public static void search(ArrayList<Article> articleList){
		for(Article a : articleList){
			a.print();		
		}
	}
}
