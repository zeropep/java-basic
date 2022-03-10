package loginForm;

import java.util.ArrayList;

public class LoginPage {

	public static void main(String[] args) {
		ArrayList<user> userList = new ArrayList<>();
		JoinMenu joinMenu = new JoinMenu();
		joinMenu.flow(userList);
	}

}
