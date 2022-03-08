package printEx;

public class TypeConversion {

	public static void main(String[] args) {
		// 타입변환의 이해
		// 형식과 크기의 다름에서 시작된다.
		
		// Casting => 타입의 변환 방식
		// auto casting (자동형변환) : widening casting
		// byte -> short -> char -> int -> long -> float -> double
		
		byte b1 = 1;
		short s1 = b1; // 문제없음, 묵시적 형변환
		char ch1 = (char)s1; // 그냥 s1은 불가능 => 크기는 괜찮지만 문자인지 숫자인지 구별이 불가하므로 (char)를 붙여줌, 명시적 형변환
		int i1 = ch1;
		long l1 = i1;
		float f1 = l1;
		double d1 = f1;
		
		// manual casting (강제형변환) : narrowing casting
		// 자동형변환의 방향을 반대로 시도
		double d2 = 3.14;
		float f2 = (float)d2; // 데이터의 크기가 달라서 명확히 타입의 변환을 기재
		long l2 = (long)f2;
		int i2 = (int)l2;
		char ch2 = (char)i2; // 실행했을 때 i2의 크기로 char가 표현되지 못할 가능성이 있음.
		short s2 = (short)ch2;
		byte b2 = (byte)s2;
		
		// string을 number로
		String str = "1234567";
		int num = Integer.parseInt(str);
		
		// number를 string으로
		int num2 = 1234556;
		String str2 = String.valueOf(num2);
		String str3 = Integer.toString(num2);

	}

}
