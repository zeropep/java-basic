package abstracts;

import java.util.Scanner;

public class PlayGame {
	private Character character;
	private int menu;
	private boolean flag;
	boolean isContinue = true;
	
	public PlayGame(Character character) {
		this.character = character; // 생성된 캐릭터를 받는다.

	}
	
	public Character printMenu(Scanner sc) {
			System.out.println("1.EAT 2.SLEEP 3.PALY 4.TRAIN 0.ESC");
			menu = sc.nextInt();
			
			return character = playCharacter(sc);
	}

	private Character playCharacter(Scanner sc) {
			switch (menu) {
			case 1:
				character.eat();
				break;
			case 2:
				character.sleep();
				break;
			case 3:
				character.play();
				break;
			case 4:
				character.train();
				break;
				
			default:
				flag = true;
				return character;
		}
			return character;
	}

	public final Character getCharacter() {
		return character;
	}

	public final void setCharacter(Character character) {
		this.character = character;
	}

	public final int getMenu() {
		return menu;
	}

	public final void setMenu(int menu) {
		this.menu = menu;
	}

	public final boolean isFlag() {
		return flag;
	}

	public final void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
}
