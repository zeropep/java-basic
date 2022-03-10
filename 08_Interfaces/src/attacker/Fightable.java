package attacker;

interface Attackable {
	void attack(Unit unit);
}

interface Movable {
	// interface의 존재목적 자체가 광범위적으로 무언가를 규격화하게끔 만들어짐.
	// 그래서 public으로 만들어짐
	// 물론 public을 생략해도 만들어지긴 하지만, 그렇다고 package로 만들어진건 아니다.
	// 하지만 protected로는 생성 불가.
	
	public abstract void move(int x, int y);
	// public abstract를 생략할 수 있다.
	// 어차피 interface자체가 추상적인 개념이기 때문.
}

public interface Fightable extends Attackable, Movable {
	// interface는 보통 ~able이라는 이름으로 생성한다.
	// final int x = 0; 
	// 기본은 public static final이다.
	// 규격을 지정해 주기 때문에 값이 함부로 바뀌면 안되기 때문임.
	// interface 내부는 일반적으로 변수가 아닌 상수라고 간주함.
	
	// interface끼리 상속관계를 부여하기 위해 extends를 사용할 수 있다.
	// 이 때는 class와 달리 여러개의 상속관계를 맺을 수 있다.
	// class끼리 extends, interface끼리 extends 가능
	// class는 interface를 implement가능, 반대로는 불가능.
	// 인터페이스는 클래스보다 상위개념의 규격임
}
