package loginForm;

public class user {
	private String id;
	private String pwd;
	
	public user() {}

	public user(String id, String pwd) {
		this.id = id;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", pwd=" + pwd + "]";
	}
	
	
}
