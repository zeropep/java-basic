package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	String name;
	int age;
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + " : " + age;
	}
}

public class SetEx02 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
//		set.add("java");
//		set.add("java");
//		set.add(new Member("Park", 40));
//		set.add(new Member("Park", 40));
		
//		System.out.println(set);
		// set은 hashcode를 가져다가 저장한다.
		// member는 생성자를 통해 새로 만들어지는 순간 개별적인 hashcode를 갖기 때문에 내용이 같더라도 
		// 다른 객체로 간주되며, 그냥 String의 경우 같은 존재라고 인식된다.
		
		set.add(new Member("Park", 40));
		set.add(new Member("Park", 41));
		set.add(new Member("Park", 42));
		set.add(new Member("Park", 43));
		
		for (Object object : set) {
			System.out.println(object.toString());
		}
		// 순서가 보증되지 않는다.
		
		
		System.out.println("=============================");
		
		// 순환구조를 만들 수 있게 하기위해 iterator를 사용하기도 한다.
		// 이렇게 만들면 while문을 사용할 수 있게 됨.
		Iterator<Member> iterator = set.iterator();
		while (iterator.hasNext()) {
			Member member = (Member) iterator.next();
			System.out.println(member);
			
		}
		
	}

}
