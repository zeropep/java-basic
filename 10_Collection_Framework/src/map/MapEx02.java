package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("kim", 90);
		map.put("lee", 100);
		map.put("park", 80);
		map.put("jung", 95);
		map.put("choi", 85);
		
		// 순환을 위해 Map을 Set으로 변환
		Set set = map.entrySet();
		
		// 순환구조로 변경
		Iterator iterator = set.iterator();
		
		// 순환구조에서 조회
		while (iterator.hasNext()) {
			// 다시 key=value 형태로 변경
			// map의 인터페이스 안에 entry 인터페이스
			// key값과 value값을 나눌 수 있음.
			Map.Entry entry = (Map.Entry) iterator.next();
			
			System.out.print("이름:" + entry.getKey() + ", ");
			System.out.println("점수:" + entry.getValue());
		}
		
		Set nameSet = map.keySet();
		System.out.println("명단: " + nameSet);
		
		Collection values = map.values();
		// Collections : 집합들의 최상위 객체
		// Collection : 단일 객체, ArrayList/Map/Set 중에 뭘로 할지 잘 모를때 사용...
		
		iterator = values.iterator();
		
		int total = 0;
		while (iterator.hasNext()) {
			int i = (int) iterator.next();
			total += i;
		}
		System.out.println("총점: " + total);
		System.out.println("평균: " + (double) total/values.size());
		System.out.println("최고점수: " + Collections.max(values));
		System.out.println("최고점수: " + Collections.min(values));
		
		
		// 봐두면 좋은 것들.
		// Collection FramWork - <interface>
		// Collection, Enumeration, Iterator List Map MapEntry Queue Set SortedMap SortedSet
		// Collection FramWork - <class>
		// ArrayList, Collections, HashMap, HashSet, Locale, Optional, Stack, Properties, StringTokenizer, UUID
		
;	}

}
