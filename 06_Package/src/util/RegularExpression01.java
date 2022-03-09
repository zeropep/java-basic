package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression01 {

	public static void main(String[] args) {
		String[] strArr = {"bat", "baby", "bonus", "cA", "ca", "co", "c", "c0", "car", "combat",
				"count", "date", "disc"};
		Pattern pattern = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자 영단어
		
		for (String str : strArr) {
			Matcher matcher = pattern.matcher(str); // 배열을 꺼내서 패턴에 맞춰보는 기능
			if (matcher.matches()) {
				System.out.print(str + ", ");
			}
		}
		String str1 = "\\D"; // 정규식에서는 원화표시를 사용하는데, 코드상에서는 "\"로 표시되므로 이를 string형식으로 받아들이라는 \표시를 추가해주어야 한다.
	}

}
