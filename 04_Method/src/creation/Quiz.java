package creation;

class makeRanArr {
	
	public makeRanArr() {
		int[] numArr = makeRanArr();
		
		double avg = average(numArr);

		printer(numArr, avg);
	}
	
	int[] makeRanArr() {
		int[] numArr = new int[5];
		for (int i = 0; i < 5; i++) {
			int num = (int) (Math.floor(Math.random() * 100) + 1);
			numArr[i] = num;
		}
		return numArr;
	}
	
	double average(int[] numArr) {
		int sum = 0;
		for (int i : numArr) {
			sum += i;
		}
		
		return (double) sum / numArr.length;
	}
	
	void printer(int[] numArr, double avg) {
		System.out.print("[");
		for (int i = 0; i < numArr.length; i++) {
			if (i != numArr.length-1) {
				System.out.print(numArr[i] + ", ");				
			} else {
				System.out.print(numArr[i]);
			}
		}
		System.out.print("] 의 평균은 " + avg + "입니다.");
		
	}
}

public class Quiz {

	public static void main(String[] args) {
		// 랜덤으로 정수를 5개 배열로 만들어 메서드에 전달하면
		// 평균을 연산 후 리턴받아 출력하는 코드를 작성
		new makeRanArr();
	}
}
