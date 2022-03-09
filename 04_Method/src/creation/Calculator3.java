package creation;

import java.util.Scanner;

class CalculatorEngine {
	
//	public CalculatorEngine() {
//		// 외부에서 접근해야 하므로 public이다.
//		// 객체 생성만을 담당하므로 리턴값이 필요없다.	
//	}
	
	public CalculatorEngine() {
		int[] datas = getDatas();
		
		String result = operation(datas);
		
		printCalResult(datas, result);	
	}
	
	void printCalResult(int[] datas, String result) {
		String oper = datas[datas.length-1] == 1 ? " + "
				: datas[datas.length-1] == 2 ? " - "
				: datas[datas.length-1] == 3 ? " * "
				: datas[datas.length-1] == 4 ? " / "
				: " % ";
		System.out.println(datas[0] + oper + datas[1] + " = " + result);
		
	}
	
	String operation(int[] datas) {
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

	int[] getDatas() {
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
	// default packaging
	// 같은 package에서만 사용가능함
	// private과 static이 없고 그 자리에 default가 생략되어있다.
}

public class Calculator3 {

	public static void main(String[] args) {
//		CalculatorEngine ce = new CalculatorEngine(); 
		// calculatorengine class 타입의 변수 ce를 만들고 싶고, new라는 객체생성 연산자를 통해 instance화 했음.
		// String str = new String("String"); 얘랑 똑같다.
		// 생성자 : 객체 생성을 담당하는 역할 => CalculatorEngine() 이 부분
		// 논리적으로 생각하면, 객체를 생성해야 하므로, 해당 class 내부에 존재해야 한다. => line 7 ~ 10
		// 그런데 new 라는 객체생성 연산자가 존재하므로 저 constructor는 존재의 의미가 없다.
		// 그러므로 생략이 가능하다. => default constructor

//		int[] datas = ce.getDatas();
//		
//		String result = ce.operation(datas);
//		
//		ce.printCalResult(datas, result);
		
		new CalculatorEngine();
	}
		
	

}
