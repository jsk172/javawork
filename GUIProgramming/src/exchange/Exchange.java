package exchange;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exchange extends JFrame implements ActionListener{
	//필드
	String[] currency = {"달러", "위안", "유로", "엔"};
	static final float USD = 1357.50F; //환율 상수
	static final float CNY = 185.58F; //환율 상수
	static final float EUR = 1432.43F; //환율 상수
	static final float JPY = 9.04F; //환율 상수
	JPanel pane1;
	JPanel pane2;
	JLabel label1;
	JLabel label2; //변환결과
	JTextField text;
	JComboBox<String> comboBox;
	JButton button;
	
	//생성자
	public Exchange() {
		//frame(this) 생성
		this.setTitle("환율 변환기");
		this.setSize(350, 150);
		this.setLocation(200, 100);
		
		//1.Panel 2개 생성 - 위, 가운데 배치(BorderLayout)
		pane1 = new JPanel();
		pane2 = new JPanel();
		
		this.add(pane1, BorderLayout.NORTH);
		this.add(pane2, BorderLayout.CENTER);
		
		//2.Panel1 에 올릴 객체 생성 및 추가
		label1 = new JLabel("원화");
		label2 = new JLabel("변환 결과");
		text = new JTextField(8);
		comboBox = new JComboBox<>(currency);
		button = new JButton("변환");
		
		label1.setFont(new Font("맑은고딕", Font.PLAIN, 15)); //폰트변경(맑은고딕, 보통굵기, 크기30)
		label2.setFont(new Font("맑은고딕", Font.PLAIN, 20)); //폰트변경(맑은고딕, 보통굵기, 크기30)
		
		pane1.add(label1);
		pane1.add(text);
		pane1.add(comboBox);
		pane1.add(button);
		
		pane2.add(label2);
		
		//변환 버튼 이벤트
		button.addActionListener(this);
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			float won = Float.parseFloat(text.getText());
			String currency = (String)comboBox.getSelectedItem();
			
			if(currency.equals("달러")) {
				won = won / USD;
				label2.setText(String.format("%.2f＄", won));
			}else if(currency.equals("위안")){
				won = won / CNY;
				label2.setText(String.format("%.2f￥", won));
			}else if(currency.equals("유로")){
				won = won / EUR;
				label2.setText(String.format("%.2f€", won));
			}else if(currency.equals("엔")){
				won = won / JPY;
				label2.setText(String.format("%.2f￥", won));
			}
		}
		
	}
}
