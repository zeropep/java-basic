package homework;


import java.text.DecimalFormat;
import java.util.Scanner;

class SetData {
	String[] names;
	int[][] scores;
	int[] totals;
	double[] avgs;
	DecimalFormat df;
	
	public SetData(Scanner sc, int testerCount) {
		this.names = new String[testerCount];
		this.scores = new int[testerCount][3];
		this.totals = new int[testerCount];
		this.avgs = new double[testerCount];
		this.df = new DecimalFormat("#.##");
	}
	
	void inputDatas(Scanner sc) {
		
		for (int i = 0; i < this.scores.length; i++) {
			System.out.println((i+1) + "번째 사람의 이름 입력 > ");
			this.names[i] = sc.next();
			
			for (int j = 0; j < this.scores[i].length; j++) {
				System.out.print((i+1) + "번째 사람의 ");
				System.out.print(j==0 ? "국어" : j==1 ? "영어" : "수학");
				this.scores[i][j] = (int)(Math.random()*40)+61; // 61 ~ 100
				System.out.println(" 점수 입력 > " + this.scores[i][j]);
				
				this.totals[i] += this.scores[i][j];
			}
			this.avgs[i] = Double.parseDouble(df.format((double) this.totals[i] / 3));
			System.out.println("==========================================");
		}

	}
	
	void printDatas() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t순위");
		for (int i = 0; i < this.scores.length; i++) {
			System.out.print(this.names[i] + "\t");
			for (int j = 0; j < this.scores[i].length; j++) {
				System.out.print(this.scores[i][j] + "\t");
			}
			System.out.print(this.totals[i]+"\t");
			System.out.print(this.avgs[i]+"\t");
			
			int rank = 1;
			for (int k = 0; k < this.totals.length; k++) {
				if(this.totals[i] < this.totals[k]) {
					rank++;
				}
			}
			System.out.println(rank);
		}
	}
	
	void printFinish() {
		System.out.println("프로그램 종료");
	}
};

public class Quiz02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testerCount = 0;
		System.out.println("테스트에 참여할 인원수 > ");
		testerCount = sc.nextInt();
		
		SetData tomato = new SetData(sc, testerCount);

		tomato.inputDatas(sc);
		tomato.printDatas();
		tomato.printFinish();
		
	}
}