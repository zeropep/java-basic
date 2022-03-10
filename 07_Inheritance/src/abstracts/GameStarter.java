package abstracts;

import java.util.Scanner;

class RunGame {
	Scanner sc = new Scanner(System.in);
	Character[] ch = new Character[3];
	PlayGame pg = null;
	CreateCharacter cc = null;
	boolean endSignal = true;
	boolean isCreate = true;
	boolean play = true;
	boolean initial = true;
	int playable = 0;
	int playNow = 0;
	int endMenu = 0;
	
	public RunGame() {
		gameStart();
	}
	
	public void gameStart() {
		while (endSignal) {
			startNewGame();
			
			while (play) {
				pg.setFlag(false);
				initialMsg(initial);
				pg = new PlayGame(ch[playNow]);
				ch[playNow] = pg.printMenu(sc);
				ch[playNow].printStatus();
				
				if (pg.isFlag()) {
					SelectMainMenu(sc);
				}
			}
		}
	}

	private void initialMsg(boolean initial2) {
		if (initial) {
			System.out.println("현재 " + (playNow + 1) + "번 캐릭터입니다.");
			ch[playNow].printStatus();
			initial = false;
		}
		
	}

	private void SelectMainMenu(Scanner sc) {
		System.out.println("원하는 메뉴를 선택하세요");
		System.out.println("1.다른 캐릭터 이어하기  2.새 캐릭터 만들기  3.종료하기");
		endMenu = sc.nextInt();
		
		switch (endMenu) {
		case 1:
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] != null) {
					System.out.print((i + 1) + "번 캐릭터 (" + ch[i].name);
					System.out.print(", level: " + ch[i].level + ") \n");
				}
			}
			playNow = sc.nextInt() - 1;
			play = false;
			initial = true;
			break;
		case 2:
			System.out.println("새로운 캐릭터를 만듭니다.");
			playNow = playable;
			isCreate = true;
			play = false;
			initial = true;
			break;
			
		default:
			System.out.println("게임 종료");
			play = false;
			endSignal = false;
			break;
		}
	}

	private void startNewGame() {
		if (isCreate) {
			cc = new CreateCharacter();
			ch[playable] = cc.newCharacter(sc);

			if (ch[0] == null) {
				System.out.println("게임 종료");
				endSignal = false;
			} else {
				pg = new PlayGame(ch[playable]);
			}
			playable++;
			isCreate = false;
		}
		play = true;
	}
}

public class GameStarter {
	// 2021-11-11 주말과제
	// 나머지 캐릭터를 생성하는 코드와 각 캐릭터 클래스를 만드세요
	// 현재는 게임을 종료하면 생성한 캐릭터가 사라지고 다시 게임을 시작하면 초기화됩니다.
	// 이 구조에서 게임 종료 전에 캐릭터를 변경선택할 수 있는 구조로 만들고
	// 각 캐릭터들은 게임종료 전에는 캐릭터의 정보값이 초기화 되지 않고 사용할 수 있게 만드세요
	// 필요한 추상클래스, 클래스를 더 만드는 것도 가능합니다.
	// midaseye@naver.com > _java_hw_20211115_이름.zip > 월요일 수업 시작 전까지

	public static void main(String[] args) {
			RunGame run = new RunGame();			
	}
}
