package br.com.brunoluz.app.botoes;

import java.awt.event.MouseEvent;

public class ClickIconeTabuleiro extends ClickIcone {

	@Override
	public void mouseClicked(MouseEvent e) {
		mouseClicked(e, Boolean.TRUE);
		System.out.println("Qttd " + quantidadeCliques);
	}
	
}
