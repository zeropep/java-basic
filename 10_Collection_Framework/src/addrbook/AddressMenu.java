package addrbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressMenu {
	
	private Scanner sc = new Scanner(System.in);
	private int menu;
	private boolean flag = true;
	private final String MENU_STR = "1.추가  2.검색  3.수정  4.삭제  5.전체출력  6.데이터초기화  0.종료";

	public void processor(ArrayList<Address> addrDatas) {
		int idx = 0;
		while (flag) {
			System.out.println(MENU_STR);
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				addrDatas.add(inputObject());
				break;
			case 2:
				idx = searchIndex(addrDatas);
				if (idx < 0) {
					System.out.println("검색결과가 없습니다.");
				} else {
					System.out.println(addrDatas.get(idx));
				}
				break;
			case 3:
				// 수정시에는 architecture 적으로 데이터를 입력하고 원하는 것을 삭제하는 것이 맞다.
				idx = searchIndex(addrDatas);
				System.out.println("수정할 정보를 입력합니다..");
				addrDatas.add(idx, inputObject());
				addrDatas.remove(idx + 1);					
				break;
			case 4:
				idx = searchIndex(addrDatas);
				if (idx < 0) {
					System.out.println("검색결과가 없습니다.");
				} else {
					System.out.println(addrDatas.remove(idx));
				}
				break;
			case 5:
				for (Address address : addrDatas) {
					System.out.println(address);
				}
				break;
			case 6:
				addrDatas.clear();
				System.out.println("모든 데이터가 초기화되었습니다.");
				break;
			case 0:
				flag = false;
				break;

			default:
				System.out.println("정확한 메뉴번호를 입력해주세요.");
				break;
			}
		}
		System.out.println("시스템이 종료됩니다.");
	}

	private int searchIndex(ArrayList<Address> addrDatas) {
		System.out.println("1.이름으로 찾기  2.전화번호로 찾기");
		int choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("찾을 이름 > ");
			String name = sc.next();
			
			for (int i = 0; i < addrDatas.size(); i++) {
				if (name.equals(addrDatas.get(i).getName())) {
					return i;
				}
			}
		} else {
			System.out.println("찾을 번호 > ");
			String tel = sc.next();
			
			for (int i = 0; i < addrDatas.size(); i++) {
				if (tel.equals(addrDatas.get(i).getTel())) {
					return i;
				}
			}
		}
		return -1; // 검색결과가 없다는 의미로 -1(인덱스번호가 아니니까)
	}

	private Address inputObject() {
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("전화번호 > ");
		String tel = sc.next();
		System.out.println("주소 > ");
		String addr = sc.next();
		
		return new Address(name, tel, addr);
	}

}
