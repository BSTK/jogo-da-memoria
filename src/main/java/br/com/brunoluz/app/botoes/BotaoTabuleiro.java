package br.com.brunoluz.app.botoes;

import javax.swing.JButton;

import br.com.brunoluz.util.PainelComponente;

public class BotaoTabuleiro extends JButton implements PainelComponente {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private static int contador = 1;
	
	/**
	 * BotaoTabuleiro
	 */
	public BotaoTabuleiro() {
		super("BOTÃO " + contador);
		contador++;
		addActionListener(new EventoClickBotaoNivel());
	}

	
	@Override
	public void iniciaComponentes() {
		
	}

	@Override
	public void configuraComponentes() {
		
	}

	@Override
	public void adicionaComponentes() {
		
	}

	@Override
	public void eventosComponentes() {
		
	}
	
}
