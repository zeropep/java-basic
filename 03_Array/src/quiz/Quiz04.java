package quiz;


import java.util.Arrays;
import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 호텔 예약 프로그램
		
		Scanner sc = new Scanner(System.in);
		System.out.println("층 수를 입력하세요");
		int f = (int) sc.nextInt();
		System.out.println("각 층마다 방 수를 입력하세요");
		int r = (int) sc.nextInt();
		
		String[][][] hotel = new String[f][r][];
		
		for (int i = 1; i < f + 1; i++) {
			for (int j = 1; j < r + 1; j++) {
				String[] roomInfo = new String[3];
				String roomNo = Integer.toString(i);
				if (j < 10) {
					roomNo += "0";
					roomNo += Integer.toString(j);
				} else {
					roomNo += Integer.toString(j);
				}
				System.out.println(roomNo);
				roomInfo[0] = roomNo;
				roomInfo[1] = "0";
				roomInfo[2] = "";
				
				hotel[i][j] = roomInfo;
			}
		}
		
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				System.out.println(hotel[i][j]);
			}
		}
		
		
		
	}

}
