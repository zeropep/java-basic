package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		// 실제 구조상 Collection Framework 소속은 아니다.
		// 키 - 밸류 로 구성되는 자료에 대해서는 map을 사용하면 좋다.
		// ex. id-ArrayList(사용기록), serielNum-ArrayList(정보)
		// 키값은 중복될 수 없음.
		
		Map map = new HashMap();
		// Map<키값 데이터타입, 밸류값 데이터타입> map = new HashMap<>(); 으로 만드는 것이 정석
		
		map.put("abc", "1234");
		map.put("bcd", "2345");
		map.put("cde", "3456");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw를 입력해주세요");
			System.out.println("id > ");
			String id = sc.next();
			System.out.println("pw > ");
			String pw = sc.next();
			
			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다");
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
			} else {
				System.out.println("입력한 id는 존재하지 않습니다.");
				break;
			}
		}
	}

}
