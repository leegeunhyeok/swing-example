import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainView extends JPanel {
	
	public MainView(MainFrame frame) {
		
		JLabel label = new JLabel("MainView");
		label.setBounds(150, 50, 100, 50);  // ��ġ ����
		
		JTextField f1 = new JTextField();
		JTextField f2 = new JTextField();
		f1.setBounds(150, 100, 100, 20);
		f2.setBounds(150, 120, 100, 20);
		
		JButton toSub = new JButton("Go to Sub");
		toSub.setBounds(150, 150, 100, 50); // ��ġ ����
		toSub.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// �����̳� �ν��Ͻ��� change �޼ҵ� ȣ��
				frame.change("sub"); // sub ȭ������ ��ȯ ��û
			}
		});
		
		// ����ڰ� ��ǥ�� ��ġ�� �����ϱ� ���ؼ���(setBounds) ���̾ƿ��� null�� �����ؾ���
		setLayout(null); 
		
		add(label);
		add(toSub);
		add(f1);
		add(f2);
	}
}
