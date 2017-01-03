package br.com.brunoluz.app.botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class EventoClickBotaoNivel implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "Botão " + ((JButton) event.getSource()).getText());
	}

}
