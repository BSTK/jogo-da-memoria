package br.com.brunoluz.app.botoes;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClickIcone extends MouseAdapter {
	
	
	private static int quantidadeCliques = 0;
	private static final int ICONE_CLICADO = 0;
	
	private static JLabel iconePrimeiroClique;
	private static JLabel iconeSegundoClique;
	
	
	
	@Override
	public void mouseClicked(MouseEvent event) {
		
		quantidadeCliques++;
		
		JPanel quadradoTabuleiro = (JPanel) event.getComponent().getParent();
		JLabel iconeClicado = (JLabel) quadradoTabuleiro.getComponent(ICONE_CLICADO);
		
		if (quantidadeCliques == 1) {
			iconePrimeiroClique = iconeClicado;
			iconePrimeiroClique.setEnabled(false);
		}
			
		if (quantidadeCliques == 2) {
			iconeSegundoClique = iconeClicado;
			iconeSegundoClique.setEnabled(false);
			
			
			System.out.println("Cliques if :  " + quantidadeCliques);
			
			quantidadeCliques = 0;
		}
		
		System.out.println("Cliques :  " + quantidadeCliques);
		
	}
	
}