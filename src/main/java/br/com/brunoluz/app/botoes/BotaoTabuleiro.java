package br.com.brunoluz.app.botoes;

import static br.com.brunoluz.util.Constantes.PATH_ICONES;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotaoTabuleiro extends JButton {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * BotaoTabuleiro
	 */
	public BotaoTabuleiro(String icone) {

		setBackground(Color.WHITE);
		
		setBorderPainted(false);
		setFocusPainted(false);
		setContentAreaFilled(false);
		
		setVerticalAlignment(CENTER);
		setHorizontalAlignment(CENTER);
		
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		setIcon(new ImageIcon(getClass().getResource(String.format("%s%s", PATH_ICONES, icone))));
		
		addActionListener(new ClickBotaoNivel());

	}

	
}
