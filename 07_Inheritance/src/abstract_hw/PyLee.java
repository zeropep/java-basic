package abstract_hw;

public class PyLee extends Character {
	
	public PyLee() {
		cno = 4;
		hp = 120;
		mp = 60;
		System.out.println("파이리 생성");
		printStatus(); // 생성 후 파이리 상태정보를 출력
	}

	@Override
	public void eat() {
		mp += 35;
	}

	@Override
	public void sleep() {
		mp += 35;
	}

	@Override
	public void play() {
		mp -= 35;
		hp += 30;
	}

	@Override
	public boolean train() {
		mp -= 35;
		hp += 20;
		levelUp();
		return checkMp(); // Character의 public boolean checkMp()과 연결하기 위함
	}

	@Override
	public void levelUp() {
		if (hp >= 60) {
			hp -= 60;
			level++;
		}
	}
}
