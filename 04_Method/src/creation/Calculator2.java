package creation;

import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {

		int[] datas = getDatas();
		
		String result = operation(datas);
		
		printCalResult(datas, result);
	}
		
	private static void printCalResult(int[] datas, String result) {
		String oper = datas[datas.length-1] == 1 ? " + "
				: datas[datas.length-1] == 2 ? " - "
				: datas[datas.length-1] == 3 ? " * "
				: datas[datas.length-1] == 4 ? " / "
				: " % ";
		System.out.println(datas[0] + oper + datas[1] + " = " + result);
		
	}

	private static String operation(int[] datas) {
		String result = "";
		switch (datas[datas.length-1]) {
		case 1: 
			result = String.valueOf(datas[0] + datas[1]);
			break;
		case 2: 
			result = String.valueOf(datas[0] - datas[1]);
			break;
		case 3: 
			result = String.valueOf(datas[0] * datas[1]);
			break;
		case 4: 
			result = String.valueOf((double) datas[0] / datas[1]);
			break;
		case 5: 
			result = String.valueOf(datas[0] % datas[1]);
			break;
		
		default:
			
			break;
		}
		return result;
	}

	private static int[] getDatas() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 계산기 프로그램 =====");
		System.out.println("연산을 선택하세요 > ");
		System.out.println("+, -, *, /, %");
		String oper = sc.next();
		
		System.out.println("첫번째 숫자 > ");
		int num1 = sc.nextInt();
		System.out.println("첫번째 숫자 > ");
		int num2 = sc.nextInt();
		int num3 = oper.equals("+") ? 1 
				: oper.equals("-") ? 2
				: oper.equals("*") ? 3
				: oper.equals("/") ? 4
				: 5;
		
		int[] datas = {num1, num2, num3};
		
		return datas;
	}

}
