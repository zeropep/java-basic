package banking;

import java.util.Scanner;

class BankAccount {

	private int balance;

	public BankAccount() {}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int money) {
		this.balance = money;
	}
	
	public boolean deposit(int money, User owner) {
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
	
	public boolean withdraw(int money, User owner) {
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
	
	public boolean transfer(int money, User sender, User receiver) { 
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

	public void printResult(int money, String sender, String receiver) {
		System.out.println(sender + " 님으로부터 " + receiver + " 님에게 " + money + "원 이체 완료.");
		
	}	
}

class User {
	private String name;
	private int cashAmount;
	private BankAccount account;
	
	public User() {}

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

	public BankAccount getAccount() {
		return account;
	}

	public void setAccount(BankAccount account) {
		this.account = account;
	}
	
}

public class Banking {

	public static void main(String[] args) {
		// 메뉴 1계좌개설 2입금 3출금 4이체 0종료
		// 계좌개설 이름 현금보유 계좌객체(초기잔액) 현금이랑
		// 입출금 현금이랑 잔고
		// 이체
		Scanner sc = new Scanner(System.in);
		User me = null;
		User you = null;
		BankAccount myBa = null;
		BankAccount urBa = null;
		int menu = 0;
		boolean isOk;
		boolean service = true;
		
		System.out.println("반갑습니다.");
		
		while (service) {
			System.out.println("원하시는 메뉴 번호를 선택하세요.");
			System.out.println("메뉴 > 1. 계좌개설  2. 잔액조회  3. 입금  4. 출금  5. 이체  6. 종료");
			
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				String[] userInfo = getUserInfo(sc);
				me = new User(userInfo[0], Integer.parseInt(userInfo[1]));
				myBa = new BankAccount();
				me.setAccount(myBa);
				String[] userInfo2 = getUserInfo(sc);
				you = new User(userInfo2[0], Integer.parseInt(userInfo2[1]));
				urBa = new BankAccount();
				you.setAccount(urBa);
				
				System.out.println("계좌가 생성되었습니다.");

				break;
			case 2:
				System.out.print(me.getName() + "님의 계좌의 현재 잔액은 ");
				System.out.println(me.getAccount().getBalance() + "원 입니다.");
				break;
			case 3:
				System.out.println("입금할 금액 > ");
				int saving = sc.nextInt();
				
				isOk = me.getAccount().deposit(saving, me);
				if (isOk) { // 다른곳에서 연결된 기능이라고 가정
					System.out.println("[입금완료]");
					System.out.println(me.getName() + " 님의 계좌로 " + saving + "원 입금");
				} else {
					System.out.println("[입금실패]");					
				}
				
				break;
			case 4:
				System.out.println("출금할 금액 > ");
				int withdrawl = sc.nextInt();
				
				isOk = me.getAccount().withdraw(withdrawl, me);
				if (isOk) { // 다른곳에서 연결된 기능이라고 가정
					System.out.println("[출금완료]");
					System.out.println(me.getName() + " 님의 계좌로부터 " + withdrawl + "원 출금");
				} else {
					System.out.println("[출금실패]");					
				}
				break;
			case 5:
				System.out.println("이체할 금액 > ");
				int transfer = sc.nextInt();
				
				isOk = me.getAccount().transfer(transfer, me, you);
				if (isOk) { // 다른곳에서 연결된 기능이라고 가정
					System.out.println("[이체완료]");
					System.out.println(you.getName() + " 님의 계좌로 " + transfer + "원 이체");
				} else {
					System.out.println("[이체실패]");					
				}
				break;
			case 6:
				System.out.println("뱅킹서비스를 종료합니다");
				System.out.println("감사합니다.");
				service = false;
				break;

			default:
				System.out.println("정확한 메뉴 번호를 입력해주세요.");
				break;
			}
		}
	}

	private static String[] getUserInfo(Scanner sc) {
		System.out.println("예금주 명 > ");
		String name = sc.next();
		System.out.println("현금 보유액 > ");
		String money = sc.next();
		String[] infos = {name, money};
		return infos;
	}
}
