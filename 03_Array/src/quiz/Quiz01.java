package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 24절기 맞추기 게임
		String[] seasonal = {
				"입춘", "우수", "경칩", "춘분", 
				"청명", "곡우", "입하",
				"소만","망종","하지","소서","대서",
				"입추","처서","백로","추분",
				"한로","상강","입동",
				"소설","대설","동지","소한","대한" 
		};
		// ? 번째 절기는 무엇입니까 >
		// 몇 번 시도했는지도 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 번째 절기가 궁금한가요?");
		int num = (int) sc.nextInt() - 1;
		if (num >= 0 && num < seasonal.length) {
			System.out.println(seasonal[num]);			
		} else {
			System.out.println("1 ~ 24 사이의 숫자를 입력하세요");
		}


	}

}
