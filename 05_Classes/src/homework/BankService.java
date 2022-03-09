package homework;

import java.util.Scanner;

class BankAccount {
	String holder;
	int accountNum;
	int balance;
	int count = 0;
	int[] accountNumArr = new int[10];
	
	// 계좌만들기
	public BankAccount(String holder, int balance) {
		// 1. 만들 수 있는 계좌의 숫자는 10개로 한정 
		// (굳이 상관은 없지만 contains를 안배운 상태에서 계좌중복을 일일이 다 검사해야되서..)
		// 2. 계좌번호는 랜덤으로 입력됨.
		// 3. 기존 계좌와 중복검사 후 확정.
		if (count < 10 ) {
			for (int i = 0; i < 1; i++) {
				int account = (int) Math.floor(Math.random() * 90000) + 10000;
				for (int j = 0; j < accountNumArr.length; j++) {
					if (accountNumArr[j] == account) {
						i--;
						break;
					}
				}
				this.accountNum = account;
				accountNumArr[count] = account;
				count++;	
			}
		} else {
			System.out.println("계좌 숫자가 한계에 도달했습니다. 현재 계좌의 수 : " + count);
		}

		this.holder = holder;

		this.balance = balance;
	}
	
	// 계좌 현황
	void checkBalance() {
		System.out.print(this.holder + "님의 계좌번호는 ");
		System.out.print(this.accountNum + "이며, 잔액은 현재 ");
		System.out.println(this.balance + "원 입니다.");
	}
	
	// 입금하기
	void deposit(Scanner sc) {
		System.out.println("예금액을 입력하세요");
		int depMoney = sc.nextInt();
		this.balance += depMoney;
		System.out.println(this.holder + "님의 잔액은 " + this.balance + "원 입니다.");
	}
	
	// 출금하기
	void withdraw(Scanner sc) {
		System.out.println("출금액을 입력하세요");
		int witMoney = sc.nextInt();
		if (this.balance >= witMoney) {
			this.balance -= witMoney;
			System.out.println(this.holder + "님의 잔액은 " + this.balance + "원 입니다.");			
		} else {
			System.out.println("잔액이 부족하여 출금이 불가능합니다. 현재 잔액은 " + this.balance + "원 입니다.");
		}
	}
	
	// 송금하기
	void transfer(BankAccount receiver, Scanner sc) {
		System.out.println("이체액을 입력하세요");
		int transMoney = sc.nextInt();
		if (this.balance >= transMoney) {
			this.balance -= transMoney;
			receiver.balance += transMoney;
			System.out.println(this.holder + "님으로부터 " + receiver.holder + "님께 " + transMoney + "원 이체하였습니다.");
		} else {
			System.out.println("잔액이 부족하여 이체가 불가능합니다. 현재 잔액은 " + this.balance + "원 입니다.");
		}
	}
	
	// 은행서비스 종료
	void termination() {
		System.out.println("서비스를 종료합니다.");
		System.out.println("감사합니다.");

	}
}

public class BankService {

	public static void main(String[] args) {
		
		// 계좌를 미리 만들어놨습니다.
		BankAccount myAccount = new BankAccount("park", 1000000);
		BankAccount someone = new BankAccount("kim", 1000000);
		
		Scanner sc = new Scanner(System.in);
		
		boolean service = true;
		
		System.out.println("환영합니다.");
		while (service) {
			System.out.println("원하시는 메뉴번호를 선택하세요.");
			System.out.println("==== 1. 계좌현황  2. 입금  3. 출금  4. 이체  5. 종료 ====");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("누구의 계좌가 궁금하십니까?");
				System.out.println("==== 1. park  2. kim ====");
				int accNum = sc.nextInt();
				
				if (accNum == 1) {
					myAccount.checkBalance();
				} else if (accNum == 2) {
					someone.checkBalance();
				} else {
					System.out.println("정확한 메뉴번호를 입력해주세요.");
				}
				break;
			case 2:
				myAccount.deposit(sc);
				break;
			case 3:
				myAccount.withdraw(sc);
				break;
			case 4:
				myAccount.transfer(someone, sc);
				break;
			case 5:
				myAccount.termination();
				service = false;
				break;

			default:
				System.out.println("정확한 메뉴번호를 선택해주세요");
				break;
			}
		}
	}
}
