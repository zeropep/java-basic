package thread;

class Threaderable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class Threader extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadEx01 {

	public static void main(String[] args) {
		Threader t1 = new Threader();
		Runnable t2 = new Threaderable();
		Thread t3 = new Thread(t2);
		
		t1.start();
		t3.start();
		
		// thread-0과 thread-1이 섞여서 나온다.
		// 결과적으로 t1과 t3는 서로 독립적으로 진행된다는 것을 알 수 있음.
		// thread는 동기화를 맞출 수 없다.
		// 이를 해결하기 위해 synchronized기술을 사용할 수 있다.
	}

}
