package br.com.brunoluz.app.botoes;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.brunoluz.util.Icone;

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
	
	private static JPanel quadradoClique1;
	private static JPanel quadradoClique2;
	
	
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
			quadradoClique1 = quadradoTabuleiro;
		
		if (quantidadeCliques == 2) {
			quadradoClique2 = quadradoTabuleiro;
			
			if (quadradoClique1 != null && quadradoClique2 != null && !quadradoClique1.equals(quadradoClique2)) {
				
				if (Icone.iguais(label(quadradoClique1), label(quadradoClique2))) {
					JOptionPane.showMessageDialog(null, "Achou o par !!!");
				}
				else {
					iconeTabuleiro.setVisible(visivel);
					iconeNaoEncontrado.setVisible(!visivel);
				}
			}
			
			quantidadeCliques = 0;
		}
			
	}
	
	
	
	/**
	 * labelTabuleiro
	 * @param panel
	 * @return
	 */
	private JLabel label(JPanel panel) {
		return (JLabel) panel.getComponent(ICONE_TABULEIRO);
	}
	
}