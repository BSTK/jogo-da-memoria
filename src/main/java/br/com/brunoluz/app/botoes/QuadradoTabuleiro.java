package br.com.brunoluz.app.botoes;

import java.awt.Color;
import java.awt.Cursor;

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
		
		setName("QuadradoTabuleiro");
		setBackground(Color.WHITE);
		
		iconeTabuleiro.setIcon(Icone.comImagem(icone));
		iconeTabuleiro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iconeTabuleiro.setVisible(Boolean.FALSE);
		
		iconeNaoEncontrado.setIcon(Icone.naoEncontrado());
		iconeNaoEncontrado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iconeNaoEncontrado.setVisible(Boolean.TRUE);
		
		add(iconeTabuleiro);
		add(iconeNaoEncontrado);
		
		eventos();
		
	}
	
	
	/**
	 * eventos
	 */
	private void eventos() {
		
		iconeTabuleiro.addMouseListener(new ClickIconeTabuleiro());
		iconeNaoEncontrado.addMouseListener(new ClickIconeNaoEncontrado());
		
		/*iconeTabuleiro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				iconeTabuleiro.setVisible(Boolean.FALSE);
				iconeNaoEncontrado.setVisible(Boolean.TRUE);
			}
		});
		
		iconeNaoEncontrado.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				iconeTabuleiro.setVisible(Boolean.TRUE);
				iconeNaoEncontrado.setVisible(Boolean.FALSE);
				
			}
		});*/
		
	}

}
