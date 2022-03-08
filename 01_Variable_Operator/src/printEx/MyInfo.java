package printEx;

import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		String name = "park";
		int age = 28;
		float height = 170.5f;
		double weight = 64.325;
		char blood = 'O';
		// char는 문자 하나만 가능한데 이유는..아마 아스키코드로 숫자를 넣어 문자를 받을수있게 해놓은것이지 않을까...연산의 효율
		boolean vaccine = true;
		long assets = 4325000000L;
		String description = "현재는 openAPI 수업중";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("다음 멤버의 정보를 입력하세요");
		System.out.println("이름 > ");
		name = sc.next();
		System.out.println("나이 > ");
		age = sc.nextInt();
		System.out.println("키 > ");
		height = sc.nextFloat();
		System.out.println("몸무게 > ");
		weight = sc.nextDouble();
		System.out.println("혈액형 > ");
		blood = sc.next().charAt(0);
		System.out.println("백신 > ");
		vaccine = sc.nextBoolean();
		System.out.println("자산 > ");
		assets = sc.nextLong();
		System.out.println("부가정보 > ");
		description = sc.nextLine();
		
		System.out.printf("%s, %d, %f, %f, %s, %s, %d, %s", name, age, height, weight, blood, vaccine, assets, description);
		// 정수 d 소수 f  => c언어에서 사용하는 포맷형
	}

}
