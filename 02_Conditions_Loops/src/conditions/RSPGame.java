package conditions;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class RSPGame {

	public static void main(String[] args) {
		// 가위바위보
		
		// 1. 컴퓨터는 랜덤으로 선택
		// 2. 나도 가위바위보 중 하나 입력
		// 3. 가위바위보를 비교
		
		int comNum = (int) Math.floor((Math.random() * 3));
		Scanner sc = new Scanner(System.in);
		System.out.println("가위=0, 바위=1, 보=2 ?");
		String myChoice = sc.next();
		
		String comChoice = comNum == 0 ? "가위" : comNum == 1 ? "바위" : "보";
		
		if (comChoice.equals(myChoice)) {
			System.out.println("비겼습니다.");
		} else {
			if (comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위") ? "이겼습니다" : "졌습니다");
			} else if (comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보") ? "이겼습니다" : "졌습니다");
			} else {
				System.out.println(myChoice.equals("가위") ? "이겼습니다" : "졌습니다");
			}
		}
	}

}
