package conditions;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class RSPGame3 {

	public static void main(String[] args) {
		// 가위바위보
		
		// 1. 컴퓨터는 랜덤으로 선택
		// 2. 나도 가위바위보 중 하나 입력
		// 3. 가위바위보를 비교
		
		int com = (int) Math.floor((Math.random() * 3));
		Scanner sc = new Scanner(System.in);
		System.out.println("가위=0, 바위=1, 보=2 ?");
		int me = (int) sc.nextInt();
		System.out.println("com = " + com);
		
		if (com == 0) {
			if (me == 0) {
				System.out.println("비겼습니다.");
			} else if (me == 1) {
				System.out.println("이겼습니다");
			} else {
				System.out.println("졌습니다.");
			}
		} else if (com == 1) {
			if (me == 1) {
				System.out.println("비겼습니다.");
			} else if (me == 2) {
				System.out.println("이겼습니다");
			} else {
				System.out.println("졌습니다.");
			}
		} else {
			if (me == 2) {
				System.out.println("비겼습니다.");
			} else if (me == 0) {
				System.out.println("이겼습니다");
			} else {
				System.out.println("졌습니다.");
			}
		}
		

	}

}
