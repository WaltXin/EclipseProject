package CollectionFamily;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		System.out.println("For Loop");
		for (int i = 0; i < l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("For earch");
		for (String i : l)
		{
			System.out.println(i);
		}
		
		System.out.println("Iterator");
		Iterator<String> it = l.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("While");
		int i = 0;
		while (i < l.size())
		{
			System.out.println(l.get(i));
			i++;
		}
		
		//add immutable String
		for(String string : l)
		{
			string += "1";
		}
		System.out.println(l);
		
		//add mutable StringBuilder
		ArrayList<StringBuilder> als = new ArrayList<StringBuilder>();
		StringBuilder sBuilder = new StringBuilder();
		als.add(new StringBuilder("a"));
		als.add(new StringBuilder("b"));
		for (StringBuilder sb : als)
		{
			sb.append("1");
		}
		System.out.println(als);
	}

}
