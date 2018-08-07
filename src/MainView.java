import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainView extends JPanel {
	
	public MainView(MainFrame frame) {
		
		JLabel label = new JLabel("MainView");
		label.setBounds(150, 50, 100, 50);  // 위치 지정
		
		JTextField f1 = new JTextField();
		JTextField f2 = new JTextField();
		f1.setBounds(150, 100, 100, 20);
		f2.setBounds(150, 120, 100, 20);
		
		JButton toSub = new JButton("Go to Sub");
		toSub.setBounds(150, 150, 100, 50); // 위치 지정
		toSub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 컨테이너 인스턴스의 change 메소드 호출
				frame.change("sub"); // sub 화면으로 전환 요청
			}
		});
		
		// 사용자가 좌표로 위치를 지정하기 위해서는(setBounds) 레이아웃을 null로 설정해야함
		setLayout(null); 
		
		add(label);
		add(toSub);
		add(f1);
		add(f2);
	}
}
