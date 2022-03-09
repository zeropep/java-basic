package quiz;

import java.util.Scanner;

class MenuOp {
	void checkOut(int[][] hotel) {
		Scanner sc = new Scanner(System.in);
		String roomNo = "";
		int floor = 0, room = 0;
		
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
		
	}

	void checkIn(int[][] hotel) {
		Scanner sc = new Scanner(System.in);
		String roomNo = "";
		int floor = 0, room = 0;
		
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
	}

	void overview(int[][] hotel) {
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				System.out.print((i+1) +(j < 9 ? "0" : "") + (j+1) + "호");
				System.out.print(hotel[i][j] == 0 ? "(입실가능)" : "(사용중)");
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}

class PrintMenu {
	
}

class HotelMenu {
	
	void hotelMenu() {
		
		int[][] hotel = new MakeHotel().makehotel();
		
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.println("\n========== 호텔 관리 메뉴 ==========");
			System.out.println("1: 객실 현황  2: 입실  3: 퇴실  Etc: 종료");
			System.out.println("-----------------------------------");
			System.out.println(">>>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>");
			menu = sc.nextInt();
			
			
			int floor = 0, room = 0;
			switch (menu) {
			case 1:
				new MenuOp().overview(hotel);
				break;
			case 2:
				new MenuOp().checkIn(hotel);
				break;
			case 3:
				new MenuOp().checkOut(hotel);
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
class MakeHotel {
	int[][] makehotel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("층 수 입력");
		int floorCount = sc.nextInt();
		System.out.println("방 수 입력");
		int roomCount = sc.nextInt();
		
		int[][] hotel = new int[floorCount][roomCount];
		
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				hotel[i][j] = 0;
			}
		}

		return hotel;
	}
}

public class Quiz04 {

	public static void main(String[] args) {
		// 호텔
		new HotelMenu().hotelMenu();
	}
}
