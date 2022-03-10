package generics;

import java.util.HashMap;
import java.util.Map;

public class FreshStore {

	public static void main(String[] args) {
		Map<String, Box<Fruit>> map = new HashMap<>();
		// Box<? extends Fruit>도 사용가능하다.
		// 이런식으로 만들면 map.put("AppleBox", new Box<Apple>());로 만들 수 있다.
		// ?는 와일드카드
		// 여기서의 의미는 Fruit를 상속받은 어떤것이든 받을 수 있다는 것.
		// 하지만 가독성이 떨어진다는 단점이 있다.
		// 선언하는 것이 아니라 직접적으로 사용하는 것이기 때문에 T는 사용불가. 
		// 어차피 우리는 이전에 Apple과 Orange가 Fruit를 상속한다는 선언을 했기 떄문에
		// 그냥 Fruit로 만들면 된다.
		map.put("AppleBox", new Box<Fruit>());
		map.put("Orange", new Box<Fruit>());
	}

}
