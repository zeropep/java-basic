package quiz;

import java.util.Scanner;

class Printer {
	public Printer() {
		
	}
	
	public int menu(Scanner sc) {
		System.out.println("\n========== 호텔 관리 메뉴 ==========");
		System.out.println("1:객실현황  2:입실  3:퇴실  Etc:종료");
		System.out.println("--------------------------------------");
		System.out.println(">>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>");
		int menu = sc.nextInt();
		return menu;
	}
	
	public void available(boolean avail) {
		if (avail) {
			System.out.print("입실가능");
		} else {
			System.out.print("입실불가능");			
		}
	}
	
	public void checkInMsg(boolean avail, String rno) {
		if (avail) {
			System.out.println(rno + "호 입실완료");
		} else {
			System.out.println(rno + "호는 현재 사용중! > 다른방을 선택하세요!");			
		}
	}
}

class HotelManager {
	Printer print = new Printer();
	
	private int floorCount = 0;
	private int roomCount = 0;
	// [층][방][방번호, 사용자, 사용중여부, 날짜]
	private String[][][] hotel;
	private String checkInRoomNum = "";
	private String name = "";
	private String date = "";
	private int floor = 0, room = 0;
	
	public HotelManager(Scanner sc) {
		System.out.println("호텔의 층 수를 입력 > ");
		floorCount = sc.nextInt();
		System.out.println("층 당 방 수를 입력 > ");
		roomCount = sc.nextInt();
		hotel = new String[floorCount][roomCount][4];
	}
	
	public void initializing() {
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				for (int k = 0; k < hotel[i][j].length; k++) {
					if (k == 0) {
						hotel[i][j][k] = Integer.toString(i+1) + (String) (j<9 ? "0" : "") + Integer.toString(j+1);
					} else if (k == 1) {
						hotel[i][j][k] = "";
					} else if (k == 2) {
						hotel[i][j][k] = "0";
					} else {
						hotel[i][j][k] = "";
					}
				}
			}
		}
	}
	
	public void overview() {
		for (int i = 0; i < hotel.length; i++) {
			for (int j = 0; j < hotel[i].length; j++) {
				System.out.print(hotel[i][j][0]+"호 ");
				if (hotel[i][j][2] == "0") {
					print.available(true);
				} else if (hotel[i][j][2] != "0") {
					print.available(false);					
				}
				System.out.print("\t");
			}
			System.out.println();
		}
	}
	
	public void checkIn(Scanner sc) {
		System.out.println("입실할 방번호를 입력 > ");
		checkInRoomNum = sc.next();
		System.out.println("예약자 이름을 입력 > ");
		name = sc.next();
		System.out.println("입실 날짜를 입력 > yyyy-mm-dd");
		date = sc.next();
		
		
		
		if(checkInRoomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(checkInRoomNum.substring(0,2))-1;
			room = Integer.parseInt(checkInRoomNum.substring(2))-1;
		}else { // 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(checkInRoomNum.substring(0,1))-1;
			room = Integer.parseInt(checkInRoomNum.substring(1))-1;
		}
		if (hotel[floor][room][2] == "0") {
			hotel[floor][room][1] = name;
			hotel[floor][room][2] = "1";
			hotel[floor][room][3] = date;
			print.checkInMsg(true, checkInRoomNum);
		}else {
			print.checkInMsg(false, checkInRoomNum);
		}
	}

}

public class HotelMgr {

	public static void main(String[] args) {
		// 호텔 예약 프로그램
		Scanner sc = new Scanner(System.in);
		HotelManager hotel = new HotelManager(sc);
		Printer print = new Printer();

		int menu = 0;
		boolean flag = true;
		
		// 호텔 배열의 모든 값을 0으로 초기화
		hotel.initializing();
		
		while (flag) {
			menu = print.menu(sc);
			
			String roomNum ="";
			int floor = 0, room = 0;
			switch (menu) {
			case 1:
				hotel.overview();
				break;
			case 2:
				hotel.checkIn(sc);
				break;
//			case 3:
//				System.out.println("퇴실할 방번호를 입력 > ");
//				roomNum = sc.next();
//				if(roomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
//					floor = Integer.parseInt(roomNum.substring(0,2))-1;
//					room = Integer.parseInt(roomNum.substring(2))-1;
//				}else { // 808호 => 808 => 8, 08 => 7, 7
//					floor = Integer.parseInt(roomNum.substring(0,1))-1;
//					room = Integer.parseInt(roomNum.substring(1))-1;
//				}
//				if (hotel[floor][room] == 1) {
//					hotel[floor][room] = 0;
//					System.out.println(roomNum + "호 퇴실완료");
//				}else {
//					System.out.println(roomNum + "호는 현재 빈방! > 다른방을 선택하세요!");
//				}
//				break;
			default:
				System.out.println("저희 호텔을 이용해 주셔서 감사합니다");
				flag = false;
				break;
			}
		}
		System.out.println("프로그램을 종료합니다");
	}

}