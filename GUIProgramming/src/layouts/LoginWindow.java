package layouts;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginWindow {
	public static void main(String[] args) {
		//프레임 - 윈도우 전체
		JFrame frame = new JFrame();

		//제목 표시줄 - 내용
		frame.setTitle("Login");
		frame.setSize(300, 200); //300px - 너비, 200px - 높이
		frame.setLocation(200, 100); //x좌표 - 200, y좌표 - 100
		frame.setLayout(null); //레이아웃 객체가 생성하지 않은 상태

		JLabel label = new JLabel("아이디");
		label.setSize(80, 30);
		label.setLocation(50, 40); //x좌표, y좌표
		frame.add(label); //프레임에 라벨을 추가해야 화면에 출력됨.

		//입력상자
		JTextField text1 = new JTextField();
		text1.setSize(110,20);
		text1.setLocation(110, 40);
		frame.add(text1);

		JLabel label2 = new JLabel("비밀번호");
		label2.setSize(80, 30);
		label2.setLocation(50, 70); //x좌표, y좌표
		frame.add(label2); //프레임에 라벨을 추가해야 화면에 출력됨.

		//입력상자
		JTextField text2 = new JTextField();
		text2.setSize(110,20);
		text2.setLocation(110, 70);
		frame.add(text2);


		JButton button = new JButton("로그인");
		button.setSize(75, 30);
		button.setLocation(110, 100); //x좌표, y좌표
		frame.add(button);

		//윈도우 종료(닫기)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우 디스플레이
		frame.setVisible(true);
	}
}
