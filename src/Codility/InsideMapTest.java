package Codility;

import java.util.HashMap;

public class InsideMapTest {

	public static void main(String[] args) {
		HashMap<String,String> acctyp = new HashMap<String,String>();
		HashMap<String, HashMap<String,String>> gens = new HashMap<String,HashMap<String,String>>();
		acctyp.put("'Open1'","ACCTYP 01");
		acctyp.put("'Open2'","ACCTYP 02");
		acctyp.put("'Open3'","ACCTYP 03");
		gens.put("'GEN01'", acctyp);
	}

}
