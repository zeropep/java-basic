package arrays;

import java.util.Arrays;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// 다차원 배열 구조
		// 2차원 배열 => [[1], [2], [3]]
		// : 1차원배열길이는 3, 2차원배열 길이는 1
		// 3차원 배열 => [[[1], [2]], [[3], [4]], [[5], [6]]]
		// : 1차원배열길이는 3, 2차원배열 길이는 2, 3차원배열 길이는 1
		
		// java에서 1차원 배열의 길이는 사전에 정의되어야 함
		// 2차원부터는 가변배열로, 개수가 달라질 수 있다.
		
		
		// 2차원 배열의 선언 및 초기화 with value
		int[][] intArr2D = new int[4][]; // 1차원의 길이는 필수
		int[][] intArr2DV = new int[4][2]; // 2차원의 길이는 가변, 잘 사용하지 않음
		
		System.out.print("[");
		for (int i = 0; i < intArr2DV.length; i++) {
			System.out.print("[");
			for (int j = 0; j < intArr2DV[i].length; j++) {
				intArr2DV[i][j] = (int)(Math.floor(Math.random() * 100)) + 1;
				System.out.print(intArr2DV[i][j] + " ");
			}
			System.out.print("]");
		}
		System.out.print("]");
		
		
		// 2차원 배열의 선언 및 초기화 with value
		String[][] strArr = {{"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}};
		for (String[] elem : strArr) {
			System.out.println(Arrays.toString(elem));			
		}

	}

}
