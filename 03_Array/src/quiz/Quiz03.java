package quiz;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Quiz03 {

	public static void main(String[] args) {
		// 숫자 야구 게임
//		int[] arr = {1, 2, 3};
//		System.out.println(IntStream.of(arr).anyMatch(x -> x == 1));
		
		// 답 만들기
		int[] answer = new int[3];
		
		for (int i = 0; i < answer.length; i++) {
			int num = (int) Math.floor(Math.random() * 9) + 1;
			if (IntStream.of(answer).anyMatch(x -> x == num)) {
				i--;
			} else {
				answer[i] = num;
			}
		}
		
		// 답
		System.out.print("[");
		for (int i : answer) {
			if (i != answer[answer.length - 1]) {
				System.out.print(i + " ");							
			} else {
				System.out.print(i);	
			}
		}
		System.out.print("]\n");
		
		// 입력받기
		int[] userTry = new int[3];
				
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while (true) {
			count++;
			
			for (int i = 0; i < answer.length; i++) {
				System.out.println((i + 1) + "번 째 숫자를 입력하세요");
				int userNum = (int) sc.nextInt();
				if (userNum > 0 && userNum < 10) {
					userTry[i] = userNum;					
				} else {
					System.out.println("1 ~ 10 사이의 숫자를 입력하세요");
					i--;
				}
			}
			
			int strike = 0;
			int ball = 0;
			
			for (int k = 0; k < answer.length; k++) {
				for (int j = 0; j < userTry.length; j++) {
					if (answer[k] == userTry[j] && k == j) {
						strike++;
						break;
					} else if (answer[k] == userTry[j] && k != j) {
						ball++;
						break;
					}
				}			
			}
			
			if (strike == 3) {
				System.out.print(count + "번 째 시도 [");
				for (int i : userTry) {
					if (i != userTry[userTry.length - 1]) {
						System.out.print(i + " ");							
					} else {
						System.out.print(i);	
					}			
				}
				System.out.print("] 축하합니다. 정답입니다. \n");
				break;
			} else if (strike > 0 || ball > 0) {
				System.out.print(count + "번 째 시도 [");
				for (int i : userTry) {
					if (i != userTry[userTry.length - 1]) {
						System.out.print(i + " ");							
					} else {
						System.out.print(i);	
					}			
				}
				System.out.print("] " + strike + "S " + ball + "B \n");
			} else {
				System.out.print(count + "번 째 시도 [");
				for (int i : userTry) {
					if (i != userTry[userTry.length - 1]) {
						System.out.print(i + " ");							
					} else {
						System.out.print(i);	
					}			
				}
				System.out.print("] OUT! \n");
			}
			
		}

	}
}
