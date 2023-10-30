package layouts;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest {
	public static void main(String[] args) {
		//FlowLayout - 왼쪽에서 오른쪽으로 배치
		JFrame frame = new JFrame("레이아웃 예제");
		frame.setSize(400, 100);
		frame.setLocation(200, 100);
		
		//레이아웃 배치
//		FlowLayout layout = new FlowLayout();
		frame.setLayout(new FlowLayout());
		
		//컴포넌트 배치
		frame.add(new JButton("계란"));
		frame.add(new JButton("두부"));
		frame.add(new JButton("콩나물"));
		frame.add(new JButton("라면"));
		
		//디스플레이
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
