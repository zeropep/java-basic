package tryCatch;

public class ArrayException {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		try {
			for (int i = 0; i < arr.length + 1; i++) {
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			// error 조차 class화 되어있음
			// Exception? 모든 exception의 최상위 객체
			e.printStackTrace();
			continueMethod();
		} finally {
			// stream관계에서 연결을 끊는 역할
			continueMethod();
		}
	}

	private static void continueMethod() {
		System.out.println("예외가 발생했어요...");
	}

}
