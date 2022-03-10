package dbservice;

public class WebApplication {

	public static void main(String[] args) {
		Service svc = new WebService();
		svc.read();
		
		Service svc2 = new WebService();
		svc2.read();
	}
}
