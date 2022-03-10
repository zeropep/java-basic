package basic;

public class Cooling {

	public static void main(String[] args) {
		// 냉장고를 제작하기 위한 시작점
		
		// ======================================================
		// 상속을 통한 다형성 구현, 다형성을 통한 상속으로 입증되는 리소스 검증
		Electronic elec = new Dimchae();
		System.out.println(elec.getButton());
		
		Electronic cooler = new Dimchae();
		Electronic freezer = new Dimchae();
		
		Electronic kimchi = new Dimchae();
		System.out.println(kimchi.isPower());

		kimchi.setButton(3);
		System.out.println(kimchi.getButton());
		// ======================================================
		
		// ======================================================
		// 추상클래스를 활용한 느슨한 연결을 상속을 통해서 구현
		// 추상클래스는 객체로 인스턴스를 만들수가 없기 때문에 구현되었을 때 문제가 되는 위험은 줄어듦
		// 테스트용 객체를 여러 개념이 도입된 방식을 만들 때 편하게 사용할 수 있음.
		Electronic dim1 = new Dimchae();
		System.out.println(elec.getButton());
		
		KimchiRef dim2 = new Dimchae();
		Freezer dim3 = new Dimchae();
		
		Cooler dim4 = new Dimchae();
		System.out.println(dim4.isPower());

		dim4.setButton(3);
		System.out.println(dim4.getButton());
		// ======================================================
		
		Electronic elec2 = new Electronic() {

			@Override
			void buttonColor(String color) {
				// TODO Auto-generated method stub
				
			}
			// Electronic elec2 = new Electronic();는 불가능함.
			// 추상클래스는 기능이 존재하지만 instance화가 불가능하므로
			// 생성자를 꺼내와서 객체로써 존재할 수 있게 함.
		};
	}
}
// 상속의 이유 1.
// 특정한 class를 extends하면 부모객체의 기능을 그대로 이용할 수 있음.
// (심지어 kimchiref class에 ispower라는 method가 없어도 작동.)
// 즉, 같은 코드를 다시 쓰지않아도 됨. 
// 효율성과 편의성의 증가.

// 상속의 이유 2.
// extends를 표기함으로써 데이터의 안정성 및 신뢰도를 보장할 수 있다.
// 이와 관련있는 단어가 polymorphism (다형성)이다.
// 물론 조금 느슨한 느낌은 있다.
// 풀어서 이야기하자면, 여기서 kimchiref에 ispower가 없음에도 electronic를 extends해서
// 사용하므로 ispower를 사용할수 있지만, 반대로 ispower가 사용된다고 해서 이게 extends를 받아서
// 사용하는 건지, kimchiref가 그냥 가지고 있는 건지 판단이 불가능 하다는 것이다.
// 다형성은 여기서 나오는데, 기본적으로 여러 class를 부모객체에 extends해서 
// 부모의 데이터 타입으로 만들 수 있다.
// ex) electronic kimchi = new kimchiRef();
// 이런 식으로 만들어서 만들어도 오류가 없다.
// 하지만 이 상태에서 kimchi.setButton(3);을 하면 오류가 발생하는데
// 이것은 부모객체에서 받아온 속성이 아님을 말해주는 것이다.
// 이러한 판단을 내려주는 것이 다형성의 본질이라는 것이다.

// 물론 이러한 단점들 - 즉 부모객체 타입으로 만들어진 객체는 자식객체만의 기능을 사용할 수 없다는 단점이 발생하므로
// implement란 개념을 사용해야 한다.
// 부모객체에 setter를 설정해주고 다시 실행시켜보면 kimchi.setButton(3);이 정상작동함을 알 수 있다.
// 자손객체에 변수는 이제 없어도 된다.
// 마찬가지로 부모 class에 setter가 있으니 자손 class에서 해당 setter의 내용을 바꾸지 않을 거라면
// setter가 꼭 존재할 필요는 없다. 그냥 extends를 통해 부모 class의 setter를 이용하게 된다.