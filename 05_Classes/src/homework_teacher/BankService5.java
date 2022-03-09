package homework_teacher;

// 추상화
// 은행계좌 정보 => BankAccount (소유자 <하지만 소유자 정보를 갖고있지는 않음>, 잔액)
// 사람은 은행계좌는 가질 수 있다. => (이름, 현금보유액, 은행계좌)
// 사람은 은행서비스를 통해서 은행계좌를 활용한다. (입금, 출금..)

class BankAccount5 {
//	private User owner;
	private int balance;

	public BankAccount5() {}

//	public BankAccount5(User owner) {
//		this.owner = owner;
//		this.balance = balance;
//	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int money) {
		this.balance = money;
	}
	
//	public User getOwner() {
//		return this.owner;
//	}
//	안쓰는건 애초에 만들지 말자.
	
	public boolean deposit(int money, User owner) {
		if (money > owner.getCashAmount()) {
			System.out.println("입금 실패");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유액 : " + owner.getCashAmount());
			return false;
		} else {
			owner.setCashAmount(owner.getCashAmount() + money);
			balance += money;
			System.out.println(money + "원 입금 완료");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유액 : " + owner.getCashAmount());
			return true;			
		}
	}
	
	public boolean withdraw(int money, User owner) {
		if (money > balance) {
			System.out.println("출금 실패");
			System.out.println("잔고 : " + balance);
			System.out.println("출금액 : " + money);
			return false;
		} else {
			balance -= money;
			owner.setCashAmount(owner.getCashAmount() - money);
			System.out.println(money + "원 출금 완료");
			System.out.println("잔고 : " + balance);
			System.out.println("현금보유액 : " + owner.getCashAmount());
			return true;			
		}
	}
	
}

class User {
	private String name;
	private int cashAmount;
	private BankAccount5 account;
	
	public User() {}
	// 보통 쓸일이 없어도 만들어둔다

	public User(String name, int cashAmount) {
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

	public BankAccount5 getAccount() {
		return account;
	}

	public void setAccount(BankAccount5 account) {
		this.account = account;
	}
	
	// 정보(값)을 주는 용도의 method => Setters
	// 정보(값)을 받는 용도의 method => Getters
	// getter와 setter는 가급적 커스터마이징을 하지 않는다.
	
	/* public BankAccount5 getAccount() { return this.account; }
	 * public void setAccount(BankAccount5 account) { this.account = account; }
	 * 그런데 수동으로 만들 수 있지만 변수가 많아지면 힘들다.
	 * 이를 자동으로 만들 수 있음.
	 */
	
}

public class BankService5 {

	public static void main(String[] args) {	
		User me = new User("park", 20000);
		
		User you = new User();
		you.setName("kim");
		you.setCashAmount(100000);
		
//		BankAccount5 myBa = new BankAccount5(me);
//		BankAccount5 urBa = new BankAccount5(you);
		BankAccount5 myBa = new BankAccount5();
		BankAccount5 urBa = new BankAccount5();
		
		me.setAccount(myBa);
		you.setAccount(urBa);
		
		me.getAccount().setBalance(10000);
		you.getAccount().setBalance(10000);
		me.setCashAmount(me.getCashAmount()-10000);
		you.setCashAmount(you.getCashAmount()-10000);
		
//		System.out.println(me.getAccount().getBalance());
//		System.out.println(me.getCashAmount());
		System.out.println("현재 잔고 " + you.getAccount().getBalance());
		System.out.println("현재 현금 " + you.getCashAmount());
		
		// System.out.println(myBa.getOwner()); => null 계좌는 사용자 정보를 가지고 있지 않음
		
//		you.getAccount().deposit(50000);
//		System.out.println("현재 잔고 " + you.getAccount().getBalance());
//		System.out.println("현재 현금 " + you.getCashAmount());
		// null point error 발생
		// 게좌쪽에 내 정보가 없음
		// 두가지 선택이 있음
		// [양방향 설계] => 개인도 계좌정보를 가지고 계좌도 사람정보를 가짐
		// 장점 : 코딩 초반에 편함, class갯수가 적으면 객체 접근이 쉬움
		// 단점 : class가 많아질수록 내가 어떤 객체를 선택하는건지 헷갈림
		// [단방향 설계] => 무조건 사람이 계좌정보를 가지고, 계좌사용시에 본인의 정보를 던져줘야함
		// 장점 : 구조적으로 단순해짐.
		// 단점 : 일일이 정보를 던져넣어야함.
		// <결론>
		// ===> 일반적으로 단방향 설계를 주로 한다.
		// ===> 1 to 1 을 기본으로 설계를 하고, 필요시에만 다 대 다 구조로 만든다.
		
		you.getAccount().deposit(50000, you);
		// 때로는 me라는 object 말고 me.Account 처럼 하나의 속성만 던져도 된다.
		
		you.getAccount().withdraw(30000, you);
		
	}
	
	// 정리 겸 팁
	// 주로하는 실수
	// 1. class가 너무 기능중심으로 뭉쳐있음
	// 2. 기능만 있어야 되는데 소유주의 정보까지 전부다 가지고있음
}
