package br.com.brunoluz.app;

import java.awt.Rectangle;

import javax.swing.JFrame;

import br.com.brunoluz.app.painel.Tabuleiro;

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
		setBounds(new Rectangle(600, 600));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Tabuleiro());
	}
	
	
}