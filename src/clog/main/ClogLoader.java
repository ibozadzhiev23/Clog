package clog.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ClogLoader {

	private File file;
	private ObjectInputStream inputStream;
	
	public ClogLoader(){
		file = new File("database.bin");
		try {
			FileInputStream fs = new FileInputStream(file);
			inputStream = new ObjectInputStream(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public ArticleStore load(){
		ArticleStore store = new ArticleStore();
		try {
			store = (ArticleStore) inputStream.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return store;
	}
	
	public void exists(ReadPrint io){
		if(!file.exists())
			io.println("Es gibt keine Datei zu laden!");
	}

}
