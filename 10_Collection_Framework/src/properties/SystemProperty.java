package properties;

import java.util.Properties;

public class SystemProperty {

	public static void main(String[] args) {
		// property file을 받으면 property로 만들 수 있음.
		// 이제는 거의 Library로 가능
		
		Properties sysProp = System.getProperties();
		
		System.out.println("java version : " + sysProp.getProperty("java.version"));
		System.out.println("user.language : " + sysProp.getProperty("user.language"));
		sysProp.list(System.out);
	}

}
