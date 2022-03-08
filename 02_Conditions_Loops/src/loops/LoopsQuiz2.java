package loops;

import java.util.Scanner;

public class LoopsQuiz2 {

	public static void main(String[] args) {
		// Q2. 3자리 이상의 정수 L, 정수 a, 정수 b를 입력받아
		//		L까지 a, b의 배수 갯수를 구하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("3자리 이상의 정수");
		int L = (int) sc.nextInt();
		System.out.println("정수 a");
		int a = (int) sc.nextInt();
		System.out.println("정수 b");
		int b = (int) sc.nextInt();
		
		int count = 0;
		
		for (int i = 1; i < L + 1; i++) {
			if (L > 99) {
				if (i % a == 0 || i % b == 0) {
					System.out.println(i + " ");
					count++;
				}
			} else {
				System.out.println("세자리 이상의 정수를 입력하세요");
			}
		}
			
		}

}
