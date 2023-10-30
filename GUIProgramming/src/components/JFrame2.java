package components;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrame2 {
	public static void main(String[] args) {
		//프레임 - 윈도우 전체
		JFrame frame = new JFrame();
		//제목 표시줄 - 내용
		frame.setTitle("처음 만드는 윈도우");
		frame.setSize(300, 200); //300px - 너비, 200px - 높이
		frame.setLocation(200, 100); //x좌표 - 200, y좌표 - 100
		frame.setLayout(null); //레이아웃 객체가 생성하지 않은 상태
		
		//레이블(글자 출력)
		JLabel label = new JLabel("안녕~ Java");
		label.setSize(80, 30);
		label.setLocation(100, 40); //x좌표, y좌표
		frame.add(label); //프레임에 라벨을 추가해야 화면에 출력됨.
		
		//버튼 생성
		JButton button = new JButton("확인");
		button.setSize(70, 30);
		button.setLocation(100, 80); //x좌표, y좌표
		frame.add(button);
		
		
		//윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우 디스플레이
		frame.setVisible(true);
	}
}
