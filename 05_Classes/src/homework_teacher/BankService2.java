package homework_teacher;

class BankAccount2 {
	private String owner = "Park_j";
	private int accountNumber = 100200300;
	private double deposit;
	// class 안쪽의 변수는 기본적으로 private 속성을 가진다.
	// 왜냐하면 class와 method를 통하지 않고 변수에 직접 접근하여 값을 바꾸는 것을 방지하기 위해서이다.
	// private 속성을 가지면 변수값을 직접 읽을 수조차 없다.
	
	public BankAccount2() {
		deposit = 0.0;
	}
	
	public void saving(int money) {
		deposit = deposit + money;
		printDeposit();
	}
	
	public void withdraw(int money) {
		if (deposit < money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			deposit = deposit - money;
		}
		printDeposit();
	}
	
	public void printDeposit() {
		System.out.println("현재 잔액" + deposit);
	}
}

public class BankService2 {

	public static void main(String[] args) {
		BankAccount2 myBa = new BankAccount2();
		
		myBa.saving(1000000);
		myBa.withdraw(500000);				
		myBa.withdraw(500001);			
		
	}
}
