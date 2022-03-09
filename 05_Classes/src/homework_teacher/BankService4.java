package homework_teacher;

class BankAccount3 {
	private String owner;
	private int accountNumber;
	private double deposit;
	// class 안쪽의 변수는 기본적으로 private 속성을 가진다.
	// 왜냐하면 class와 method를 통하지 않고 변수에 직접 접근하여 값을 바꾸는 것을 방지하기 위해서이다.
	// private 속성을 가지면 변수값을 직접 읽을 수조차 없다.
	
	public BankAccount3() {
		this.deposit = 0.0;
		// class의 멤버변수임을 뜻하는 this를 붙여서 params와 구분한다.
		// params를 받지 않는 멤버 변수도 this.를 써준다.
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void saving(int money) {
		this.deposit += money;
		printDeposit();
	}
	
	public void withdraw(int money) {
		if (this.deposit < money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			this.deposit -= money;
		}
		printDeposit();
	}
	
	public void printDeposit() {
		System.out.println("현재 잔액" + this.deposit);
	}
}

public class BankService4 {

	public static void main(String[] args) {
		BankAccount3 myBa = new BankAccount3();
		myBa.setOwner("park");
		myBa.saving(1000000);
		myBa.withdraw(500000);				
		myBa.withdraw(500001);			
		
	}
}
