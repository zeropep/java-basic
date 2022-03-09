package util;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String src = "100, 200, 300, 400";
		StringTokenizer st = new StringTokenizer(src, ", ");
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		// 순환구조로 사용 가능.
		// split으로 배열형으로 만드는것보다 쉽긴하다.
		// index번호는 없으므로 필요하면 split이 더 낫다.
		
		String exp = "x=100*(100+10)/3";
		StringTokenizer st2 = new StringTokenizer(exp, "=-+*/()", true);
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		// token뒤에 true를 사용하면 token에 사용된 모든 기호를(혹은 내용을) 포함하여
		// 모두 각각의 token으로 사용할 수 있다.
		// false를 사용하면 구분자(token)을 제외한 내용만을 추출할 수 있다.
	}

}
