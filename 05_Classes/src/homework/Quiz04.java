package homework;

import java.util.Scanner;

class BuildHotel {
	int[][] hotel;
	
	public BuildHotel(Scanner sc) {
		System.out.println("호텔의 층 수를 입력 > ");
		int floorCount = sc.nextInt();
		System.out.println("층 당 방 수를 입력 > ");
		int roomCount = sc.nextInt();

		hotel = new int[floorCount][roomCount];

		// 호텔 배열의 모든 값을 0으로 초기화
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				hotel[i][j] = 0;
			}
		}
	}
	
	int printMenu(Scanner sc) {
		System.out.println("\n========== 호텔 관리 메뉴 ==========");
		System.out.println("1:객실현황  2:입실  3:퇴실  Etc:종료");
		System.out.println("--------------------------------------");
		System.out.println(">>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>");
		int menu = sc.nextInt();
		return menu;
	}
	
	void printHotelStatus() {
		for (int i = 0; i < this.hotel.length; i++) {
			for (int j = 0; j < this.hotel[i].length; j++) {
				System.out.print((i + 1) + (j < 9 ? "0" : "") + (j + 1) + "호:");
				System.out.print(hotel[i][j] == 0 ? "입실가능" : "사용중");
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	void checkInRoom(Scanner sc) {
		System.out.println("입실할 방번호를 입력 > ");
		String roomNum = sc.next();
		int floor = 0, room = 0;
		if (roomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else { // 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}
		if (this.hotel[floor][room] == 0) {
			this.hotel[floor][room] = 1;
			System.out.println(roomNum + "호 입실완료");
		} else {
			System.out.println(roomNum + "호는 현재 사용중! > 다른방을 선택하세요!");
		}
		
	}
	
	void checkOutRoom(Scanner sc) {
		System.out.println("퇴실할 방번호를 입력 > ");
		String roomNum = sc.next();
		int floor = 0, room = 0;
		if (roomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else { // 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}
		if (this.hotel[floor][room] == 1) {
			this.hotel[floor][room] = 0;
			System.out.println(roomNum + "호 퇴실완료");
		} else {
			System.out.println(roomNum + "호는 현재 빈방! > 다른방을 선택하세요!");
		}
		
	}
}

public class Quiz04 {

	public static void main(String[] args) {
		// 호텔 예약 프로그램
		Scanner sc = new Scanner(System.in);

		BuildHotel myHotel = new BuildHotel(sc);
		
		int menu = 0;
		boolean flag = true;
		
		while (flag) {			
			menu = myHotel.printMenu(sc);
			switch (menu) {
			case 1:				
				myHotel.printHotelStatus();
				break;
			case 2:
				myHotel.checkInRoom(sc);
				break;
			case 3:
				myHotel.checkOutRoom(sc);
				break;
			default:
				System.out.println("저희 호텔을 이용해 주셔서 감사합니다");
				flag = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}
}