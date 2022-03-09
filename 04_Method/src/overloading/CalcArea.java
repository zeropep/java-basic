package overloading;

public class CalcArea {

	public static void main(String[] args) {
		// 비슷한 기능을 grouping하기 => overloading
		// params의 갯수나 순서가 달라도 기능이 같으면 같은 그룹으로 인식
		// 다시말하자면, 이름이 같은 method여도 params의 모양이 다르면 서로다른 method로 인식함.
		// method에서 name을 만드는 부담이 덜어짐
		
		// 사각형
		int width = 100;
		double height = 40;
		area(width, height);
		
		//삼각형
		double bottom = 100;
		int height2 = 30;
		area(bottom * 0.5, height2);
		
		//원
		double r = 2.5;
		final double PI = 3.14;
		area(r * r, PI);

	}
	private static void area(double r, double PI, String str) {
		System.out.println("원의 넓이 : " + r * PI);
		
	}

	private static void area(double r, double PI) {
		System.out.println("원의 넓이 : " + r * PI);
		
	}

	private static void area(double bottom, int height2) {
		System.out.println("삼각형의 넓이 : " + bottom * height2);
		
	}

	private static void area(int width, double height) {
		System.out.println("사각형의 넓이 : " + width * height);
	}

}
