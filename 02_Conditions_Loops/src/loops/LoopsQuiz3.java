package loops;

import java.util.Scanner;

public class LoopsQuiz3 {

	public static void main(String[] args) {
		// Q3. 음수나 0을 입력할때까지 숫자를 계속 입력받고
		// 		음수나 0이 입력되면 지금까지 입력된 수의 총합과 평균을 구하세요
		
		boolean isInt = true;
		int num = 0, count = 0; // 이거 가능
		
		while (isInt) {
			Scanner sc = new Scanner(System.in);
			System.out.println("양수를 입력하세요");
			int inputNum = (int) sc.nextInt();
			if (inputNum > 0) {
				num += inputNum;
				count++;
			} else {
				System.out.println("지금까지의 총합은" + num + "입니다");
				System.out.println("지금까지의 평균은" + (double) num / count + "입니다");
				isInt = false;
			}
		}
		
	}

}
