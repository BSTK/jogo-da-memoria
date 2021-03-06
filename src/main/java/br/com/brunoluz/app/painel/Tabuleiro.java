package br.com.brunoluz.app.painel;

import static br.com.brunoluz.util.Constantes.ICONE_ESCONDIDO;
import static br.com.brunoluz.util.Constantes.PATH_ICONES;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.brunoluz.app.botoes.MapaBotoes;
import br.com.brunoluz.app.botoes.QuadradoTabuleiro;
import br.com.brunoluz.util.PainelComponente;

public class Tabuleiro extends JPanel implements PainelComponente {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private final int nivel;
	
	private static final Random RANDOM = new Random();
	
	
	/**
	 * Tabuleiro
	 */
	public Tabuleiro(int nivel) {
		
		this.nivel = nivel;
		setBackground(Color.WHITE);
		setLayout(new GridLayout(4, 4));
		
		iniciaComponentes();
		configuraComponentes();
		adicionaComponentes();
		eventosComponentes();
		
		gerarNovaSequencia();
		esconderTabuleiro();
		
	}


	
	/**
	 * iniciaComponentes
	 */
	@Override
	public void iniciaComponentes() {
		
	}

	
	/**
	 * configuraComponentes
	 */
	@Override
	public void configuraComponentes() {
		
	}


	/**
	 * adicionaComponentes
	 */
	@Override
	public void adicionaComponentes() {
		for (String icone : gerarNovaSequencia()) {
			add(new QuadradoTabuleiro(icone));
		}
	}


	
	/**
	 * eventosComponentes
	 */
	@Override
	public void eventosComponentes() {
		
	}
	
	
	/**
	 * gerarNovaSequencia
	 */
	private List<String> gerarNovaSequencia() {
		
		Set<String> set = new HashSet<>();
		List<String> sequenciasPares = new ArrayList<>();
        
		int quantidadePares = nivel / 2;
		
		String[] imagens = MapaBotoes.getMapa().values().toArray(new String[0]);
		
		while (set.size() <= (quantidadePares - 1)) {            
            set.add(imagens[(RANDOM.nextInt(imagens.length))]);
        }
		
		sequenciasPares.addAll(set);
        sequenciasPares.addAll(set);
        
        embaralhar(sequenciasPares);
        
        return sequenciasPares;
        
	}
	
	
	/**
	 * embaralhar
	 * @param sequenciasPares
	 */
	private void embaralhar(List<String> sequenciasPares) {
		Collections.shuffle(sequenciasPares);
        Collections.reverse(sequenciasPares);
	}
	
	
	/**
	 * esconderTabuleiro
	 */
	private void esconderTabuleiro() {
		
		for (Component component : getComponents()) {
			if (component instanceof JButton) {
				JButton botao = (JButton) component;
				botao.setIcon(new ImageIcon(getClass().getResource(String.format("%s%s", PATH_ICONES, ICONE_ESCONDIDO))));
			}
		}
	}
	
}