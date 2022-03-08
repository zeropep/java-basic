package printEx;

public class DataTypeEx {

	public static void main(String[] args) {
		System.out.println("기본 데이터 타입(Primative Data Type");
		
		System.out.println("-----자주 사용하는 기본자료형-----");
		System.out.println("정수형 : int");
		System.out.println("int보다 큰 정수형 : long");
		System.out.println("실수형 : float, double");
		System.out.println("참거짓 : boolean");
		System.out.println("2byte 문자 : char");
		
		System.out.println("-----드물게 사용하는 기본자료형-----");
		System.out.println("1byte : byte"); // -128 ~ 127
		System.out.println("2byte : short"); // -32,768 ~ 32,767

		// JS의 데이터타입은 변수의 선언과 무관했지만
		// java는 선언할때부터 데이터 타입을 지정해주어야 한다.
		int num = 0; // 0 ~ 4byte의 크기 정수 (음, 양)
		double num2 = 0.0; // 0 ~ 8byte의 크기 실수 (음, 양)
		boolean flag = true; // true or false => 1bit (0과 1로 인식 안됨)
		char ch = 'A'; // 2byte의 크기 문자 => 반드시 홑 따옴표를 사용!
		
		long longNum = 123542351L;
		// 코드상으로 볼때 long인지 int인지 구분이 잘 안되기 때문에
		// 뒤에 L을 붙여서 long type이라고 알려줄 수 있다.
		// 이를 literal 표기법이라고 부른다.
		float floatNum = 3.11456158789845f;
		// 마찬가지의 literal 표기법으로 뒤에 f를 붙일 수 있다.
		// 0 ~ 4byte의 크기 실수 (음, 양)
		
		String str = "";
		// 기본 데이터 타입은 아니고 참조자료형임
		// 하지만 사용빈도가 높기 때문에 기본데이터 타입처럼 사용
		// String str = new String(); <= 원래 사용방식
		// 쌍따옴표를 사용해야하며 대문자로 시작해야 함
	}

}
