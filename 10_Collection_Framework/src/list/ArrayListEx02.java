package list;

import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add(1, "A-1"); // 지정한 인덱스에 끼워넣기 > 이후 인덱스는 하나씩 밀린다.
		
		System.out.println(strList); // [A, A-1, B, C]
		
		ArrayList<String> strList2 = new ArrayList<>(strList.subList(2, 4)); // start index는 포함, end index는 포함하지 않음.
		System.out.println(strList2);
		
		strList.addAll(strList2);
		strList.addAll(1, strList2); // 인덱스 번호가 밀리기 때문에 주의할 것
		System.out.println(strList);
		
		strList.retainAll(strList2); // 두 리스트가 겹치는 것을 제외하고 삭제(strList)
		System.out.println(strList);
		
		// 리스트 내에 다른 리스트의 요소가 모두 포함되어 있는지 여부 판단
		System.out.println(strList.containsAll(strList2)); // true 	
		
		strList2.remove(1);
		System.out.println(strList2);
		
		strList.clear();
		System.out.println(strList); // []
		System.out.println(strList == null); // false (안쪽의 value값만 사라지고 객체값은 null이 아님.)
		// 이 ArrayList가 비어있는지 검사하려면 아래의 검사를 하자.
		System.out.println(strList.size() == 0); // true
		System.out.println(strList.isEmpty()); // true
		// ex. 게시판에 게시물이 없을때..
		
		
		// ETC
		// ArrayList에는 replace가 없음.
		// 교체를 위해서는 해당 값을 삭제하고 다시 집어넣어야함.
		// 동적배열이기 때문에 수정되기 전까지는 각 인덱스값에 값이 고정되어있어야 함.
		// 교체를 하려면 관리체계상 속도저하가 심하다고 한다.
		// LinkedList는 교체 메서드가 있긴 하다.
	}

}
