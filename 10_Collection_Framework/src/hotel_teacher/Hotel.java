package hotel_teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hotel {
	private List<Room> roomList;
	private Scanner sc = new Scanner(System.in);
	private HotelService hsv;
	
	public Hotel() {
		buildHotel();
		hsv = new HotelServiceImple(roomList);
		frontDesk();
	}

	private void frontDesk() {
		int menu = 0;
		boolean flag = true;

		while (flag) {
			System.out.println("\n================== 호텔 관리 메뉴 ==================");
			System.out.println("1:객실현황  2:입실  3:퇴실  4:객실조회  5. 투숙객조회  5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>>>>>>>>>");
			menu = sc.nextInt();

			flag = hsv.choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");
	}

	private void buildHotel() {
		System.out.println("호텔의 층 수 입력 > ");
		int floorCount = sc.nextInt();
		System.out.println("층당 방 수 입력 > ");
		int roomCount = sc.nextInt();
		
		initializeRooms(floorCount, roomCount);
		
		// 초기화 완료 테스트
		for (Room room : roomList) {
			System.out.println(room);			
		}
	}

	private void initializeRooms(int floorCount, int roomCount) {
		this.roomList = new ArrayList<>();
		
		for (int i = 0; i < floorCount; i++) {
			for (int j = 0; j < roomCount; j++) {
				this.roomList.add(new Room((i+1) + (j < 9 ? "0" : "") + (j+1), null, true));
			}
		}
	}
}
