package loops;

import java.util.Scanner;

public class LoopsQuiz4 {

	public static void main(String[] args) {
		// Q4. 컴퓨터가 랜덤으로 1~100 사이의 정수를 정하면
		// 		맞추는 게임을 구현하세요 
		// 		컴퓨터의 수보다 높은 수를 입력하면 > 더 낮은 수를 입력하세요
		//		컴퓨터의 수보다 낮은 수를 입력하면 > 더 높은 수를 입력하세요
		
		boolean isStillTry = true;
		int count = 0;
		int comNum = (int) Math.floor(Math.random() * 100 + 1);
		System.out.println("랜덤한 숫자가 생성되었습니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 맞춰보세요");
		do {
			int myNum = (int) sc.nextInt();
			count++;
			if (myNum > comNum) {
				System.out.println("더 낮은 수를 입력하세요");
			} else if (myNum < comNum) {
				System.out.println("더 높은 수를 입력하세요");
			} else {
				System.out.println("정답입니다");
				System.out.println(count + "회 시도하셨습니다.");
				isStillTry = false;
			}
			
		} while (isStillTry);
		
		
	}

}
