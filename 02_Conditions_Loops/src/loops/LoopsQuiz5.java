package loops;

public class LoopsQuiz5 {

	public static void main(String[] args) {
		// Q5. (Optional)
		//		다음과 같이 출력되도록 하세요
		// 		ABCDEFGHIJKLMNOPQRSTUVWXYZ
		// 		ABCDEFGHIJKLMNOPQRSTUVWXY
		// 		ABCDEFGHIJKLMNOPQRSTUVWX
		// 		ABCDEFGHIJKLMNOPQRSTUVW
		// 		ABCDEFGHIJKLMNOPQRSTUV
		// 		ABCDEFGHIJKLMNOPQRSTU
		// 		ABCDEFGHIJKLMNOPQRST
		// 		ABCDEFGHIJKLMNOPQRS
		// 		ABCDEFGHIJKLMNOPQR
		// 		ABCDEFGHIJKLMNOPQ
		//		.....
		//		....
		// 		...
		//		A
		
//		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		for (int i = 0; i < str.length(); i++) {
//			System.out.println(str.substring(0, str.length() - i));
//		}
		
		for (int i = 0; i < 26; i++) {
			char a = 'A';
			for (int j = 0; j < 26 - i; j++) {
				System.out.print((char) (a+j));
			}
			System.out.println();
		}
		
		
	}

}
