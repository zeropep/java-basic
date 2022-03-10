package abstract_hw;

public class GameStarter {
	
	public static void main(String[] args) {
		Character ch = null;
		PlayGame pg = null;
		Inventory inventory = new Inventory();
		
		ch = inventory.choiceCharacter(0);
		
		
		if (ch == null) {
			System.out.println("게임 종료 합니다.");
			return;
		} else {
			pg = new PlayGame(inventory, ch.getCno());
		}
		while (true) {
			pg.printMenu();
			
			if (pg.isFlag()) {
				System.out.println("게임을 종료합니다");
				break;
			}
		}
	}
}
