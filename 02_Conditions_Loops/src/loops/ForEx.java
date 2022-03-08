package loops;

import java.util.Iterator;
import java.util.Scanner;

public class ForEx {
	
	public static void main(String[] args) {
		// for 문은 (초기값; 조건식; 증감식)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단 입력");
		int dan = (int) sc.nextInt();
		
		for (int i = 2; i < 10; i++) {
			System.out.println(dan + "x" + i + "=" + (dan * i));
			
		}
	}

}
