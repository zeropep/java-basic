package loginForm;

import java.util.ArrayList;
import java.util.Scanner;

public class JoinMenu {
	
	Scanner sc = new Scanner(System.in);
	private boolean flag = true;
	private final String MENU_BAR = "1.회원가입  2.로그인  3.종료 : ";

	public void flow(ArrayList<user> userList) {
		while (flag) {
			System.out.print(MENU_BAR);
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				String id = checkDuple(userList);
				if (id != null) {
					System.out.print("비밀번호 입력 : ");
					String pwd = sc.next();
					userList.add(new user(id, pwd));
				} 
				break;
			case 2:
				validAccountCheck(userList);
				break;
			case 3:
				flag = false;
				break;

			default:
				System.out.println("정확한 메뉴 번호를 입력하세요");
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}

	private void validAccountCheck(ArrayList<user> userList) {
		boolean isFound = false;
		System.out.print("아이디를 입력 : ");
		String id = sc.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = sc.next();
		
		for (user user : userList) {
			if (id.equals(user.getId())) {
				isFound = true;
				if (pwd.equals(user.getPwd())) {
					System.out.println(user.getId() + "님이 로그인에 성공하였습니다.");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
					break;
				}
			}
		}
		if (!isFound) {
			System.out.println("아이디가 존재하지 않습니다.");			
		}
	}

	private String checkDuple(ArrayList<user> userList) {
		System.out.print("아이디를 입력 : ");
		String id = sc.next();
		
		for (user user : userList) {
			if (user.getId().equals(id)) {
				System.out.println("이미 존재하는 아이디입니다.");
				return null;
			}
		}
		return id;
	}
}
