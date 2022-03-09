package homework_teacher;

class BankAccount4 {
	private String owner;
	private int accountNumber;
	private double deposit;
	
	public BankAccount4() {
		this.deposit = 0.0;
		System.out.println("계좌가 생성되었습니다. > 현재 잔액 : " + this.deposit);
		// ...
		// 말고도 여러 코드가 더 있다고 가정.
	}
	
	public BankAccount4(String owner) {
		this();
		this.owner = owner;
	}
	
	public BankAccount4(String owner, int accountNumber) {
		// 여기서..위에있는 BankAccount4()를 부르면 되지 않을까?
		// => BankAccount4() 는 error발생함 => 생성자는 객체생성연산자(new)만 부를 수 있다.
		// 그럼 new를 붙이면 되나?
		// => error 는 발생안함 => 하지만 이건 새로운 주솟값에 할당되는거임
		// 그래서 사용가능한 방법.
		// this();
		this(owner);
		// 얘는 위의 string params만 가지고 있는 BankAccount4(String owner)를 부른다.
		// 주의점!
		// 절대생성자는 순서가 매우 중요하며, 연쇄적으로 부르기 때문에 위에 위치해있어야 한다.
		this.accountNumber = accountNumber;
	}
	// <주의점 1.>
	// BankAccount4(String owner, int accountNumber) 얘를 부른다고 하더라도 구조상 기본생성자를 먼저 부르게 되어있음.
	// 기본 생성자 BankAccount4()는 가장 먼저 호출되어서 데이터구조에서 가장 밑에 쌓이게(stack)된다.
	// 그렇기때문에 순서상 맨 위에 위치하게 되어있는 것이다.
	
	// <주의점 2.>
	// main에서 기본생성자를 쓰지 않는다면 이 기본 생성자를 선언하지 않아도 괜찮다.
	// overloading된 생성자만 사용할수도 있음.
	// 하지만 기본생성자를 사용할 때에는 항상 기본생성자를 선언해야 한다.
	
	// <주의점 3.>
	// 생성자에 무분별하게 method를 넣거나 연산을 많이 넣으면 지연로딩이 발생함.
	// 생성자는 말그대로 초기셋팅 등만 담당하게 코딩을 짠다.

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

public class BankService3 {

	public static void main(String[] args) {
		BankAccount4 myBa = new BankAccount4("park", 123456789);
		myBa.saving(1000000);
		myBa.withdraw(500000);				
		myBa.withdraw(500001);			
		
	}
}
