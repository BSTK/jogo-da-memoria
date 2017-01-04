package br.com.brunoluz.app.botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventoClickBotaoNivel implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println("Clicou no botão : " + ((JButton) event.getSource()).getText());
	}

}