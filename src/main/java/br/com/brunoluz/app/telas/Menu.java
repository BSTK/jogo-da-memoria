package br.com.brunoluz.app.telas;

import java.awt.Rectangle;

import javax.swing.JFrame;

import br.com.brunoluz.app.painel.MenuOpcoes;

public class Menu extends JFrame {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Menu
	 */
	public Menu() {
		super("Jogo da memória");
		setName("frameMenu");
		setBounds(new Rectangle(500, 500));
		setResizable(false);
		add(new MenuOpcoes());
	}
}
