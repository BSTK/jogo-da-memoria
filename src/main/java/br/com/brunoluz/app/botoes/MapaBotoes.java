package br.com.brunoluz.app.botoes;

import java.util.HashMap;
import java.util.Map;

public class MapaBotoes {
	
	private static Map<Integer, String> mapa = new HashMap<Integer, String>();
	
	static {
		
		mapa.put(1 , "icone-0001");
		mapa.put(2 , "icone-0002");
		mapa.put(3 , "icone-0003");
		mapa.put(4 , "icone-0004");
		mapa.put(5 , "icone-0005");
		mapa.put(6 , "icone-0006");
		mapa.put(7 , "icone-0007");
		mapa.put(8 , "icone-0008");
		mapa.put(9 , "icone-0009");
		mapa.put(10, "icone-0010");
		mapa.put(11, "icone-0011");
		mapa.put(12, "icone-0012");
		mapa.put(13, "icone-0013");
		mapa.put(14, "icone-0014");
		mapa.put(15, "icone-0015");
		mapa.put(16, "icone-0016");
		mapa.put(17, "icone-0017");
		mapa.put(18, "icone-0018");
		mapa.put(19, "icone-0019");
		mapa.put(20, "icone-0020");
		mapa.put(21, "icone-0021");
		mapa.put(22, "icone-0022");
		mapa.put(23, "icone-0023");
		mapa.put(24, "icone-0024");
		mapa.put(25, "icone-0025");
		mapa.put(26, "icone-0026");
		mapa.put(27, "icone-0027");
		mapa.put(28, "icone-0028");
		mapa.put(29, "icone-0029");
		mapa.put(30, "icone-0030");
		mapa.put(31, "icone-0031");
		mapa.put(32, "icone-0032");
		mapa.put(33, "icone-0033");
		mapa.put(34, "icone-0034");
		mapa.put(35, "icone-0035");
		mapa.put(36, "icone-0036");
		mapa.put(37, "icone-0037");
		mapa.put(38, "icone-0038");
		mapa.put(39, "icone-0039");
		mapa.put(40, "icone-0040");
		mapa.put(41, "icone-0041");
		mapa.put(42, "icone-0042");
		mapa.put(43, "icone-0043");
		mapa.put(44, "icone-0044");
		mapa.put(45, "icone-0045");
		mapa.put(46, "icone-0046");
		mapa.put(47, "icone-0047");
		mapa.put(48, "icone-0048");
		mapa.put(49, "icone-0049");
		mapa.put(50, "icone-0050");
		mapa.put(0, "icone-escondido");
		
	}
	
	
	/**
	 * get
	 * @param key
	 * @return
	 */
	public static String get(int key) {
		return mapa.get(key);
	}

}
