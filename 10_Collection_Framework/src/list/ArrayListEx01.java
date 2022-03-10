package list;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(1); 
		// arraylist는 push대신 add를 사용한다.
		// int로 넣어진것 같지만 object를 받기 때문에 객체형식으로 저장된다.
		// list1.add(new Integer(1)); 얘랑 같은 의미기는 한데 현재 이방식은 deprecated 되었으므로 그냥 숫자로 넣자.
		list1.add(43);
		list1.add(23);
		list1.add(88);
		list1.add(12);
		
		for (int i = 0; i < list1.size(); i++) { // 길이는 size() 메서드를 사용.
			System.out.println("index " + i + " : " + list1.get(i)); // 값을 가져오고 싶을떈 get(index) 메서드 사용.
		}
		System.out.println(list1);
		System.out.println("12 포함여부 : " + list1.contains(12));
	}

}
