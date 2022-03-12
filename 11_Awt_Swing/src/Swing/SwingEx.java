package Swing;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

public class SwingEx {

	public static void main(String[] args) {
		// 작은 창 만들기
		JFrame jf = new JFrame("스윙프레임");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		jf.setSize(300, 300);
		
		// 텍스트를 넣을 패널을 만들기
		JTextPane jp = new JTextPane();
		StyledDocument sd = jp.getStyledDocument();
		
		// 텍스트 패널에 텍스트 입력
		try {
			sd.insertString(sd.getLength(), "insert text1", sd.getStyle("bold"));
			sd.insertString(sd.getLength(), "insert text2", sd.getStyle("bold"));
			sd.insertString(sd.getLength(), "insert text3", sd.getStyle("bold"));
			sd.insertString(sd.getLength(), "insert text4", sd.getStyle("bold"));
			sd.insertString(sd.getLength(), "insert text5", sd.getStyle("bold"));
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		
		// 텍스트 패널을 창에다 넣기
		jp.setPreferredSize(new Dimension(200, 200));
		jf.add(jp);
		jf.pack(); // 정렬
		
	}

}
