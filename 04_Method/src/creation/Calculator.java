package creation;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 계산기 프로그램 =====");
		System.out.println("연산을 선택하세요 > ");
		System.out.println("+, -, *, /, %");
		String oper = sc.next();
		
		System.out.println("첫번째 숫자 > ");
		int num1 = sc.nextInt();
		System.out.println("첫번째 숫자 > ");
		int num2 = sc.nextInt();
		
		switch (oper) {
		case "+": 
			addition(num1, num2);
			break;
		case "-": 
			int result = substraction(num1, num2);
			System.out.println(num1 + "-" + num2 + "=" + result);
			break;
		case "*": 
			int[] numArr = {num1, num2};
			int result2 = multiplation(numArr); // 얘한테 바로 array를 던질 수 없다.
			break;
		case "/": 
			division(num1, num2, oper);
			break;
		case "%": 
			double[] result3 = modulus(num1, num2);
			break;
		
		default:
			
			break;
		}

	}

	private static double[] modulus(int num1, int num2) {
		double[] results = new double[2];
		results[0] = (double) num1 / num2;
		results[1] = num1 % num2;
		return results;
	}

	private static void division(int num1, int num2, String oper) {
		System.out.println(num1 + " " + oper + " " + num2 + "=" + (double)num1 / num2);
	}

	private static void addition(int num1, int num2) {
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}

	private static int substraction(int num1, int num2) {
		return num1 - num2;
	}
	
	private static int multiplation(int[] numArr) {
		// TODO Auto-generated method stub
		return numArr[0] * numArr[1];
	}

}
