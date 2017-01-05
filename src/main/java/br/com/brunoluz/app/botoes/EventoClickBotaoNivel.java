package br.com.brunoluz.app.botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventoClickBotaoNivel implements ActionListener {
	
	private JButton botaoClicadoAnterior;
	private JButton botaoClicadoAtual;
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		botaoClicadoAtual = (JButton) event.getSource();
		botaoClicadoAnterior = (botaoClicadoAnterior == null) ? botaoClicadoAtual : botaoClicadoAnterior;
		
		mostarClique();
	}
	
	
	/**
	 * mostarClique
	 */
	private void mostarClique() {
		
		if (botaoClicadoAnterior != null) System.out.println("Anterior : " + nomeIcone(botaoClicadoAnterior));
		if (botaoClicadoAtual != null) System.out.println("Atual : " + nomeIcone(botaoClicadoAtual));
		
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