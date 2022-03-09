package quiz;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class User {
	private String name;
	private int age;
	private int gen;
	// 성별은 boolean 타입으로 잘 만들지 않는다. 보통 int나 char 사용

	public User() {
	}

	public User(String name, int age, char gen) {
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	@Override
	public String toString() {
		String result = gen == 0 ? "예약자: " + name + ", 나이: " + age + "세, 성별: 남자"
				: "예약자: " + name + ", 나이: " + age + "세, 성별: 여자";
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGen() {
		return gen;
	}

	public void setGen(int gen) {
		this.gen = gen;
	}
}

class Room {
	private String roomNum;
	private User user;
	private boolean isEmpty;
	private String checkInTime;
	private String checkOutTime;

	public Room() {
	}

	// 호텔 생성시 초기화용 생성자
	public Room(User user, String roomNum, boolean isEmpty, String checkInTime, String checkOutTime) {
		this.user = user;
		this.roomNum = roomNum;
		this.isEmpty = isEmpty;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRoomNum() {
		return roomNum;
	}

//	얘는 필요없어서 주석처리
//	public void setRoomNum(String roomNum) {
//		this.roomNum = roomNum;
//	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	@Override
	// object를 호출하면 모든 속성을 String으로 반환해준다.
	// objName.toString()으로 부르지 않고 그냥 objName자체만 불러도 응답해줌.
	// 즉 주솟값에 대한 접근행동에 반응한다고 생각하면 된다.
	// 모든 java 객체에서 사용 가능.
	// 내용은 바꿀 수 있으나 형태나 method 이름은 고정이다.
	// @override가 없어도 정상작동하나, 기본적으로 가지고 있는 기능임을 표시하는 것이다.
	// 한글표현은 method의 재 정의
	public String toString() {
		return "Room [roomNum=" + roomNum + ", user=" + user + ", isEmpty=" + isEmpty + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime
				+ "]";
	}

}

class Hotel {
	// VO(Value Object)
	// 연산하는 기능없이 단순히 값을 저장하고 수정하기만 하는 객체

	private Room[][] rooms;
	private String hotelName;

	public Hotel() {
		buildHotel();
	}

	public void buildHotel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("호텔이름을 입력 > ");
		hotelName = sc.next();
		System.out.println("호텔의 층 수를 입력 > ");
		int floorCount = sc.nextInt();
		System.out.println("층 당 방 수를 입력 > ");
		int roomCount = sc.nextInt();
		rooms = new Room[floorCount][roomCount];

		initRooms();
	}

	private void initRooms() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				rooms[i][j] = new Room(null, convertRoomNum(i, j), true, null, null);
//				System.out.print(rooms[i][j].getRoomNum() + "호 \t");
//				System.out.print("사용자" + rooms[i][j].getUser() + "\t");
//				System.out.print("사용자" + rooms[i][j].getUser() + "\t");
//				System.out.print("공실여부" + rooms[i][j].isEmpty() + "\t");
//				System.out.print("입실시간" + rooms[i][j].getCheckInTime() + "\n");
//				호출하면 자동으로 찍어주는 기능이 있음 (override)
//				System.out.println(rooms[i][j]);
			}
		}
	}

	private String convertRoomNum(int i, int j) {
		String roomNum = "";
		if (j < 9) {
			roomNum = "0" + String.valueOf(j + 1);
		} else {
			roomNum = String.valueOf(j + 1);
		}
		return String.valueOf(i + 1) + roomNum;
	}

	public void goFrontDesk() {
		Scanner sc = new Scanner(System.in);
		// sc끼리 서로다른 지역변수로써 다른것도 맞지만
		// 애초에 new를 통해 생성될때마다 다른 주솟값을 가지기 때문에 다른 존재라는 것이 더 정확하다.
		// main에다 스캐너를 만들수..도 있지만 static영역에 만들면
		// static 저장공간이 부족하게 될 수도 있다.
		// (물론 그렇게까지는 안쓰겠지만 static에다가는 되도록 적게 만들자..)

		int menu = 0;
		boolean flag = true;

		while (flag) {
			System.out.println("\n============ " + this.hotelName + "호텔 관리 메뉴 ============");
			System.out.println("1:객실현황  2:입실  3:퇴실  4:객실조회  5. 투숙객조회  5.종료");
			System.out.println("--------------------------------------------------------");
			System.out.println(">>>>>>>>>>>>>>>>>>>메뉴를 선택하세요>>>>>>>>>>>>>>>>>>");
			menu = sc.nextInt();

			flag = choiceMenu(menu);
		}
		System.out.println("프로그램을 종료합니다");
	}

	private boolean choiceMenu(int menu) {
		Scanner sc = new Scanner(System.in);
		String roomNum = "";

		switch (menu) {
		case 1:
			getRoomsStatus();
			break;
		case 2:
			System.out.println("입실할 방번호를 입력 > ");
			roomNum = sc.next();
			roomCheckIn(roomNum);
			break;
		case 3:
			System.out.println("퇴실할 방번호를 입력 > ");
			roomNum = sc.next();
			roomCheckOut(roomNum);
			break;
		case 4:
			System.out.println("조회할 방번호를 입력 > ");
			roomNum = sc.next();
			roomDetail(roomNum);
			break;
		case 5:
			System.out.println("-------- 투숙객 리스트 ---------");
			getUserList(this.rooms);
			break;
		case 6:
			System.out.println("저희 호텔을 이용해 주셔서 감사합니다");
			return false;
		default:
			System.out.println("정확한 메뉴 번호를 입력하세요.");
			break;
		}
		return true;
	}

	private void getUserList(Room[][] rooms) {
		for (Room[] rooms1 : rooms) {
			for (Room room : rooms1) {
				if (!room.isEmpty()) {
					System.out.print(room.getRoomNum() + " : ");
					System.out.println(room.getUser().getName() + "님");
				}					
			}
		}
		// 사실 JS와 달리 java에서는 for문이나 foreach문이나 속도차이는 거의 없다.
		// 그냥 foreach문이 가독성 부분에서 더 좋다.
	}

	private void roomDetail(String roomNum) {
		int floor = 0, room = 0;

		if (roomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else { // 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}

//		if (rooms[floor][room].isEmpty()) {
//			System.out.println("이 방은 현재 비어있습니다.");
//		} else {
//			System.out.println(rooms[floor][room]);	
//			Room roomObj = rooms[floor][room];
			System.out.println(rooms[floor][room]);
//		}
	}

	private void roomCheckOut(String roomNum) {
		int floor = 0, room = 0;

		if (roomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else { // 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}
		if (!rooms[floor][room].isEmpty()) {
			rooms[floor][room].setEmpty(true);
			rooms[floor][room].setUser(null);
			// 느슨한 연결관계를 활용하여 연결을 해제한다
			// jvm garbage collect를 활용하면 연결이 해제된 객체를 삭제한다.
			// 하지만 사용하지 않는 객체도 가끔 쓸모있기 때문에 잘 활용하지는 않는다.
			LocalDateTime todayNow = LocalDateTime.now();
			rooms[floor][room].setCheckInTime(null);
			rooms[floor][room].setCheckInTime(
					DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow)
					);
			if (rooms[floor][room].getCheckOutTime().length() > 0) {
				rooms[floor][room].setCheckOutTime(null);
			}
			System.out.println(roomNum + "호 퇴실완료");
		} else {
			System.out.println(roomNum + "호는 현재 빈방! > 다른방을 선택하세요!");
		}
	}

	private void getRoomsStatus() {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {
				System.out.print(rooms[i][j].getRoomNum() + "호 ");
				System.out.print(rooms[i][j].isEmpty() ? "(입실가능) \t" : "(사용중) \t");
			}
			System.out.print("\n");
		}

	}

	private void roomCheckIn(String roomNum) {
		int floor = 0, room = 0;

		if (roomNum.length() > 3) { // 1004호 => 1004 => 10, 04 => 9, 3
			floor = Integer.parseInt(roomNum.substring(0, 2)) - 1;
			room = Integer.parseInt(roomNum.substring(2)) - 1;
		} else { // 808호 => 808 => 8, 08 => 7, 7
			floor = Integer.parseInt(roomNum.substring(0, 1)) - 1;
			room = Integer.parseInt(roomNum.substring(1)) - 1;
		}
		if (rooms[floor][room].isEmpty()) {
			rooms[floor][room].setEmpty(false);

			User user = getUserInfo();
			rooms[floor][room].setUser(user);
			LocalDateTime todayNow = LocalDateTime.now();
			rooms[floor][room].setCheckInTime(
					DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
					.format(todayNow)
					);
			// java는 .이나 (를 기준으로 줄바꿈을 해도 정상 작동한다.
			// 하지만 객체바로 뒤에붙는 .은 가급적 붙이는것이 권장된다.
			System.out.println(roomNum + "호 입실완료");
		} else {
			System.out.println(roomNum + "호는 현재 사용중! > 다른방을 선택하세요!");
		}
	}

	private User getUserInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("투숙객의 정보를 입력 > ");
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("나이 > ");
		int age = sc.nextInt();
		System.out.println("성별 > ");
		char gen = sc.next().charAt(0);

		return new User(name, age, gen);
	}
}

public class HotelMgr2 {
	// SO(Service Object)
	// 실제로 동적으로 연산하고 기능하는 객체

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.goFrontDesk(); // 원래 이름은 getMenu();가 맞음
	}
}