package adress;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// url 정보 생성
		URL url = new URL("https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=101&oid=092&aid=0002239683");
		
		// 접속해서 정보 요청
		URLConnection conn = url.openConnection(); 
		
		System.out.println("1 : " + conn.getContent());
		System.out.println("2 : " + conn.getConnectTimeout());
		System.out.println("3 : " + conn.getContentEncoding());
		System.out.println("4 : " + conn.getContentLength());
		System.out.println("5 : " + conn.getContentType());
		System.out.println("6 : " + conn.getDate());
		System.out.println("7 : " + conn.getHeaderFields());
		System.out.println("8 : " + conn.getExpiration());
		System.out.println("9 : " + conn.getLastModified());
	}

}
