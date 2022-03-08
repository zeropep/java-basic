package conditions;

import java.util.Scanner;

public class FinancialPlan {

	public static void main(String[] args) {
		// 1. 꼭 구매하고 싶은 것 입력받기 ex) 아파트, 자동차..
		// 2. 구매할 대상의 가격 입력 받기
		// 3. 미래에 수령할 월급 입력받기 => 현실적으로 입력
		// 4. 월급의 몇 %를 저축할지? => 현실적으로
		// 5. 대상을 구매하기 위해 소요되는 기간 구하기 (월, 년 상관없음)
		// 6. 연 이율은 적금을 기준으로 2.5% 가정
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사고싶은 것");
		String wishItem = sc.next();
		System.out.println("대상의 가격");
		int price = (int) sc.nextInt();
		System.out.println("월급");
		int payment = (int) sc.nextInt();
		System.out.println("저축률(%)");
		double saveRatio = sc.nextDouble();
		
		// 총수령액(T) = (월납입금(A) x 납입월[n]) + 월납입금(A) x (납입월[n](납입월[n]+1/2) x (연이율[r]/12) => 단리적금

		double t = 0;
		int n = 0;
		final double A = payment * (saveRatio / 100);
		
		do {
			t = (A * n) + (A * (n * (n + 1) / 2) * (2.5 / 100 / 12));
			n++;
		} while (t < price);
		System.out.println(wishItem + "을 사기위한 최소 저축 개월수 : " + n + "개월");
		
	}

}
