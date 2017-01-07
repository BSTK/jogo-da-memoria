package br.com.brunoluz.app.botoes;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class ClickIcone extends MouseAdapter {
	
	
	/**
	 * mouseClicked
	 * @param event
	 * @param visivel
	 */
	public void mouseClicked(MouseEvent event, Boolean visivel) {
	
		JPanel quadradoTabuleiro = (JPanel) event.getComponent().getParent();
		
		JLabel iconeTabuleiro = (JLabel) quadradoTabuleiro.getComponent(0);
		JLabel iconeNaoEncontrado = (JLabel) quadradoTabuleiro.getComponent(1);
		
		iconeTabuleiro.setVisible(!visivel);
		iconeNaoEncontrado.setVisible(visivel);
		
	}
	
}