package relation;

public class RelationMain {

	public static void main(String[] args) {
		Person p = new Person();
		p.setNum(1);
		p.setName("person");
		p.setDept("dept");
		p.setAddr("addr");
		p.printInfo();
		System.out.println("=================");
		
		Professor pf = new Professor();
		// 상속을 받는다는것은 부모객체부터 호출한다는 의미이다.
		// 자손객체가 먼저 부모객체를 만드는건 논리적으로 맞지 않음.
		pf.setNum(2);
		pf.setName("김자바");
		pf.setDept("컴퓨터공학");
		pf.setAddr("경기도 인천");
		pf.setSubjects(new String[] {"전산학개론", "C 프로그래밍", "JAVA 프로그래밍"});
		pf.printInfo();
		pf.printSubjects();
		System.out.println("=================");
		
		Student std = new Student();
		std.setNum(3);
		std.setName("이코딩");
		std.setDept("컴퓨터공학");
		std.setAddr("서울 강남구");
		std.setSubjects(new String[] {"JAVA 프로그래밍", "운영체제", "알고리즘"});
		std.printInfo();
		std.printSubjects();
		System.out.println("=================");
		
		Staff stf = new Staff();
		stf.setNum(4);
		stf.setName("박행정");
		stf.setDept("HR");
		stf.setAddr("경기도 성남");
		stf.setJob("인사관리");
		stf.printInfo();
		stf.printJob();
	}

}
