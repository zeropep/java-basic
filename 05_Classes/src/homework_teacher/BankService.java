package homework_teacher;

class BankAccount {
	public String owner = "Park_j";
	public int accountNumber = 100200300;
	public double deposit = 0.0;
	
	public void saving(int money) {
		deposit = deposit + money;
	}
	
	public void withdraw(int money) {
		if (deposit < money) {
			System.out.println("잔액이 부족합니다.");
		} else {
			deposit = deposit - money;
		}
	}
}

public class BankService {

	public static void main(String[] args) {
		BankAccount myBa = new BankAccount();
		System.out.println("현재 잔액" + myBa.deposit);
		
		myBa.saving(1000000);
		System.out.println("현재 잔액" + myBa.deposit);
		
		myBa.withdraw(500000);
		System.out.println("현재 잔액" + myBa.deposit);
		
		myBa.withdraw(500001);
		System.out.println("현재 잔액" + myBa.deposit);
	}
}
