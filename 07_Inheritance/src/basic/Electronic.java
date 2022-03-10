package basic;

public abstract class Electronic { // 전자제품
	protected boolean power;
	protected int button;
	protected String feature;
	// 상속 개념의 정점에 있는 부모객체, 즉 정보를 주는 입장의 class는 
	// 변수를 주로 protected로 가진다. (private인 경우도 있긴 함)
	
	public Electronic() {
		// 추상클래스도 생성자는 가질수 있긴 하다.
	}
	
	abstract void buttonColor(String color);
	// 추상 메서드.
	// 추상클래스는 개념화, 추상화가 목적이므로 개념적인 메서드 생성가능.
	// 단 추상메서드는 이를 상속받는 class가 강제적으로 override하게 되어있음.
	
	public boolean isPower() {
		return power ? true : false;
	}
	
	public int getButton() {
		return this.button;
	}
	
	public String getFeature() {
		return this.feature;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public void setButton(int button) {
		this.button = button;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}
	
}
