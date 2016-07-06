package Codility;

public class DecimalToBinaryGap {

	public static void main(String[] args) {
		System.out.println(new DecimalToBinaryGap().solution_a(1157));
		System.out.println(new DecimalToBinaryGap().solution_b(1157));
	}
	
	/*
	 * Value - 2^n then 
	 * Value1 - 2^n1 
	 * until Value(N) = 0 
	 * */
	public String solution_a(int N)
	{		
		String st = "";
		while(N > 0)
		{   
			int i = 0;
			while (N > Math.pow(2, i))
			{
				i++;
			}
			if (N < Math.pow(2, i))
			{
				i = i - 1;
			}
			st += i;
			N = (int) (N - Math.pow(2, i));
		}
		int result = 0;
		for (int i = 1; i < st.length(); i++)
		{
			int gap = (int)(st.charAt(i-1)-st.charAt(i)) - 1;
			if(gap > result)
			{
				result = gap;
			}
		}
		
		return st + " | " + result;
	}
	
	/*
	 * Divide 2 each time
	 * Until N = 0 
	 * */
	public int solution_b(int N)
	{
		String st = "";
		while (N > 0)
		{
			if (N % 2 == 0)
			{
				N = N / 2;
				st += "0";
			}
			else
			{
				N = N / 2;
				st += "1";
			}
		}
		String resultValue = "";
		for(int i = st.length() - 1; i >= 0; i--)
		{
			if (st.charAt(i) == '1')
			{
				resultValue += i;
			}
		}
		int gap = 0;
		for (int i = 1; i < resultValue.length(); i++)
		{
			int gapValue = (int)(resultValue.charAt(i - 1) - resultValue.charAt(i)) - 1; 
			if (gapValue > gap)
			{
				gap = gapValue;
			}
		}
		
		return gap;
	}

}
