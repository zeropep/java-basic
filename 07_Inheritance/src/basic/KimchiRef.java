package basic;

public abstract class KimchiRef extends Freezer { // 김치냉장
	// extends로 Electronic의 속성을 상속받을 수 있다.
//	private boolean power;
//	private int button;
//	private String feature;
	// 하지만 이 변수들은 이 kimchiRef의 것이 아니기 때문에
	// 부모객체에서 가져와야 한다.
	@Override
	public boolean isPower() {
		
		return super.isPower();
		// super : 부모 클래스 (parent class, 여기서는 electronic을 지칭)
	}
	@Override
	public int getButton() {
		
		return super.button;
		// super가 아닌 this로 줄 수도 있다.
	}
	@Override
	public String getFeature() {
		
		return super.feature;
	}
	@Override
	public void setButton(int button) {
		System.out.println("발효버튼 추가");
		super.button = button;
	}
	@Override
	public void setFeature(String feature) {
		System.out.println("발효과학 추가");
		super.feature = feature;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a KimchiRef";
	}
	// 기본적으로 상속은 한가지만 가질 수 있는 단일상속이다.
	// 단일 상속이란 부모객체를 하나만 가져올 수 있다는 말이다. (자식객체를 하나만 가질수 있는게 아님)
	// 하지만 object의 class에서도 가져올 수 있기 때문에 
	// 단일상속 보다는 한개의 부모객체만 가질 수 있다고 표현함이 더 바람직하다.
	// object의 class는 조상객체라고 한다.
	
}
