import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SubView extends JPanel {
	
	public SubView(MainFrame frame) {
		
		JLabel label = new JLabel("SubView");
		label.setBounds(150, 50, 100, 50);  // ��ġ ����
		
		JButton toMain = new JButton("Go to Main");
		toMain.setBounds(150, 150, 100, 50); // ��ġ ����
		toMain.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// �����̳� �ν��Ͻ��� change �޼ҵ� ȣ��
				frame.change("main"); // main ȭ������ ��ȯ ��û
			}
		});
		
		// ����ڰ� ��ǥ�� ��ġ�� �����ϱ� ���ؼ���(setBounds) ���̾ƿ��� null�� �����ؾ���
		setLayout(null); 
		
		add(label);
		add(toMain);
	}
}
