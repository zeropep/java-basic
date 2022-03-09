package objects;

class Pet {
	// Pet의 member 변수들
	String nickName = "amstrong";
	boolean gender = false;
	int age = 0;
	char kind = 'A';
	
	public Pet() {
		age++;
		// Constructor 생성자
		// 생성자는 class 이름과 같다.
		// 외부에서 인식할 수 있게 함과 동시에 내부적으로도 동적으로 기능한다.(age++)
	}
	
	// Pet의 member method들
	void move() {
		// 사실상 변수에 영향을 주지 않기 때문에 독립속성 method
		System.out.println("she is moving");
	}
	
	void sound() {
		// 사실상 변수에 영향을 주지 않기 때문에 독립속성 method
		System.out.println("mew");
	}
	
	void getAge() {
		// 변수에 영향을 주기 때문에 종속속성 method
		age++;
	}
}

public class Person {

	public static void main(String[] args) {
		Pet myCat = new Pet();
		System.out.println(myCat.nickName); // amstrong
		System.out.println(myCat.gender); // false
		System.out.println(myCat.age); // 3, 생성자로 인해 age + 1
		System.out.println(myCat.kind); // A
		
		myCat.getAge();
		System.out.println(myCat.age); // 4, getAge()를 실행해서 age + 1
		
		myCat.nickName = "amstrong junior";
		System.out.println(myCat.nickName); // amstrong junior
	}

}
