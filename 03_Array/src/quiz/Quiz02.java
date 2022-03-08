package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 테스트에 참여할 인원수를 입력하세요 > 3 
		
//		1번째 사람의 이름을 입력하세요 > 
//		1번째 사람의 국어점수를 입력하세요 > 
//		1번째 사람의 영어점수를 입력하세요 > 
//		1번째 사람의 수학점수를 입력하세요 >
//		...
//		...
//		...
//		...
//		3번째 사람의 수학점수를 입력하세요 > 
		
		// 이름 국어 영어 수학 총점 평균
		// aaa  89   88   78    ?    ?
		// bbb  ?    ?    ?     ?    ?
//		...
//		...
//		...
		Scanner sc = new Scanner(System.in);
		System.out.println("테스트에 참여할 인원수를 입력하세요");
		int student = (int) sc.nextInt();
		
		String[][] allStudents = new String[student][];
		
		for (int i = 0; i < student; i++) {
			String[] studentArr = new String[6];
			studentArr[0] = "person" + (i + 1);
			int[] scores = new int[3];
			for (int j = 0; j < 3; j++) {
				int score = (int) Math.floor(Math.random() * 51 + 50);
				scores[j] = score;
				studentArr[j + 1] = j == 0 ? "국어" + Integer.toString(score) 
					: j == 1 ? "영어" + Integer.toString(score) 
					: "수학" + Integer.toString(score);
			}
			
			int sum = 0;
			for (int n : scores) {
				sum += n;
			}
			studentArr[4] = "총합" + Integer.toString(sum);
			
			studentArr[5] = "평균" + Integer.toString(sum / scores.length);
			
			allStudents[i] = studentArr;
		}
		for (String[] stu : allStudents) {
			System.out.println(Arrays.toString(stu));
		}
	}

}
