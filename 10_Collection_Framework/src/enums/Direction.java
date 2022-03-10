package enums;

public enum Direction {
	EAST(1, ">"), SOUTH(2, "v"), WEST(3,"<"), NORTH(4, "^");
	// 튜플 데이터 타입
	// 괄호안에 값을 가지고 있으며, 수정이 불가능한 상태
	
	private static final Direction[] DIRS_ARR = Direction.values();
	private final int value;
	private final String sign;
	
	Direction(int value, String sign) {
		this.value = value;
		this.sign = sign;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public String getSign() {
		return this.sign;
	}
	
	public static Direction ofDirection(int dir) {
		if (dir < 1 || dir > 4) {
			throw new IllegalArgumentException("범위 초과 : " + dir);
		}
		return DIRS_ARR[dir - 1];
	}
	
	// num 값을 받으면 90도씩 시계방향으로 회전시키는 메서드
	public Direction rotate(int num) {
		num = num % 4;
		if (num < 0) { // num이 음수일 때 시계반대방향으로 회전
			num += 4;
		}
		return DIRS_ARR[(value - 1 + num) % 4]; // 데이터가 저장된 배열의 인덱스 번호를 계산하여 리턴
	}
	
	public String toString() {
		return name() + " " + getSign();
	}
 }
