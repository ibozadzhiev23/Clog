package clog.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ClogSaver {

	private final File file = new File("database.bin");
	private ObjectOutputStream oos;
	
	public ClogSaver(){
		try {
			FileOutputStream fs = new FileOutputStream(file);
			oos = new ObjectOutputStream(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void save(ArticleStore store){
		try {
			
			oos.writeObject(store);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
