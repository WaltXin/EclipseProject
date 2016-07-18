package DataType;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateFunction {
	public static void main(String[] args)
	{
		//Remove duplicate in ArrayList 
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("a");
		al.add("b");
		System.out.println(new RemoveDuplicateFunction().CheckDuplicateExitByTwoForLoop(al));
		System.out.println(new RemoveDuplicateFunction().CheckDuplicateExit(al));
		al = new RemoveDuplicateFunction().ArrayListRemoveDuplicate(al);
		System.out.println(new RemoveDuplicateFunction().CheckDuplicateExitByTwoForLoop(al));
		System.out.println(new RemoveDuplicateFunction().CheckDuplicateExit(al));
		System.out.println(al.toString());
		al.add("a");
		al = new RemoveDuplicateFunction().ArrayListRemoveDuplicateIte(al);
		
		System.out.println(al.toString());
	}
	
	public ArrayList<String> ArrayListRemoveDuplicate(ArrayList<String> al)
	{
		HashSet<String> hashSet = new HashSet<String>(al);
		ArrayList<String> arrayList = new ArrayList<String>(hashSet);
		return arrayList;
	}
	
	public ArrayList<String> ArrayListRemoveDuplicateIte(ArrayList<String> al)
	{
		HashSet<String> hashSet = new HashSet<String>();
		ArrayList<String> arrayList = new ArrayList<String>();
		
		for (String string : al)
		{
			if (!hashSet.contains(string))
			{
				hashSet.add(string);
				arrayList.add(string);
			}
		}	
		return arrayList;
	}
	
	public boolean CheckDuplicateExitByTwoForLoop(ArrayList<String> al)
	{
		for (int i = 0; i < al.size(); i++)
		{
			for (int j = i + 1; j <al.size(); j++)
			{
				if (al.get(i) == al.get(j))
				{
					return true;
				}
			}
		}
		return false;
	}
	
	//You can also use Set size to check if Duplicate exist
	public boolean CheckDuplicateExit(ArrayList<String> al)
	{
		int arrayLength = al.size();
		HashSet<String> hashSet = new HashSet<String>(al);
		int hashLength = hashSet.size();
		
		if (arrayLength != hashLength)
		{
			return true;
		}
		
		return false;
	}
	
	
}
