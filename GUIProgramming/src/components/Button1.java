package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Button1 {
	public static void main(String[] args) {
		//프레임
		JFrame frame = new JFrame("레이아웃 예제");
		frame.setSize(250, 120);
		frame.setLocation(200, 100);
		
		//버튼 객체 추가 - SOUTH,NORTH - 프레임의 가로 크기와 일치
		JButton button1 = new JButton("북");
		JButton button2 = new JButton("남");
		JButton button3 = new JButton("동");
		JButton button4 = new JButton("서");
		JButton button5 = new JButton("중앙");
		
		//프레임 추가, 배치
		frame.add(button1, BorderLayout.NORTH); //버튼을 프레임에 추가
		frame.add(button2, BorderLayout.SOUTH);
		frame.add(button3, BorderLayout.EAST);
		frame.add(button4, BorderLayout.WEST);
		frame.add(button5, BorderLayout.CENTER);
		
		//디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
