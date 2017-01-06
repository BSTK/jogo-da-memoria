package br.com.brunoluz.app.botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventoClickBotaoNivel implements ActionListener {
	
	static int quantidadeClique = 0;
	private JButton botaoClicadoAnterior;
	private JButton botaoClicadoAtual;
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		quantidadeClique = (quantidadeClique < 2) ? quantidadeClique + 1 : 1;

		mostarClique();
	}
	
	
	/**
	 * mostarClique
	 */
	private void mostarClique() {
		
		System.out.println("Atual : " + quantidadeClique);
		
		/*System.out.println("Anterior : " + nomeIcone(botaoClicadoAnterior));
		System.out.println("Atual : " + nomeIcone(botaoClicadoAtual));*/
		
	}
	
	
	/**
	 * nomeIcone
	 * @param icone
	 * @return
	 */
	private String nomeIcone(JButton botao) {
		String[] split = botao.getIcon().toString().split("/");
		return split[split.length - 1];
	}

}