package clog.main;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import about.article.CatchWord;

public class ReadPrint {

	private static Scanner in = new Scanner(System.in);
	private PrintStream out = System.out;
	
	public int nextInt(){
		return in.nextInt();
	}
	
	public String next(){
		return in.next();
	}
	
	public String nextLine(){
		return in.nextLine();
	}
	
	public void println(String text){
		out.println(text);
	}
	
	public  String readText(){
		String text = "";
		in.nextLine();
		String line = in.nextLine();
		while(!(line.equals(""))){
			text += line + "\n";
			line = in.nextLine();
		}
		return text; 
	}
	
	public ArrayList<CatchWord> readWords(){
		ArrayList<CatchWord> wordsList = new ArrayList();
		String word = in.next();
		while(!(word.equals("exit"))){
			wordsList.add(new CatchWord(word));
			word = in.next();
		}
		return wordsList;
	}
}
