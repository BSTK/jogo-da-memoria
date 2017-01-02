package br.com.brunoluz.app;

import javax.swing.JFrame;

public class App extends JFrame {

	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * App
	 */
	public App() {
		super("Jogo da memória");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 500, 500);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	
}