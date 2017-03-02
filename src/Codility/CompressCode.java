package Codility;

public class CompressCode {

	public static void main(String[] args) {
		String string = new CompressCode().d("aaaac");
		System.out.println(string);
	}
	
	public String d(String str)
	{
		int length = str.length();
		StringBuilder sb = new StringBuilder();	
		for(int i = 1; i <= length; i++)
		{
			int mem = 0;
			char startChar = str.charAt(i - 1);
			sb.append(startChar);
			if(i + 1 == length) break;
			while(startChar == str.charAt(i))
			{
				if(i + 1 == length) break;
				mem++;
				i++;
			}
			sb.append(mem + 1);
		}
		
		if (sb.length() > length)
		{
			return str;
		}else
		{		
			return sb.toString();
		}
	}

}
