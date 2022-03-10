package relation;

public class Student extends Person{
	private String[] subjects;
	
	public Student() {
//		super(); 생략이 되어있음, 순서상 부모객체가 먼저 만들어져야 하므로 최우선 순서를 갖는다.
		System.out.println("This is Student Instance");
	}

	public void printSubjects() {
		System.out.println(name + " 학생의 수강과목 리스트");
		for (String subject : subjects) {
			System.out.println("수강과목 : " + subject);
		}
	}

	public final String[] getSubjects() {
		return subjects;
	}

	public final void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
}
