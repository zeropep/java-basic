package tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsEx {

	public static void main(String[] args) throws IOException {
		// throws는 exception발생을 method 단위로 보낼 수 있음.
		// tryCatch문이 코드상으로 복잡해 보일 때 사용 가능.
		// 이 throw는 같은 exception종류가 발생할 것이라고 예상될 때만 사용을 권장한다.
		// 단점으로는 정확하게 어디에서 exception이 발생하는 것인지 파악이 힘들다.
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String name = br.readLine();
		br.close();
	}

}
