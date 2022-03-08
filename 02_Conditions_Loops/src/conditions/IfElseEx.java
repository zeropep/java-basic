package conditions;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("now?");
		int nowHour = sc.nextInt();

		if (nowHour < 9) {
			System.out.println("good morning");
		} else {
			System.out.println("wake up");

			if (nowHour < 13) {
				System.out.println("good afternoon");
			} else {
				System.out.println("hi");
			}
		}

		// if > else > if else

		System.out.println("vaccinated? > y, n, w");
		String ans = sc.next();
		if (ans.equals("y")) {
			System.out.println("good");
		} else if (ans.equals("n")) {
			System.out.println("why not?");
		} else {
			System.out.println("interesting");
		}
	}

}
