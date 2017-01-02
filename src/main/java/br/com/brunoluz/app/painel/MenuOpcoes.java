package br.com.brunoluz.app.painel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	}
	
	
	/**
	 * eventosComponentes
	 */
	private void eventosComponentes() {
		
		buttonNivelFacil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getParent(), "Botão " + ((JButton) e.getSource()).getText());
			}
			
		});
		
		
		buttonNivelMedio.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getParent(), "Botão " + ((JButton) e.getSource()).getText());
			}
			
		});


		buttonNivelDificil.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(getParent(), "Botão " + ((JButton) e.getSource()).getText());
			}
			
		});
		
	}
	

}