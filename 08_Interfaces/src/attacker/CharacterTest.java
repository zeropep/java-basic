package attacker;

public class CharacterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit) {
			System.out.println("f는 Unit class의 자손입니다.");
		}
		if (f instanceof Fightable) {
			System.out.println("f는 Fightable interface의 자손입니다.");			
		}
		if (f instanceof Movable) {
			System.out.println("f는 Movable interface의 자손입니다.");			
		}
		if (f instanceof Attackable) {
			System.out.println("f는 Attackable interface의 자손입니다.");			
		}
		if (f instanceof Object) {
			System.out.println("f는 Object class의 자손입니다.");			
		}
		
	}

}
