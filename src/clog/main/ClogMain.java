package clog.main;

public class ClogMain {

	public static void main(String[] args){
		ClogMenu menu = new ClogMenu();
		menu.printMenu();
		int opt = menu.readOption();
		while(opt < 1 || opt > 5){
			menu.printMenu();
			opt = menu.readOption();
		}
		menu.chooseOption(opt);
		
	}
}
