package br.com.brunoluz.app.botoes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.brunoluz.util.Icone;

public class QuadradoTabuleiro extends JPanel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel iconeTabuleiro = new JLabel();
	private JLabel iconeNaoEncontrado = new JLabel();

	
	/**
	 * QuadradoTabuleiro
	 */
	public QuadradoTabuleiro(String icone) {
		
		setBackground(Color.WHITE);
		
		iconeTabuleiro.setIcon(Icone.comImagem(icone));
		iconeTabuleiro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		iconeNaoEncontrado.setIcon(Icone.naoEncontrado());
		iconeNaoEncontrado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		add(iconeTabuleiro);
		add(iconeNaoEncontrado);
		
		eventos();
		
	}
	
	
	/**
	 * eventos
	 */
	private void eventos() {
		
		iconeTabuleiro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Click icone tabuleiro");
			}
		});
		
		iconeNaoEncontrado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Click icone não encontrado");
			}
		});
		
	}

}
