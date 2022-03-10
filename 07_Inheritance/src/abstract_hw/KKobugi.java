package abstract_hw;

public class KKobugi extends Character {
	
	public KKobugi() {
		cno = 2;
		hp = 100;
		mp = 50;
		System.out.println("꼬부기 생성");
		printStatus(); // 생성 후 꼬부기 상태정보를 출력
	}

	@Override
	public void eat() {
		mp += 15;
	}

	@Override
	public void sleep() {
		mp += 15;
	}

	@Override
	public void play() {
		mp -= 15;
		hp += 10;
	}

	@Override
	public boolean train() {
		mp -= 15;
		hp += 5;
		levelUp();
		return checkMp(); // Character의 public boolean checkMp()과 연결하기 위함
	}

	@Override
	public void levelUp() {
		if (hp >= 50) {
			hp -= 50;
			level++;
		}
	}
}
