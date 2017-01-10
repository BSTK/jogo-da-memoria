package br.com.brunoluz.app.botoes;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.brunoluz.util.Icone;

public class QuadradoTabuleiro extends JPanel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/// private JLabel iconeTabuleiro = new JLabel();
	/// private JLabel iconeNaoEncontrado = new JLabel();

	private JLabel icone = new JLabel();
	
	/**
	 * QuadradoTabuleiro
	 */
	public QuadradoTabuleiro(String imagem) {
		
		setBackground(Color.WHITE);
		
		/// iconeTabuleiro.setIcon(Icone.comImagem(imagem));
		/// iconeTabuleiro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		/// iconeTabuleiro.setVisible(Boolean.TRUE);
		
		/// iconeNaoEncontrado.setIcon(Icone.naoEncontrado());
		/// iconeNaoEncontrado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		/// iconeNaoEncontrado.setVisible(Boolean.TRUE);
		
		/// add(iconeTabuleiro);
		/// add(iconeNaoEncontrado);	
		
		icone.setIcon(Icone.comImagem(imagem));
		icone.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(icone);
		
		eventos();
		
	}
	
	
	/**
	 * eventos
	 */
	private void eventos() {
		
		/// iconeTabuleiro.addMouseListener(new ClickIcone());
		/// iconeNaoEncontrado.addMouseListener(new ClickIcone());
		
		icone.addMouseListener(new ClickIcone());
		
	}
	
	
	
	/**
	 * finalizado
	 * @return
	 */
	public boolean finalizado() {
		
		boolean finalizado = false;
		
		for (Component component : getComponents()) {
			JLabel label = (JLabel) component;
			if (label.isEnabled())
				break;
			else 
				finalizado = true;
		}
		
		return finalizado;
	}

}