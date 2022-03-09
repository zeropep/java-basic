package quiz;

import java.util.Scanner;

public class Quiz03_teacher {

	public static void main(String[] args) {
		// 숫자 야구 게임
		Scanner sc = new Scanner(System.in);
		int count = 0;
		boolean flag = true;

		int[] comNum = makeRandomNumberOfCoumputer();		
		
		while (flag) {
			int[] myNum = guessNumberOfMine(sc);
			
			int[] strikeAndBall = compareNumbers(comNum, myNum);
			count += strikeAndBall[2];

			flag = printResult(strikeAndBall, count, String.valueOf(myNum[myNum.length-1]));
		}
		System.out.println("야구 게임 종료!");
	}

	private static boolean printResult(int[] strikeAndBall, int count, String myNumStr) {
		System.out.print(count + "회 시도 : " + myNumStr);
		System.out.println(" > " + strikeAndBall[0] + "S " + strikeAndBall[1] + "B");
		if (strikeAndBall[0] == 3) {
			System.out.println("게임종료 : 총 " + count + "회 시도");
			return false;
		}
		return true;
	}

	private static int[] compareNumbers(int[] comNum, int[] myNum) {
		int[] strikeAndBall = new int[3];
		
		// 반복문 내부 : 추측 숫자와 컴퓨터 숫자를 비교하여 Strike, Ball 누적하기
		for (int i = 0; i < comNum.length; i++) {
			for (int j = 0; j < myNum.length; j++) {
				if (comNum[i] == myNum[j] && i == j) {
					strikeAndBall[0]++;
				} else if (comNum[i] == myNum[j] && i != j) {
					strikeAndBall[1]++;
				}
			}
		}
		strikeAndBall[2] = 1;
		return strikeAndBall;
	}

	private static int[] guessNumberOfMine(Scanner sc) {
		int[] myNum = new int[4];
		System.out.println("숫자를 추측하세요 > ");
		String myNumStr = sc.next();
		String[] myNumStrArr = myNumStr.split("");

		// 반복문 내부 : 추측숫자를 숫자형 배열에 저장하기
		for (int i = 0; i < myNumStrArr.length; i++) {
			myNum[i] = Integer.parseInt(myNumStrArr[i]);
		}
		myNum[myNum.length-1] = Integer.parseInt(myNumStr);
		return myNum;
	}

	private static int[] makeRandomNumberOfCoumputer() {
		// 컴퓨터의 숫자와 나의 숫자 정보를 셋팅
		int[] comNum = { 0, 0, 0 };

		// 컴퓨터의 숫자를 랜덤으로 중복되지 않게 초기화
		for (int i = 0; i < comNum.length; i++) {
			comNum[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (comNum[j] == comNum[i]) {
					i--;
					break;
				}
			}
		}
		// 컴퓨터 숫자 추출결과 확인
		for (int i : comNum) {
			System.out.print(" " + i);
		}
		return comNum;
	}
}
