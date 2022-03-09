package homework;

import java.util.Arrays;
import java.util.Scanner;

class BaseBall {
	// 컴퓨터의 숫자와 나의 숫자 정보를 셋팅
	int[] comNum = { 0, 0, 0 };
	int[] myNum;
	int[] strikeAndBall;
	int count = 0;
	String[] myNumStrArr;
	
	public BaseBall() {
		// 컴퓨터의 숫자를 랜덤으로 중복되지 않게 초기화
		for (int i = 0; i < this.comNum.length; i++) {
			this.comNum[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (this.comNum[j] == this.comNum[i]) {
					i--;
					break;
				}
			}
		}
		// 컴퓨터 숫자 추출결과 확인
		for (int i : this.comNum) {
			System.out.print(" " + i);
		}
		System.out.println();
	}
	
	void guessNumberOfMine(Scanner sc) {
		this.myNum = new int[3];
		System.out.println("숫자를 추측하세요 > ");
		String myNumStr = sc.next();
		this.myNumStrArr = myNumStr.split("");

		// 반복문 내부 : 추측숫자를 숫자형 배열에 저장하기
		for (int i = 0; i < this.myNumStrArr.length; i++) {
			this.myNum[i] = Integer.parseInt(this.myNumStrArr[i]);
		}
	}
	
	void compareNumbers() {
		// 반복문 내부 : 추측 숫자와 컴퓨터 숫자를 비교하여 Strike, Ball 누적하기
		this.strikeAndBall = new int[3];
		for (int i = 0; i < this.comNum.length; i++) {
			for (int j = 0; j < this.myNum.length; j++) {
				if (this.comNum[i] == this.myNum[j] && i == j) {
					this.strikeAndBall[0]++;
				} else if (comNum[i] == myNum[j] && i != j) {
					this.strikeAndBall[1]++;
				}
			}
		}
		this.strikeAndBall[2] = 1;
		count += strikeAndBall[2];
	}
	
	boolean printResult() {
		System.out.print(this.count + "회 시도 : " + Arrays.toString(this.myNumStrArr));
		System.out.println(" > " + this.strikeAndBall[0] + "S " + this.strikeAndBall[1] + "B");
		if (this.strikeAndBall[0] == 3) {
			System.out.println("게임종료 : 총 " + this.count + "회 시도");
			return false;
		}
		return true;
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		// 숫자 야구 게임
		Scanner sc = new Scanner(System.in);
		boolean flag = true;

		BaseBall tomato = new BaseBall();
		
		while (flag) {
			tomato.guessNumberOfMine(sc);
			
			tomato.compareNumbers();

			flag = tomato.printResult();
		}
		System.out.println("야구 게임 종료!");
	}





	


}
