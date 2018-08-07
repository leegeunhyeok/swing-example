import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SubView extends JPanel {
	
	public SubView(MainFrame frame) {
		
		JLabel label = new JLabel("SubView");
		label.setBounds(150, 50, 100, 50);  // 위치 지정
		
		JButton toMain = new JButton("Go to Main");
		toMain.setBounds(150, 150, 100, 50); // 위치 지정
		toMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 컨테이너 인스턴스의 change 메소드 호출
				frame.change("main"); // main 화면으로 전환 요청
			}
		});
		
		// 사용자가 좌표로 위치를 지정하기 위해서는(setBounds) 레이아웃을 null로 설정해야함
		setLayout(null); 
		
		add(label);
		add(toMain);
	}
}
