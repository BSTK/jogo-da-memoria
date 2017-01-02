package br.com.brunoluz.app;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Main {

	/**
	 * main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {

			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
			
			SwingUtilities.invokeLater(new Runnable() {
				@Override
				public void run() {
					new App().setVisible(true);
				}
			});
			
		} catch (Exception e) {
			System.err.println("ERROR [{}] - Main");
		}
	}

}