package br.com.brunoluz.app.botoes;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class ClickIcone extends MouseAdapter {
	
	
	/**
	 * ICONE_TABULEIRO
	 */
	private final int ICONE_TABULEIRO = 0;
	
	
	/**
	 * ICONE_NAO_ENCONTRADO
	 */
	private final int ICONE_NAO_ENCONTRADO = 1;
	
	public static int quantidadeCliques = 0;
	
	
	/**
	 * mouseClicked
	 * @param event
	 * @param visivel
	 */
	public void mouseClicked(MouseEvent event, Boolean visivel) {
	
		quantidadeCliques++;
		
		JPanel quadradoTabuleiro = (JPanel) event.getComponent().getParent();
		
		JLabel iconeTabuleiro = (JLabel) quadradoTabuleiro.getComponent(ICONE_TABULEIRO);
		JLabel iconeNaoEncontrado = (JLabel) quadradoTabuleiro.getComponent(ICONE_NAO_ENCONTRADO);
		
		iconeTabuleiro.setVisible(!visivel);
		iconeNaoEncontrado.setVisible(visivel);
			
		if (quantidadeCliques == 1)
			quantidadeCliques = 0;
		
	}
	
}