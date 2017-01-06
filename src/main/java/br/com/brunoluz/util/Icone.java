package br.com.brunoluz.util;

import static br.com.brunoluz.util.Constantes.PATH_ICONES;
import static br.com.brunoluz.util.Constantes.ICONE_ESCONDIDO;

import javax.swing.ImageIcon;


public class Icone {
	
	
	/**
	 * naoEncontrado
	 * @return
	 */
	public static ImageIcon naoEncontrado() {
		return new ImageIcon(Icone.class.getResource(String.format("%s%s", PATH_ICONES, ICONE_ESCONDIDO)));
	}
	
	
	/**
	 * comImagem
	 * @return
	 */
	public static ImageIcon comImagem(String icone) {
		return new ImageIcon(Icone.class.getResource(String.format("%s%s", PATH_ICONES, icone)));
	}
	
}