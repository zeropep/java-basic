package printEx;

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 복잡한 입력 과정을 기능하나로 압축해준 scanner
		// system.in 말고도 여러가지가 있지만 잘 안씀
		// scanner라는 클래스로 new라는 객체생성연산자를 사용해서 sc라는 이름의 객체를 만듦
		// scanner라는 클래스는 내가 만든것이 아니고, 만들었어도 위치를 찾을 수 없으므로
		// import로 해당 클래스를 가져와야 사용이 가능하다.
		
		System.out.println("say anything"); // 입력 안내문이 필요함
		String str = sc.next(); // 입력객체 안의 입력값을 가져오는 메서드 => 변수에 저장
		// 띄어쓰기 전까지 입력된 정보를 가져와줌.
		// 그 전까지는 입력 대기상태
		System.out.println("result: " + str); // 변수에 저장된 결과 출력
	}

}
