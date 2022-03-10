package innerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AnonymousClass {

	public static void main(String[] args) {
		JButton btn = new JButton("Start");
		
		// 안드로이드에서 많이 사용하는 형식
		// 인터페이스를 implements한 클래스를 익명으로 만들어 객체로 구현함.
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent a) {
				System.out.println("ActionEvent Occured");
			}
		});
	}
}
