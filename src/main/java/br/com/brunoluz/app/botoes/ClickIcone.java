package br.com.brunoluz.app.botoes;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import br.com.brunoluz.util.Icone;

public class ClickIcone extends MouseAdapter {
	
	
	private static int quantidadeCliques = 0;
	private static final int ICONE_CLICADO = 0;
	
	private static JLabel iconePrimeiroClique;
	private static JLabel iconeSegundoClique;
	
	
	@Override
	public void mouseClicked(MouseEvent event) {
		
		quantidadeCliques++;
		
		QuadradoTabuleiro quadradoTabuleiro = (QuadradoTabuleiro) event.getComponent().getParent();
		JLabel iconeClicado = (JLabel) quadradoTabuleiro.getComponent(ICONE_CLICADO);
		
		if (iconeClicado.isEnabled()) {
			
			if (quantidadeCliques == 1) {
				iconePrimeiroClique = iconeClicado;
				System.out.println("Clique 1");
			}
				
			if (quantidadeCliques == 2) {
				iconeSegundoClique = iconeClicado;
				System.out.println("Clique 2");
				
				if (Icone.mesmaImagem(iconePrimeiroClique, iconeSegundoClique) && 
				   !Icone.mesmoObjeto(iconePrimeiroClique, iconeSegundoClique)) {
					
					iconePrimeiroClique.setEnabled(false);
					iconeSegundoClique.setEnabled(false);

				}
				
				quantidadeCliques = 0;
				
				if (quadradoTabuleiro.finalizado())
					JOptionPane.showMessageDialog(null, "Jogo Finalizado !!");
			}
			
		}
		
	}
	
}