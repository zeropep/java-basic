package polymorphism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class WithList {
	// 다형성을 이용하면 여러타입의 하위객체들을 통일된 상위객체의 타입으로 이용할 수 있다.
	// 아래의 코드처럼 타입마다 검증하는 로직이 필요가 없게 되어 코드량을 획기적으로 줄일 수 있다.
	// 상위개념이 완벽할수록 하위객체가 더 간단해지며, 하위객체에서 오류가 발생하면 
	// 상위객체에 무엇인가 부족한 것이 있다는 의미가 되기도 한다.

	public static void main(String[] args) {
		List list = new ArrayList<>();
		List linkedList = new LinkedList<>();
		List vector = new Vector<>();
		List stack = new Stack<>();
		
		list.add(linkedList);
		list.add(vector);
		list.add(stack)
		
		for (int i = 0; i < list.size(); i++) {
			List el = (List) list.get(i);
		}
	}

}
