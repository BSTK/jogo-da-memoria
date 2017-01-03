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
	
	private JButton buttonNivelFacil;
	private JButton buttonNivelMedio;
	private JButton buttonNivelDificil;
	
	
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
	
		buttonNivelFacil = new JButton("Nível Facil");
		buttonNivelMedio = new JButton("Nível Médio");
		buttonNivelDificil = new JButton("Nível Dificil");
		
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
		
		add(buttonNivelFacil);
		add(buttonNivelMedio);
		add(buttonNivelDificil);
		
		add(new JLabel(new ImageIcon(getClass().getClassLoader().getResource("icones/background/background.png")), SwingConstants.LEFT));
		
	}
	
	
	/**
	 * eventosComponentes
	 */
	private void eventosComponentes() {
		
		buttonNivelFacil.addActionListener(new EventoClickBotaoNivel());
		buttonNivelMedio.addActionListener(new EventoClickBotaoNivel());
		buttonNivelDificil.addActionListener(new EventoClickBotaoNivel());
		
		buttonNivelFacil.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonNivelMedio.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonNivelDificil.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}
	

}