package clog.main;

import java.util.ArrayList;

import about.article.Autor;
import about.article.CatchWord;
import about.article.Date;
import about.article.Name;
import about.article.Place;
import about.article.Text;
import about.article.TextInhalt;
import about.article.Title;
import article.Article;
import article.TextInfo;

public class ArticleWritter {
	private ReadPrint io = new ReadPrint();
	
	public Article makeArticle(){
		io.println("Vorname : ");
		String vorname = io.next();
		io.println("Nachname : ");
		String nachname = io.next();
		io.println("Wohnort  :");
		Place place = new Place(io.next());
		Name autorName = new Name(vorname,nachname);
		Autor autor = new Autor(autorName , place);
		io.println("Datum (dd.mm.yyyy) : ");
		Date date = new Date(io.next());
		io.println("Titel : ");
		Title title = new Title(io.next());
		io.println("Text : ");
		TextInhalt textInhalt = new TextInhalt(io.readText());
		io.println("Schlagwoerter : ");
		ArrayList<CatchWord> words = io.readWords();
		TextInfo textInfo = new TextInfo(autor,date ,words );
		Text text = new Text(title ,textInhalt);
		Article article = new Article(textInfo ,text);
		return article;
	}
	
}
