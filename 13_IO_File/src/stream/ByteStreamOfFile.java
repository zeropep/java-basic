package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamOfFile {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		final String PATH_OUT = "outFile.txt";
		final String PATH_IN = "inFile.txt";
		
		try {
			fos = new FileOutputStream(PATH_OUT);
			fis = new FileInputStream(PATH_IN);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int n;
		
		try {
			while ((n = fis.read()) != -1) {
				System.out.println(n);
				fos.write(n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// fis와 fos의 작동이 정상적으로 완료되면 fis와 fos에 남은 값은 없다.
		// while문이 끝나고 fis와 fos를 닫아 resource leaking을 막아야 한다.
		if (fis != null) {
			fis.close();
		}
		if (fos != null) {
			fos.close();
		}
		
		// 중간에 오류가 생기면 처음부터 다시 해야하는 문제가 있으므로
		// 대용량 파일에 사용하는 것은 추천되지 않는다.
		// 그럴때는 대신 객체복사 기능을 사용함.
		// 바이트를 받아와서 그대로 전달하는 기능으로, 정확하지만 속도가 느리다.
		// 여기서말하는 대용량 파일은 1기가바이트 이상을 말한다.
		// 그 이하는 byteStream형식이 대부분이다.
	}

}
