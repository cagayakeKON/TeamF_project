import UI.MainFrame;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());//管理外观
			new MainFrame();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}