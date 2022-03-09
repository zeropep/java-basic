package resursion;

public class RecursionMethodEx1 {

	public static void main(String[] args) {
		// 반복 종료조건과 반복 수행조건이 필요함
		int sum = recursion(10);
		System.out.println(sum);
	}

	private static int recursion(int i) {
		if (i > 0) {
			// 내가 더할 값이 있다.
			return i + recursion(i-1);
		} else {
			// 더할 값이 없다.
			return 0;
		}
	}

}
