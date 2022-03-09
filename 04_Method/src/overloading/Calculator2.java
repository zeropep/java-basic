package overloading;

import java.util.Scanner;

class Operation {
	
	void operation(double num1, double num2) {
		System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));
		
	}

	void operation(double num1, int num2) {
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		
	}

	void operation(int num1, double num2) {
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		
	}

	void operation(int num1, int num2, String oper) {
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		
	}

	void operation(int num1, int num2) {
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
	}

}

public class Calculator2 {

	public static void main(String[] args) {
		// method overloading 사용하기
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 계산기 프로그램 =====");
		System.out.println("연산을 선택하세요 > ");
		System.out.println("+, -, *, /, %");
		String oper = sc.next();
		
		System.out.println("첫번째 숫자 > ");
		int num1 = sc.nextInt();
		System.out.println("첫번째 숫자 > ");
		int num2 = sc.nextInt();
		
		Operation op = new Operation();
		
		switch (oper) {
		case "+": 
			op.operation(num1, num2);
			break;
		case "-": 
			op.operation(num1, num2, oper);
			break;
		case "*": 
			op.operation(num1, num2);
			break;
		case "/": 
			op.operation((double) num1, num2);
			break;
		case "%": 
			op.operation((double) num1, (double) num2);
			break;
		
		default:
			
			break;
		}

	}

	
}
