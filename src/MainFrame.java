import java.awt.Container;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public static int WIDTH = 400;    // 컨테이너 폭
	public static int HEIGHT = 300;   // 컨테이너 높이
	
	private MainView mainView = null; // 메인 화면 패널
	private SubView subView = null;   // 서브 화면 패널
	
	
	// 컨테이너 화면 전환하는 메소드
	public void change(String viewName) {
		Container container = getContentPane(); // 현재 컨테이너 가져오기
		container.removeAll();                  // 컨테이너의 모든 컴포넌트 제거
		
		if (viewName.equals("main")) {
			container.add(mainView);
		} else if (viewName.equals("sub")) {
			container.add(subView);
		} else {
			// main, sub 가 아닌 경우 main으로 지정
			container.add(mainView);
		}
		
		revalidate(); // 컴포넌트 계층을 차례대로 다시 검증
		repaint();    // 검증 후에 컴포넌트 다시 그리기
	}

	
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		
		// 화면 미리 로딩 (인스턴스 생성)
		frame.mainView = new MainView(frame);
		frame.subView = new SubView(frame);
		
		// 프로그램의 첫 화면은 main으로 설정
		frame.change("main");
		
		// 컨테이너 설정
		frame.setTitle("화면 전환 테스트");
		frame.setSize(MainFrame.WIDTH, MainFrame.HEIGHT);
		frame.setResizable(false);  // 사용자가 마우스로 화면 크기 조절 못하게 방지 
		frame.setVisible(true);     // 프레임 보이기 
	}

}
