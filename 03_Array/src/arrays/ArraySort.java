package arrays;

public class ArraySort {

	public static void main(String[] args) {
		int[] intArr = new int[12];
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = (int)(Math.floor(Math.random() * 100)) + 1;
			System.out.print(intArr[i] + " ");
		}
//		System.out.println("\n=================================================");
//		intArr[0] = 101;
//		
//		for (int i = 0; i < intArr.length; i++) {
//			System.out.print(intArr[i] + " ");
//		}
		
		// 순차정렬
		System.out.println("\n=================================================");
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				if (intArr[i] > intArr[j]) {
					int num1 = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = num1;
					
				}
			}
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		// 역정렬
		System.out.println("\n=================================================");
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				if (intArr[i] < intArr[j]) {
					int num1 = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = num1;
					
				}
			}
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + " ");
		}
		
		// 효율적인 방법
		System.out.println("\n=================================================");
		int[] intArr2 = new int[12];
		
		for (int i = 0; i < intArr2.length; i++) {
			intArr2[i] = (int)(Math.floor(Math.random() * 100)) + 1;
			System.out.print(intArr2[i] + " ");
		}
		
		// 순차정렬
		System.out.println("\n=================================================");
		for (int i = 0; i < intArr2.length; i++) {
			System.out.print(intArr2[i]);
			if(i != intArr2.length - 1) {
				System.out.print(" ");
			}
		}
		
	}

}
