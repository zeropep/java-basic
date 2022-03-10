package addrbook;

import java.util.ArrayList;

public class AddressBook {

	public static void main(String[] args) {
		ArrayList<Address> addrDatas = new ArrayList<>(); // java 1.8이상부터 뒤의 <data type>은 생략가능.
		AddressMenu addrMenu = new AddressMenu();
		addrMenu.processor(addrDatas);
	}

}
