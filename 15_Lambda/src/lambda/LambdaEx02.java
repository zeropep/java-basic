package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaEx02 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		Consumer<Integer> method = (n) -> { System.out.println(n); };
		numbers.forEach(method);
		
		// Comsumer Interface 정보를 받아들여 가지고 있다가 반환해주는 기능을 한다.
		// function Interface라고 한다.
	}

}
