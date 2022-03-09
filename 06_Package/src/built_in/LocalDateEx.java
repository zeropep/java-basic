package built_in;

import java.time.LocalDate;
import java.util.Date;

public class LocalDateEx {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		// Wed Nov 10 15:39:39 KST 2021
		// 구버전으로 변환과정이 다소 복잡하여 Deprecated 될 것 같음.
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		// 2021-11-10
		
		System.out.println(today.getDayOfMonth()); // 10 이번달 10일째
		System.out.println(today.getDayOfYear()); // 314 이번년도 314일째
		System.out.println(today.getMonthValue()); // 11 이번년도 11개월째
		System.out.println(today.getYear()); // 2021 이번 년도
		System.out.println(today.getChronology()); // ISO 기준
		System.out.println(today.getDayOfWeek()); // WEDNESDAY 요일
		System.out.println(today.getEra()); // CE 기원후
		System.out.println(today.getMonth()); // NOVEMBER 11월 영어표기
	}

}
