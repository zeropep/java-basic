package tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOExceptionEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		InputStreamReader isr = new InputStreamReader(System.in);
		// 실제로 값을 받음
		BufferedReader br = new BufferedReader(isr);
		// 받아온 값을 변환
		
		try {
			String name = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				// resource leaking(자원 누수)를 방지
				// 이거 자체도 또 tryCatch로 br을 검사해야함.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
