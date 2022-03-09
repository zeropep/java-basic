package homework_teacher;

class BankAccount6 {

	private int balance;

	public BankAccount6() {}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int money) {
		this.balance = money;
	}
	
	public boolean deposit(int money, User6 owner) {
		if (money > owner.getCashAmount()) {
			System.out.println("입금 실패");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유액 : " + owner.getCashAmount());
			return false;
		} else {
			balance += money;
			owner.setCashAmount(owner.getCashAmount() - money);
			System.out.println(money + "원 입금 완료");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유액 : " + owner.getCashAmount());
			return true;			
		}
	}
	
	public boolean withdraw(int money, User6 owner) {
		if (money > balance) {
			System.out.println("출금 실패");
			System.out.println("잔고 : " + balance);
			System.out.println("출금액 : " + money);
			return false;
		} else {
			balance -= money;
			owner.setCashAmount(owner.getCashAmount() + money);
			System.out.println(money + "원 출금 완료");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유액 : " + owner.getCashAmount());
			return true;			
		}
	}
	
	public boolean transfer(int money, User6 sender, User6 receiver) { 
		if (money > sender.getAccount().balance) {
			System.out.println("이체 실패");
			System.out.println("잔고 : " + sender.getAccount().balance);
			System.out.println("이체액 : " + money);
			return false;
		} else {
			sender.getAccount().setBalance(sender.getAccount().getBalance() - money);
			receiver.getAccount().setBalance(receiver.getAccount().getBalance() + money);
			printResult(money, sender.getName(), receiver.getName());
			return true;
		}
	}

	private void printResult(int money, String sender, String receiver) {
		System.out.println(sender + " 님으로부터 " + receiver + " 님에게 " + money + "원 이체 완료.");
		
	}	
}

class User6 {
	private String name;
	private int cashAmount;
	private BankAccount6 account;
	
	public User6() {}

	public User6(String name, int cashAmount) {
		this.name = name;
		this.cashAmount = cashAmount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}

	public BankAccount6 getAccount() {
		return account;
	}

	public void setAccount(BankAccount6 account) {
		this.account = account;
	}
}

public class BankService6 {

	public static void main(String[] args) {	
		User6 me = new User6("park", 20000);
		
		User6 you = new User6();
		you.setName("kim");
		you.setCashAmount(100000);

		BankAccount6 myBa = new BankAccount6();
		BankAccount6 urBa = new BankAccount6();
		
		me.setAccount(myBa);
		you.setAccount(urBa);
		
		me.getAccount().setBalance(10000);
		you.getAccount().setBalance(10000);
		me.setCashAmount(me.getCashAmount() - 10000);
		you.setCashAmount(you.getCashAmount() - 10000);

		System.out.println("현재 잔고 " + you.getAccount().getBalance());
		System.out.println("현재 현금 " + you.getCashAmount());

		you.getAccount().deposit(50000, you);
		
		you.getAccount().withdraw(30000, you);
		
		you.getAccount().transfer(10000, you, me);
		
		System.out.println("현재 잔고 " + you.getAccount().getBalance());
		System.out.println("현재 잔고 " + me.getAccount().getBalance());
		
	}
}
