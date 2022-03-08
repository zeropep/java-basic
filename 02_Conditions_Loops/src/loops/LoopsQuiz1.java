package loops;

import java.util.Scanner;

public class LoopsQuiz1 {

	public static void main(String[] args) {
		// Q1. for문을 활용하여 x의 y승을 구하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x의 값");
		int x = (int) sc.nextInt();
		System.out.println("y의 값");
		int y = (int) sc.nextInt();
		int z = 1;
		for (int i = 0; i < y; i++) {
			z *= x;
		}
		System.out.println(z);
		
		// 그냥 pow를 써도 가능하다
		double result = Math.pow((int)x, (int)y);
		System.out.println(result);
		
		
	}

}
