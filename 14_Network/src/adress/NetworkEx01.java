package adress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkEx01 {

	public static void main(String[] args) throws UnknownHostException {
		// java.net.* 패키지에 네트워크 관련 클래스가 있음.
		InetAddress ip = null;
		InetAddress[] ipArr = null;
		
		ip = InetAddress.getByName("www.naver.com");
		
		System.out.println("ip.getHostAddress() : " + ip.getHostAddress()); // 223.130.200.104
		System.out.println("ip.getHostName() : " + ip.getHostName()); // www.naver.com
		System.out.println("ip.toString() : " + ip.toString()); // www.naver.com/223.130.200.104
		
		byte[] ipAddr = ip.getAddress();
		System.out.println("getAddress() : " + Arrays.toString(ipAddr)); // [-33, -126, -56, 104]
		
		String result = "";
		for (int i = 0; i < ipAddr.length; i++) {
			result += (ipAddr[i] < 0) ? ipAddr[i] + 256 : ipAddr[i];
			result += ".";
		}
		
		System.out.println("getAddress + 256 : " + result); // 223.130.195.200.
		System.out.println("---------------------------------------");
		
		// www.naver.com => DNS => Converting(Name -> Number) => 
		
		ip = InetAddress.getLocalHost();
		
		System.out.println("ip.getHostAddress() : " + ip.getHostAddress());
		System.out.println("ip.getHostName() : " + ip.getHostName());
		System.out.println("ip.toString() : " + ip.toString());
	}

}
