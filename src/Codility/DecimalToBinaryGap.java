package Codility;

public class DecimalToBinaryGap {

	public static void main(String[] args) {
		System.out.println(new DecimalToBinaryGap().solution_a(1041));
		System.out.println(new DecimalToBinaryGap().solution_b(1041));
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
		int[] resultValue = {0,0,0};
		int m = 0;
		for(int i = st.length() - 1; i >= 0; i--)
		{		
			if (st.charAt(i) == '1')
			{
				resultValue[m] = i;
				m++;
			}
		}
		int gap = 0;
		for (int i = 1; i < resultValue.length; i++)
		{
			int gapValue = resultValue[i - 1] - resultValue[i] - 1; 
			if (gapValue > gap)
			{
				gap = gapValue;
			}
		}
		
		return gap;
	}

}
