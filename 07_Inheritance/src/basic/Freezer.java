package basic;

public abstract class Freezer extends Cooler {
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
		System.out.println("냉동버튼 추가");
		super.button = button;
	}
	@Override
	public void setFeature(String feature) {
		System.out.println("냉동과학 추가");
		super.feature = feature;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a Freezer";
	}
}
