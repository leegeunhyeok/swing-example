import java.awt.Container;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public static int WIDTH = 400;    // �����̳� ��
	public static int HEIGHT = 300;   // �����̳� ����
	
	private MainView mainView = null; // ���� ȭ�� �г�
	private SubView subView = null;   // ���� ȭ�� �г�
	
	
	// �����̳� ȭ�� ��ȯ�ϴ� �޼ҵ�
	public void change(String viewName) {
		Container container = getContentPane(); // ���� �����̳� ��������
		container.removeAll();                  // �����̳��� ��� ������Ʈ ����
		
		if (viewName.equals("main")) {
			container.add(mainView);
		} else if (viewName.equals("sub")) {
			container.add(subView);
		} else {
			// main, sub �� �ƴ� ��� main���� ����
			container.add(mainView);
		}
		
		revalidate(); // ������Ʈ ������ ���ʴ�� �ٽ� ����
		repaint();    // ���� �Ŀ� ������Ʈ �ٽ� �׸���
	}

	
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		
		// ȭ�� �̸� �ε� (�ν��Ͻ� ����)
		frame.mainView = new MainView(frame);
		frame.subView = new SubView(frame);
		
		// ���α׷��� ù ȭ���� main���� ����
		frame.change("main");
		
		// �����̳� ����
		frame.setTitle("ȭ�� ��ȯ �׽�Ʈ");
		frame.setSize(MainFrame.WIDTH, MainFrame.HEIGHT);
		frame.setResizable(false);  // ����ڰ� ���콺�� ȭ�� ũ�� ���� ���ϰ� ���� 
		frame.setVisible(true);     // ������ ���̱� 
	}

}
