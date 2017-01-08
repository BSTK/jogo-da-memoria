package br.com.brunoluz.util;

import static br.com.brunoluz.util.Constantes.ICONE_ESCONDIDO;
import static br.com.brunoluz.util.Constantes.PATH_ICONES;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


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
	
	
	
	/**
	 * iguais
	 * @param botao1
	 * @param botao2
	 * @return
	 */
	public static boolean iguais(JLabel botao1, JLabel botao2) {
		return nomeIcone(botao1).equals(nomeIcone(botao2));
	}
	
	
	
	/**
	 * nomeIcone
	 * @param botao
	 * @return
	 */
	public static String nomeIcone(JLabel botao) {
		
		if (botao == null)
			return null;
		
		String[] split = botao.getIcon().toString().split("/");
		return split[split.length - 1];
	}
	
}