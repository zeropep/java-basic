package conditions;

public class SwitchCase {

	public static void main(String[] args) {
		// 비교연산 => 정확하게 일치하는 값이 필요함
		String str = "Spring";
		
		switch (str) {
		case "Spring":
			System.out.println("This is spring");
			break;
		case "Summer":
			System.out.println("This is summer");
			break;
		case "Fall":
			System.out.println("This is fall");
			break;
		case "Winter":
			System.out.println("This is winter");
			break;

		default:
			System.out.println("state exact season");
			break;
		}

	}

}
