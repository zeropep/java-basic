package printEx;

public class PrintEx {

	public static void main(String[] args) {
		System.out.print("first line\n"); // 개행효과가 없음
		System.out.print("next line"); 
		System.out.println("fist line"); // 개행효과가 있음
		System.out.println("next line");
		// main의 메서드는 public으로 시작하는 class 의 소속이어야 한다.
		// public이라는 것은 어디서도 볼수있는 open형식이라는 것이다.
		// main을 실행시키기 위해서는 main();으로는 불가능함
		// jvm이 내가 실행시킨 위치에서 main을 찾음 
		// 이 때 jvm이 외부요소이기 때문에 public속성을 가져야하는 것이다.
		// 상단 메뉴에서 run 또는 cntl + f11
		System.out.println(100); // 단축키는 syso + cntl + spacebar
		System.out.println(true);
		System.out.println(101.1);
		System.out.println();
		// java는 어떤 데이터타입을 사용할 것인지 미리 정해야 한다.
	}
}
