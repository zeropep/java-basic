package hotel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class HotelMenu {
	Scanner sc = new Scanner(System.in);
	ArrayList<ArrayList<Rooms>> hotel = new ArrayList<>();
	private int menu;
	private String roomNum;
	private boolean flag = true;
	private final String MENU_BAR = "1.전체객실현황  2.입실  3.퇴실  4.단일객실현황  5.이용자검색  0.종료";

	public void runMenu(ArrayList<ArrayList<Rooms>> hotelPlan) {
		hotel = hotelPlan;
		buildHotel();
		
		while(flag) {
			System.out.println(MENU_BAR);
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				for (ArrayList<Rooms> floors : hotel) {
					for (Rooms rooms : floors) {
						System.out.print(rooms.getRoomNum());
						System.out.print(rooms.isAvail() == true ? "(입실가능) " : "(사용중) ");
					}
					System.out.print("\n");
				}
				break;
			case 2:
				System.out.println("입실할 방번호를 입력 > ");
				roomNum = sc.next();
				checkIn(roomNum);
				break;
			case 3:
				System.out.println("퇴실할 방번호를 입력 > ");
				roomNum = sc.next();
				checkOut(roomNum);
				break;
			case 4:
				System.out.println("조회할 방번호를 입력 > ");
				roomNum = sc.next();
				roomDetail(roomNum);
				break;
			case 5:
				getUserList();
				break;
			case 6:
				flag = false;
				break;

			default:
				System.out.println("정확한 메뉴 번호를 입력해주세요.");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

	private void getUserList() {
		System.out.println("----- 현재 이용중인 고객 리스트 -----");
		for (int i = 0; i < hotel.size(); i++) {
			for (int j = 0; j < hotel.get(i).size(); j++) {
				if (!hotel.get(i).get(j).isAvail()) {
					System.out.print(hotel.get(i).get(j).getRoomNum() + "호 : ");
					System.out.print(hotel.get(i).get(j).getUser().getName() + "님 \n");
				}
			}
		}
		System.out.println("원하는 이용자를 입력하세요");
		String name = sc.next();
		
		for (int i = 0; i < hotel.size(); i++) {
			for (int j = 0; j < hotel.get(i).size(); j++) {
				if (!hotel.get(i).get(j).isAvail()) {
					if (hotel.get(i).get(j).getUser().getName().equals(name)) {
						System.out.println(hotel.get(i).get(j));						
					}
				}
			}
		}
	}

	private void roomDetail(String roomNum2) {
		int floor = 0, room = 0;

		if (roomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else { // 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}

		System.out.println(hotel.get(floor).get(room));
	}

	private void checkOut(String roomNum) {
		int floor = 0, room = 0;

		if (roomNum.length() > 3) {
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else {
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}
		if (!hotel.get(floor).get(room).isAvail()) {
			hotel.get(floor).get(room).setAvail(true);

			hotel.get(floor).get(room).setUser(null);
			hotel.get(floor).get(room).setCheckOutTime(
					DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
					.format(LocalDateTime.now())
					);
			System.out.println(roomNum + "호 퇴실완료");
		} else {
			System.out.println(roomNum + "호는 현재 비어있음 > 다른방을 선택하세요!");
		}
	}

	private void checkIn(String roomNum) {
		int floor = 0, room = 0;

		if (roomNum.length() > 3) {
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else {
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}
		if (hotel.get(floor).get(room).isAvail()) {
			hotel.get(floor).get(room).setAvail(false);

			User user = getUserInfo();
			hotel.get(floor).get(room).setUser(user);
			hotel.get(floor).get(room).setCheckInTime(
					DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
					.format(LocalDateTime.now())
					);
			System.out.println(roomNum + "호 입실완료");
		} else {
			System.out.println(roomNum + "호는 현재 사용중! > 다른방을 선택하세요!");
		}
	}

	private hotel.User getUserInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("투숙객의 정보를 입력 > ");
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("나이 > ");
		int age = sc.nextInt();
		System.out.println("성별 > 남자 or 여자");
		String inputGen = sc.next();
		char gen = inputGen == "남자" ? 'M' : 'F';

		return new User(name, age, gen);
	}

	private void buildHotel() {
		System.out.println("호텔의 층 수 입력 >");
		int floorsHotelHas = sc.nextInt();
		System.out.println("각 층별 호수 입력 > ");
		int roomsHotelHas = sc.nextInt();
		
		for (int i = 0; i < floorsHotelHas; i++) {
			hotel.add(new ArrayList<Rooms>());
			for (int j = 0; j < roomsHotelHas; j++) {
				hotel.get(i).add(new Rooms(transformRoomNo(i, j), null, true, null, null));
			}
		}
	}

	private String transformRoomNo(int i, int j) {
		String roomNum = "";
		if (j < 9) {
			roomNum = "0" + String.valueOf(j + 1);
		} else {
			roomNum = String.valueOf(j + 1);
		}
		return String.valueOf(i + 1) + roomNum;
	}

}
