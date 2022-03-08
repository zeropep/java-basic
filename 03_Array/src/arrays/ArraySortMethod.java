package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortMethod {

	public static void main(String[] args) {
		int[] intArr = new int[12];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.floor(Math.random() * 100)) + 1;
			System.out.print(intArr[i] + " ");
		}
		System.out.println("\n=================================================");
		
		// 순차정렬
		Arrays.sort(intArr);
		
		for (int i : intArr) {
			System.out.print(i + " ");
		}
		System.out.println("\n=================================================");
		
		// 역정렬
//		Arrays.sort(intArr, Collections.reverseOrder());
		// Collections는 기본형 데이터타입은 불가능. 객체형태여야 함 => integer[]
		
		for (int i : intArr) {
			System.out.print(i + " ");
		}

	}

}
