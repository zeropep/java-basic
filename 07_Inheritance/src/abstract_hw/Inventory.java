package abstract_hw;

import java.util.Scanner;

public class Inventory {
	private Picachu picachu;
	private KKobugi kkobugi;
	private LeeSangHaeSea leeSangHaeSea;
	private PyLee pyLee;
	
	public Character choiceCharacter(int cno) {
		Scanner sc = new Scanner(System.in);
		int chNum = 0;
		if (cno == 0) {
			System.out.println("원하는 캐릭터를 선택하세요 > ");
			System.out.println("1.피카츄  2.꼬북이  3.이상해씨  4.파이리");
			chNum = sc.nextInt();			
		} else {
			chNum = cno;
		}
//		Character ch = null;
		
		switch (chNum) {
		case 1:
			if (getPicachu() == null) {
				// 필드를 써도 되지만..정보를 저장하는 곳은 저장만 하고,
				// 실제적으로 데이터값을 변동하는 것은 getter와 setter를 사용하는 것이 바람직하다.
				// 실제로 현업에서는 getter setter에 인증을 부여하거나 transaction을 걸기도 함.
				setPicachu(new Picachu());
			}
//			ch = getPicachu();								
			break;
		case 2:
			if (getKkobugi() == null) {
				setKkobugi(new KKobugi());
			}
//			ch = getKkobugi();	
			break;
		case 3:
			if (getLeeSangHaeSea() == null) {
				setLeeSangHaeSea(new LeeSangHaeSea());
			}
//			ch = getLeeSangHaeSea();	
			break;
		case 4:
			if (getPyLee() == null) {
				setPyLee(new PyLee());
			}
//			ch = getPyLee();	
			break;

		default:
			System.out.println("캐릭터를 잘못 선택하셨습니다.");
			return null;
		}
		return getCharacter(chNum);
	}
	
	public Character getCharacter(int cno) {
		Character ch = null;
		switch (cno) {
		case 1:
			ch = getPicachu();
			break;
		case 2:
			ch = getKkobugi();
			break;
		case 3:
			ch = getLeeSangHaeSea();
			break;
		case 4:
			ch = getPyLee();
			break;

		default:
			break;
		}
		return ch;
	}
	
	public final Picachu getPicachu() {
		return picachu;
	}
	public final void setPicachu(Picachu picachu) {
		this.picachu = picachu;
	}
	public final KKobugi getKkobugi() {
		return kkobugi;
	}
	public final void setKkobugi(KKobugi kkobugi) {
		this.kkobugi = kkobugi;
	}
	public final LeeSangHaeSea getLeeSangHaeSea() {
		return leeSangHaeSea;
	}
	public final void setLeeSangHaeSea(LeeSangHaeSea leeSangHaeSea) {
		this.leeSangHaeSea = leeSangHaeSea;
	}
	public final PyLee getPyLee() {
		return pyLee;
	}
	public final void setPyLee(PyLee pyLee) {
		this.pyLee = pyLee;
	}

	
}
