package br.com.brunoluz.app;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

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
		configuracoes();
		adicionaComponentes();
	}
	
	
	/**
	 * configuracoes
	 */
	private void configuracoes() {
		setBounds(new Rectangle(600, 600));
		setUndecorated(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	/**
	 * Adiciona componentes ao JFrame
	 */
	private void adicionaComponentes() {
		add(new Tabuleiro());
		add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("icones/icone-0001.png"))));
	}
	
}