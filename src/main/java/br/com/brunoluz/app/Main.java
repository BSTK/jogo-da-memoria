package br.com.brunoluz.app;

import java.io.IOException;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

	/**
	 * main
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		condiguraLookAndFeel();
		initGame();
	}
	
	
	/**
	 * Configura o LookAndFeel para o JFrame
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws UnsupportedLookAndFeelException
	 */
	private static void condiguraLookAndFeel() {
		
		try {
			
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
			
		} catch (Exception e) {
			System.err.println("ERROR [{}] - Main.condiguraLookAndFeel() {}");
		}
		
	}

	
	/**
	 * Inicia a tela principal
	 */
	private static void initGame() {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new App().setVisible(true);
			}
		});
		
	}

}