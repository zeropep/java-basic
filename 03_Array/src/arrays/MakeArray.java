package arrays;

public class MakeArray {

	public static void main(String[] args) {
		// 배열은 타입과 크기가 설정되어야 한다. (중요)
		
		boolean[] boolArr; // 배열의 선언
		boolArr = new boolean[5]; // 변수를 사용할 때는 반드시 크기가 정해진 형태로 사용하여야 한다.
		int[] intArr = new int[12]; // 배열의 선언 및 초기화
		String[] strArr = {"Zero", "One", "Two", "Three", "Four"}; // 배열의 선언 및 초기화 with value
		
		double doubleArr[] = new double[10];
		
		// 배열의 인덱스 번호는 0번부터 시작
		// 배열의 마지막 인덱스 번호는 항상 배열의 길이에서 -1을 한 값
		System.out.print("[");
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.floor(Math.random() * 100)) + 1;
			System.out.print(intArr[i] + ", ");
		}
		System.out.print("]");
		
		System.out.println("\n" + intArr); // [I@626b2d4a => java에서 관리하는 객체의 주솟값(reference값)
		System.out.println(intArr.toString()); // [I@626b2d4a => 어쨋든 java는 객체라는 사실만 알려줌

	}

}
