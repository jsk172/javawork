package calculator2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator2 extends JFrame implements ActionListener{
	//필드
	String[] operator = {"+", "-", "*", "/"};
	JComboBox<String> comboBox;
	JButton calcBtn;
	JButton resetBtn;
	JLabel label;
	JTextField text1; //첫째 수 입력
	JTextField text2; //둘째 수 입력
	JTextField text3; //결과

	//생성자
	public Calculator2() {
		//윈도우(프레임) 생성
		this.setTitle("사칙연산 프로그램");
		this.setSize(300, 120);
		this.setLocation(200, 100);
		//패널 2개 생성
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		this.add(pane1,BorderLayout.NORTH);
		this.add(pane2,BorderLayout.CENTER);

		//컴포넌트 객체 생성
		//pane1에 객체 올리기
		pane1.setLayout(new FlowLayout());
		text1 = new JTextField(5);
		//콤보박스
		comboBox = new JComboBox<>(operator);
		text2 = new JTextField(5);
		//레이블
		label = new JLabel("=");
		text3 = new JTextField(5);
		//버튼객체
		pane2.setLayout(new FlowLayout());
		calcBtn = new JButton("계산");
		resetBtn = new JButton("취소");

		//pane1, 2에 배치하고 올리기
		pane1.add(text1);
		pane1.add(comboBox);
		pane1.add(text2);
		pane1.add(label);
		pane1.add(text3);

		pane2.add(calcBtn);
		pane2.add(resetBtn);

		//이벤트
		calcBtn.addActionListener(this);
		resetBtn.addActionListener(this);

		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}//생성자끝

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == calcBtn) {
			int num1 = Integer.parseInt(text1.getText());
			String op = (String)comboBox.getSelectedItem();
			int num2 = Integer.parseInt(text2.getText());

			if(op.equals("+")) {
				int sum = num1 + num2;
				text3.setText(String.valueOf(sum)); //숫자를 문자형으로 변환
			}else if(op.equals("-")) {
				int sub = num1 - num2;
				text3.setText(String.valueOf(sub));
			}else if(op.equals("*")) {
				int mul = num1 * num2;
				text3.setText(String.valueOf(mul));
			}else if(op.equals("/")) {
				double div = (double)num1 / num2;
				text3.setText(String.valueOf(div));
			}else {

			}
		}
		
		if(e.getSource() == resetBtn) {
			text1.setText(null);
			text2.setText(null);
			text3.setText(null);
		}
		
	}
}
