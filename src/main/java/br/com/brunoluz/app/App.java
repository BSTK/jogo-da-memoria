package br.com.brunoluz.app;

import java.awt.Color;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import br.com.brunoluz.app.botoes.BotaoTabuleiro;
import br.com.brunoluz.app.painel.Tabuleiro;
import br.com.brunoluz.util.GrupoLayout;
import br.com.brunoluz.util.PainelComponente;

public class App extends JFrame implements PainelComponente {

	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	
	private GroupLayout groupLayout;
	private Tabuleiro tabuleiro;
	
	private final int FACIL = 16;
	private final int MEDIO = 24;
	private final int DIFICIL = 32;
	
	
	/** 
	 * App
	 */
	public App() {
		super("Jogo da memória");
		configuracoes();
	}
	
	
	/**
	 * configuracoes
	 */
	private void configuracoes() {
		
		setBounds(new Rectangle(600, 600));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciaComponentes();
		configuraComponentes();
		adicionaComponentes();
		eventosComponentes();
		
		pack();
		
	}


	@Override
	public void iniciaComponentes() {
		
		groupLayout = new GroupLayout(getContentPane());
		tabuleiro = new Tabuleiro();
	}


	@Override
	public void configuraComponentes() {
		
		groupLayout.setVerticalGroup(GrupoLayout.criarParallelGroup(groupLayout, tabuleiro));
		groupLayout.setHorizontalGroup(GrupoLayout.criarParallelGroup(groupLayout, tabuleiro));
		
	}


	@Override
	public void adicionaComponentes() {
		
		add(tabuleiro);
		setLayout(groupLayout);

		for (int i = 0; i < DIFICIL; i++) {
			tabuleiro.add(new BotaoTabuleiro());
		}
	}


	@Override
	public void eventosComponentes() {}
	
}