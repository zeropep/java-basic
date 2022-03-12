package thread;

class Account {
	private int balance = 1000;
	
	public int getBlance() {
		return this.balance;
	}
	
	public synchronized void withdraw(int money) throws InterruptedException {
		// 어느정도의 동기화는 가능하게 해준다
		// 하지만 순서상의 동기화를 보장하지는 않는다.
		// thread 요청을 할때 다음 요청까지는 기다려주지만, 같은 쓰레드가 연속해서 부르는 경우까지 막아주지는 않는다.
		if (balance >= money) {
			Threader.sleep(1000);
			balance -= money;
		}
	}
}

class Threadable01 implements Runnable {
	Account account = new Account();

	@Override
	public void run() {
		while (account.getBlance() > 0) {
			int money = ((int) (Math.random() * 5) + 1) * 10;
			try {
				account.withdraw(money);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">>> balance > " + account.getBlance());
		}
	}
	
}

public class ThreadEx03 {

	public static void main(String[] args) {
		Runnable r = new Threadable01();
		new Thread(r).start();
		new Thread(r).start();
	}

}
