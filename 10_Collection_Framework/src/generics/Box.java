package generics;

import java.util.ArrayList;

public class Box<T> {
	// <> 이것을 generic이라고 하며, 다이아몬드라고도 불림.
	// T는 예약된 언어(예약어)중 하나로, 타입을 의미한다.
	// E는 Element의 약자이다.
	// <T extends Fruit> 이런 식으로도 가능한데, 이렇게되면 Box의 생성부터 이미 타입제한이 걸린다.
	// 애초에 generic의 목적 자체가 타입제한을 걸어두는 것이다.
	
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	
	T get(int idx) {
		return list.get(idx);
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}
