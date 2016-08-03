package CollectionFamily;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		//HashMap can be replaced with HashTable
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("walt", 24);
		map.put("Heny", 30);
		for (String key : map.keySet())
		{
			System.out.println(key + ": " + map.get(key));
		}
		
		//TreeMap will sort map by Key.
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("walt", 24);
		treeMap.put("Heny", 30);
		for (String key : treeMap.keySet())
		{
			System.out.println(key + ": " + treeMap.get(key));
		}
	}

}
