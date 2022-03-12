package optionals;

import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		// java 1.8 이상
		// 데이터를 변수에 저장할 때 데이터의 null여부를 판단하여
		// NullPointException 발생을 사전에 필터링 할 수 있음.
		
		Optional<String> option = Optional.ofNullable("자바 옵셔널 객체 테스트");
		System.out.println(option);
		System.out.println(option.get());
		
		Optional<String> option2 = Optional.ofNullable(null);
		System.out.println(option2);
		System.out.println(option2.isPresent());
		System.out.println(option2.isEmpty());
		
		if (option2.isEmpty()) {
			System.out.println("null 이면 이렇게 처리");
		}
		
		Optional<String> option3 = Optional.empty(); // null 셋팅
		System.out.println(option3.orElse("빈 옵셔널 객체입니다."));
		System.out.println(option3.orElseGet(String::new));
	}

}
