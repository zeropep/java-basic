package creation;

public class MakeMethod {

	public static void main(String[] args) {
		// 메서드는 반드시 이름을 갖는다.
		// 사용중인 main 메서드를 분석해보자
		// 접근제한자(public) 저장특성(static) 리턴타입(void) 메서드명(main)(파라미터(String[] args)) { 메서드 실행 로직 영역}
		// method 안에 다른 method를 사용불가하므로 에러가 발생
		// void => 리턴을 하지 않는 메서드
		// 리턴타입이 존재하면 반드시 메서드 실행 로직영역에 
		// return과 리턴타입에 일치하는 데이터를 만들어야 함.
		// 파라미터 또한 데이터 타입을 지정해주어야 함
		
		// method명은 소문자로 시작할 것 => class와 혼동 방지
		
		
		/* method 모양의 예제
		 * void method1() {
		 * 
		 * }
		 * 
		 * void method2(int i) {
		 * 
		 * }
		 * 
		 * int method3(String str, char ch) { return 0; }
		 */
		
		// java는 새로운 객체를 만드려면 new라는 객체생성연산자를 통해 새로운 주소값을 할당해주어야 하지만
		// static을 사용하면 특별 관리대상으로 편입되면서 특별한 저장위치에서 저장을 함
		// 메서드가 다른 메서드를 호출할 때 호출하려는 method가 static 속성이거나
		// 호출하려는 method를 갖고 있는 class의 주소값이 필요하다 => new를 통해 instance화 된 객체 
		
	}

}
