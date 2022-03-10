package abstract_hw;

import java.util.Scanner;

public class PlayGame {
//	private Character character;
	private int menu;
	private boolean flag;
	private Inventory inventory;
	private int cno;
	
	public PlayGame(Inventory inventory, int cno) {
		this.inventory = inventory;
		this.cno = cno;
//		this.character = character; // 생성된 캐릭터를 받는다.
	}
	
	public void printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.EAT  2.SLEEP  3.PlAY  4.TRAIN  5.CHANGE  0.EXIT");
		menu = sc.nextInt();
		
		playCharacter();
	}

	private void playCharacter() {
		Character character = inventory.getCharacter(cno);
		switch (getMenu()) {
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
		case 5:
			character = inventory.choiceCharacter(0);
			setCno(character.getCno());
			break;
		default:
			setFlag(true);
			break;
		}
		character.printStatus();
	}

	public final void setCno(int cno) {
		this.cno = cno;
	}

	public int getMenu() {
		return menu;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
}
