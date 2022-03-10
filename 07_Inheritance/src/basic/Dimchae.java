package basic;

public class Dimchae extends KimchiRef {

	@Override
	void buttonColor(String color) {
		// TODO Auto-generated method stub
		
	} 
	// 상속 (extends)는 한 개의 부모클래서만 갖는다.
	// kimchiRef와 cooler와 freezer를 다 가지고오고 싶지만 한개만 가져올 수 있다.
	// 그래서 dimchae가 kimchiRef를 kimchiRef가 freezer를 freezer가 cooler를 cooler가 electronic을 상속받게 하면
	// 직렬관계가 되면서 상속관계가 무너지게 된다. => 상속으로는 해결이 불가능 (상속의 한계)
	// 이를 해결하기 위한 대안으로 interface가 등장하게 된다. (추상클래스의 등장)
	// 객체를 만들기 위한 class를 그냥 추상적인 개념으로써의 class로 만들어서 상속관계를 초월한 개념을 만들었다.
	// 단, 추상적인 개념이기 때문에 그만큼 자유롭지만 객체는 만들 수 없다.
	// 이런 이유로 이전까지의 class를 abstract로 만들면 기존의 객체들이 다 오류가 발생

}
