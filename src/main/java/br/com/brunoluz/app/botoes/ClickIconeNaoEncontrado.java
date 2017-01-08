package br.com.brunoluz.app.botoes;

import java.awt.event.MouseEvent;

public class ClickIconeNaoEncontrado extends ClickIcone {

	@Override
	public void mouseClicked(MouseEvent e) {
		mouseClicked(e, Boolean.FALSE);
		System.out.println("Qttd " + quantidadeCliques);
	}
	
}
