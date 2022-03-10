package relation;

public class Professor extends Person {
	private String[] subjects; // 강의 과목
	
	public Professor() {
		System.out.println("This is Professor Instance");
	}
	
	public void printSubjects() {
		System.out.println(name + " 교수님의 개설 과목");
		for (String subject : subjects) {
			System.out.println("개설과목 : " + subject);
		}
	}

	public final String[] getSubjects() {
		return subjects;
	}

	public final void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	
}
