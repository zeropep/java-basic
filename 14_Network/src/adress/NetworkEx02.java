package adress;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class NetworkEx02 {

	public static void main(String[] args) throws IOException, URISyntaxException {
		// URL = Uniformed Resource Location (정형화된 자원 위치)
		URL url = new URL("https://news.naver.com/main/read.naver?mode=LSD&mid=shm&sid1=101&oid=092&aid=0002239683");
		
		System.out.println("Authority : " + url.getAuthority());
		System.out.println("Content : " + url.getContent());
		System.out.println("DefaultPort : " + url.getDefaultPort());
		System.out.println("Port : " + url.getPort()); // -1 에러값. 보안상 가져올 수 없음.
		System.out.println("File : " + url.getFile());
		System.out.println("Host : " + url.getHost());
		System.out.println("Protocol : " + url.getProtocol());
		System.out.println("--------------- 아래 두개는 중요 ----------------");
		System.out.println("Path : " + url.getPath());
		System.out.println("Query : " + url.getQuery());
		System.out.println("Ref : " + url.getRef());
		System.out.println("UserInfo : " + url.getUserInfo());
		System.out.println("ExternalForm : " + url.toExternalForm());
		System.out.println("URI : " + url.toURI());
	}

}
