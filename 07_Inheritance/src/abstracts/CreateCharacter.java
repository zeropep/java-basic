package abstracts;

import java.util.Scanner;

public class CreateCharacter {
	protected Character character;
	
	public CreateCharacter() {}
	
	public Character newCharacter(Scanner sc) {
		System.out.println("원하는 캐릭터를 선택하세요 > ");
		System.out.println("1. 피카츄 2. 꼬부기 3. 이상해씨 4. 파이리");
		int chNum = sc.nextInt();
		System.out.println("캐릭터 이름을 입력하세요");
		String name = sc.next();

		switch (chNum) {
		case 1:
			return new Picachu(name);
		case 2:
			return new Squirtle(name);			
		case 3:
			return new Bulbasaur(name);						
		case 4:
			return new Charmander(name);									
			
		default:
			System.out.println("캐릭터를 잘못 선택하였습니다.");
			return null;
		}
	}
}
