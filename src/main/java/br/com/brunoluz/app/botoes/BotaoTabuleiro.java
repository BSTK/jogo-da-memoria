package br.com.brunoluz.app.botoes;

import java.awt.Color;
import java.awt.Cursor;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotaoTabuleiro extends JButton {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String EXTENSAO = ".png";
	
	private static final String PATH_ICONES = "/icones/botoes/";
	
	private Random random = new Random();
	
	
	/**
	 * BotaoTabuleiro
	 */
	public BotaoTabuleiro() {

		setBackground(Color.WHITE);
		
		setBorderPainted(false);
		setFocusPainted(false);
		setContentAreaFilled(false);
		
		setVerticalAlignment(CENTER);
		setHorizontalAlignment(CENTER);
		
		setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		setIcon(new ImageIcon(getClass().getResource(String.format("%s%s%s", PATH_ICONES, MapaBotoes.get(random.nextInt(50)), EXTENSAO))));
		
		addActionListener(new EventoClickBotaoNivel());

	}

	
}
