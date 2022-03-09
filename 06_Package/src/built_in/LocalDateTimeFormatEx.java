package built_in;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFormatEx {

	public static void main(String[] args) {
		LocalDateTime todayNow = LocalDateTime.now();
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // month와 hour는 대문자
		String todayNowForm = df.format(todayNow);
		
		System.out.println(todayNowForm);
		
		// 굳이 변수 만들지 않고 순간순간의 시간만 필요할 때
		System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(todayNow));
	}
}
