package clog.main;

import java.util.ArrayList;

import about.article.CatchWord;
import article.Article;
import article.ArticleSearch;

public class ClogMenu {

	private static ReadPrint io;
	private static ArticleWritter aw;
	private static ArticleStore store;
	
	public ClogMenu(){
		io = new ReadPrint();
		aw = new ArticleWritter();
		store = new ArticleStore();
	}
	
	public static void printMenu(){
		io.println("Waehlen Sie eine der folgenden Optionen aus : ");
		io.println("1) Clog Eintrag erzeugen");
		io.println("2) Clog ausgeben");
		io.println("3) Clog laden");
		io.println("4) Clog speichern");
		io.println("5) Programm beenden");
	}
	
	public static int readOption(){
		return io.nextInt();
	}
	
	public static void chooseOption(int opt){
		switch(opt){
		case 1:
			Article a = aw.makeArticle();
			store.store(a);
			printMenu();
			chooseOption(readOption());
			break;
		case 2:
			if(store.size() == 0){
				io.println("Es Gibt keine Eintraege");
				printMenu();
				chooseOption(readOption());
				break;
			}
			io.println("Geben Sie bitte das Schlagwort ein : ");
			CatchWord word = new CatchWord(io.next());
			if(!store.search(word))
				io.println("Es gibt keine Eintraege mit diesem Schlagwort");
			printMenu();
			chooseOption(readOption());
			break;
		case 3:
			
			break;
		case 4:
			break;
		case 5:
			io.println("Exit");
			System.exit(0);
		}
	}
	
}
