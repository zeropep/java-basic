package quiz_lecture;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 숫자 야구
		Scanner sc = new Scanner(System.in);
		int[] comNum = {0, 0, 0};
		int[] myNum = new int[3];
		int count = 0;
		
		for (int i = 0; i < comNum.length; i++) {
			comNum[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
		}
		for (int i : comNum) {
			System.out.print(i + " ");
		}
		System.out.println("\n 컴퓨터가 숫자를 정했습니다");
		while (true) {
			int strike = 0, ball = 0;
			System.out.println("숫자를 추측하세요");
			String myNumStr = sc.next();
			count++;
			String[] myNumArr = myNumStr.split("");
			for (int i = 0; i < myNumArr.length; i++) {
				myNum[i] = Integer.parseInt(myNumArr[i]);
			}
			
			for (int i = 0; i < comNum.length; i++) {
				for (int j = 0; j < myNum.length; j++) {
					if (comNum[i] == myNum[j] && i == j) {
						strike++;
					} else if (comNum[i] == myNum[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.print(count + "회 시도 : " + myNumStr);
			System.out.println(" > " + strike + "S" + ball + "B");
			
			if (strike == 3) {
				System.out.println("게임 종료");
				break;
			}
		}

	}

}
