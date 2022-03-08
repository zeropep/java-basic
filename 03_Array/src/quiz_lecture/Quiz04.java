package quiz_lecture;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 호텔
		Scanner sc = new Scanner(System.in);
		System.out.println("층 수 입력");
		int floorCount = sc.nextInt();
		System.out.println("방 수 입력");
		int roomCount = sc.nextInt();
		
		int[][] hotel = new int[floorCount][roomCount];
		int menu = 0;
		boolean flag = true;
		
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				hotel[i][j] = 0;
			}
		}
		while (flag) {
			System.out.println("\n========== 호텔 관리 메뉴 ==========");
			System.out.println("1: 객실 현황  2: 입실  3: 퇴실  Etc: 종료");
			System.out.println("-----------------------------------");
			System.out.println(">>>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>");
			menu = sc.nextInt();
			
			String roomNo = "";
			int floor = 0, room = 0;
			switch (menu) {
			case 1:
				for (int i = 0; i < hotel.length; i++) {
					for (int j = 0; j < hotel[i].length; j++) {
						System.out.print((i+1) +(j < 9 ? "0" : "") + (j+1) + "호");
						System.out.print(hotel[i][j] == 0 ? "(입실가능)" : "(사용중)");
						System.out.print("\t");
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("입실할 방 번호를 입력");
				roomNo = sc.next();
				if(roomNo.length() > 3) {
					floor = Integer.parseInt(roomNo.substring(0, 2)) - 1;
					room = Integer.parseInt(roomNo.substring(2)) - 1;
				} else {
					floor = Integer.parseInt(roomNo.substring(0, 1)) - 1;
					room = Integer.parseInt(roomNo.substring(1)) - 1;					
				}
				if (hotel[floor][room] == 0) {
					hotel[floor][room] = 1;
					System.out.println(roomNo + "호 입실완료");
				} else {
					System.out.println(roomNo + "호는 사용중입니다.");					
				}
				break;
			case 3:
				System.out.println("퇴실할 방 번호를 입력");
				roomNo = sc.next();
				if(roomNo.length() > 3) {
					floor = Integer.parseInt(roomNo.substring(0, 2)) - 1;
					room = Integer.parseInt(roomNo.substring(2)) - 1;
				} else {
					floor = Integer.parseInt(roomNo.substring(0, 1)) - 1;
					room = Integer.parseInt(roomNo.substring(1)) - 1;					
				}
				if (hotel[floor][room] == 1) {
					hotel[floor][room] = 0;
					System.out.println(roomNo + "호 퇴실완료");
				} else {
					System.out.println(roomNo + "호는 빈방입니다.");					
				}
				break;

			default:
				System.out.println("감사합니다.");
				flag = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
