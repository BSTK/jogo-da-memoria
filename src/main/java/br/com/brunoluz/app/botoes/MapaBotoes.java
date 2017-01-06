package br.com.brunoluz.app.botoes;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class MapaBotoes {
	
	private static Map<Integer, String> mapa = new HashMap<Integer, String>();
	
	static {
		
		try {
			
			Files.list(Paths.get(MapaBotoes.class.getResource("/icones/botoes/").toURI())).forEach(new Consumer<Path>() {
				
				int contador = 0;
				
				@Override
				public void accept(Path t) {
					
					String icone = String.valueOf(t.getFileName()); 
					if (!"icone-escondido.png".equals(icone)) {
						mapa.put(contador , icone);
					}
					
					contador++;
				}
			});
			
		} catch (IOException | URISyntaxException e) {
			System.err.println("ERROR [{}] - Main.condiguraLookAndFeel() {} :\n" + e.getMessage());
		}
		
	}
	
	
	/**
	 * get
	 * @param key
	 * @return
	 */
	public static String get(int key) {
		return mapa.get(key);
	}
	
	
	/**
	 * getMapa
	 * @return
	 */
	public static Map<Integer, String> getMapa() {
		return mapa;
	}
	

}
