package quiz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
	
		setTest();
		
		// method의 약점
		// 1. 매개인자를 받아서 이미 만든 변수를 다시 선언해줘야 함.
		// 2. method를 통해 수정된 변수를 저장할 수 없어 해당 method가 다른 method를 불러야 함.
		// 그러므로 앞선 method에서 문제가 발생할 시 이후의 모든 절차에서 에러 발생 가능.
		// => 이러한 이유로 class를 사용하게 됨.

	}

	private static void setTest() {
		Scanner sc = new Scanner(System.in);
		int testerCount = 0;
		System.out.println("테스트에 참여할 인원수 > ");
		testerCount = sc.nextInt();
		
		String[] names = new String[testerCount];
		int[][] scores = new int[testerCount][3];
		int[] totals = new int[testerCount];
		double[] avgs = new double[testerCount];
		DecimalFormat df = new DecimalFormat("#.##");
		
		inputDatas(sc, names, scores, totals, avgs, df);
		
	}

	private static void inputDatas(Scanner sc, String[] ns, int[][] ss, int[] tts, double[] as, DecimalFormat df) {
		// params로 들어오는 변수들은 인자값을 매개해주기만 할 뿐, 스스로가 변수가 되지는 못한다.
		// 그러므로 변수로써 사용하기 위해서는 해당 인자값을 받아줄 변수를 만들어야 한다.
		String[] names = ns;
		int[][] scores = ss;
		int[] totals = tts;
		double[] avgs = as;
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println((i+1) + "번째 사람의 이름 입력 > ");
			names[i] = sc.next();
			
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print((i+1) + "번째 사람의 ");
				System.out.print(j==0 ? "국어" : j==1 ? "영어" : "수학");
				scores[i][j] = (int)(Math.random()*40)+61; // 61 ~ 100
				System.out.println(" 점수 입력 > " + scores[i][j]);
				
				totals[i] += scores[i][j];
			}
			avgs[i] = Double.parseDouble(df.format((double)totals[i] / 3));
			System.out.println("==========================================");
		}
		
		printer(names, scores, totals, avgs);
		
	}

	private static void printer(String[] names, int[][] scores, int[] totals, double[] avgs) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t순위");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(names[i] + "\t");
			for (int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] + "\t");
			}
			System.out.print(totals[i]+"\t");
			System.out.print(avgs[i]+"\t");
			
			int rank = 1;
			for (int k = 0; k < totals.length; k++) {
				if(totals[i] < totals[k]) {
					rank++;
				}
			}
			System.out.println(rank);
		}
	}
}




















