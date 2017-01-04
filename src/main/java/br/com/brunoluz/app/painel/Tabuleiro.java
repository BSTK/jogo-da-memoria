package br.com.brunoluz.app.painel;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import br.com.brunoluz.util.PainelComponente;

public class Tabuleiro extends JPanel implements PainelComponente {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	
	/**
	 * Tabuleiro
	 */
	public Tabuleiro() {
		
		setBackground(Color.WHITE);
		setLayout(new GridLayout(4, 4));
		
		iniciaComponentes();
		configuraComponentes();
		adicionaComponentes();
		eventosComponentes();
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
