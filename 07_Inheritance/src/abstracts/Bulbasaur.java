package abstracts;

public class Bulbasaur extends Character {
	
	public Bulbasaur(String name) {
		this.name = name;
		hp = 80;
		mp = 70;
		System.out.println("이상해씨 생성됨");
	}

	@Override
	public void eat() {
		System.out.println(this.name + "은 먹이를 먹었습니다.");
		mp += 10;
	}

	@Override
	public void sleep() {
		System.out.println(this.name + "은 잠을 잡니다.");
		mp += 20;
	}

	@Override
	public void play() {
		System.out.println(this.name + "은 즐거운 활동을 했습니다.");
		mp -= 20;
		hp += 5;
	}

	@Override
	public boolean train() {
		System.out.println(this.name + "은 훈련을 완료했습니다.");
		mp -= 10;
		hp += 10;
		levelUp();
		return checkMp(); // Character의 public boolean checkMp()와 연결하기 위함
	}

	@Override
	public void levelUp() {
		if (hp >= 40) {
			System.out.println(this.name + "은 레벨업했습니다!.");
			hp -= 40;
			level++;
		} else {
			System.out.println(this.name + "은 레벨업하기엔 체력이 부족합니다.");
		}
	}
}
