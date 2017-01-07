package br.com.brunoluz.app.botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

@SuppressWarnings("unused")
public class ClickBotaoNivel implements ActionListener {
	
	static int quantidadeClique = 0;
	static JButton botaoClicadoAtual;
	static JButton botaoClicadoAnterior;
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		quantidadeClique = (quantidadeClique < 2) ? quantidadeClique + 1 : 1;

		if (quantidadeClique == 1)
			botaoClicadoAtual = ((JButton) event.getSource());
			
		if (quantidadeClique == 2) {   
			botaoClicadoAnterior = botaoClicadoAtual;
			botaoClicadoAtual = ((JButton) event.getSource());
		}
		
	}
	
	
	/**
	 * nomeIcone
	 * @param icone
	 * @return
	 */
	private String nomeIcone(JButton botao) {
		
		if (botao == null)
			return null;
		
		String[] split = botao.getIcon().toString().split("/");
		return split[split.length - 1];
	}

}