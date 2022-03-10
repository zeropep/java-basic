package relation;

public class Staff extends Person {
	private String job;
	
	public Staff() {
		System.out.println("This is Staff Instance");
	}
	
	public void printJob() {
		System.out.println(name + " 직원의 업무는 " + job);
	}

	public final String getJob() {
		return job;
	}

	public final void setJob(String job) {
		this.job = job;
	}
	
}
