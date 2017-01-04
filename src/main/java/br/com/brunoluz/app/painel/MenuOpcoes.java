package br.com.brunoluz.app.painel;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import br.com.brunoluz.app.botoes.EventoClickBotaoNivel;

public class MenuOpcoes extends JPanel {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton botaoNivelFacil;
	private JButton botaoNivelMedio;
	private JButton botaoNivelDificil;
	
	
	/**
	 * Tabuleiro
	 */
	public MenuOpcoes() {
		configuracoes();
		iniciaComponentes();
		configuraComponentes();
		eventosComponentes();
		adicionaComponentes();
	}
	
	
	
	/**
	 * configuracoes
	 */
	private void configuracoes() {
		setBackground(Color.WHITE);
	}
	
	
	/**
	 * iniciaComponentes
	 */
	private void iniciaComponentes() {
	
		botaoNivelFacil = new JButton("Nível Facil");
		botaoNivelMedio = new JButton("Nível Médio");
		botaoNivelDificil = new JButton("Nível Dificil");
		
	}
	
	
	/**
	 * configuraComponentes
	 */
	private void configuraComponentes() {
		
	}
	
	
	/**
	 * adicionaComponentes
	 */
	private void adicionaComponentes() {
		
		add(botaoNivelFacil);
		add(botaoNivelMedio);
		add(botaoNivelDificil);
		
		add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("icones/background/background.png")), SwingConstants.LEFT));
		
	}
	
	
	/**
	 * eventosComponentes
	 */
	private void eventosComponentes() {
		
		botaoNivelFacil.addActionListener(new EventoClickBotaoNivel());
		botaoNivelMedio.addActionListener(new EventoClickBotaoNivel());
		botaoNivelDificil.addActionListener(new EventoClickBotaoNivel());
		
		botaoNivelFacil.setCursor(new Cursor(Cursor.HAND_CURSOR));
		botaoNivelMedio.setCursor(new Cursor(Cursor.HAND_CURSOR));
		botaoNivelDificil.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}
	

}