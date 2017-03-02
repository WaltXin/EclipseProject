package Codility;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinaryGap {

	public static void main(String[] args) {
		System.out.println(new DecimalToBinaryGap().solution_a(0));
		System.out.println(new DecimalToBinaryGap().solution_b(1024));
	}
	
	/*
	 * Value - 2^n then 
	 * Value1 - 2^n1 
	 * until Value(N) = 0 
	 * Result: 100%
	 * */
	public int solution_a(int N)
	{		
		List<Integer> list = new ArrayList<Integer>();
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
			list.add(i);
			N = (int) (N - Math.pow(2, i));
			System.out.println(list);
		}
		int result = 0;
		for (int i = 0; i < list.size() - 1; i++)
		{
			int gap = list.get(i) - list.get(i + 1) - 1;
			if(gap > result)
			{
				result = gap;
			}
		}
		
		return result;
	}
	
	/*
	 * Divide 2 each time
	 * Until N = 0 
	 * Result 13%
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
            List<Integer> list = new ArrayList<Integer>();
            for(int i = st.length() - 1; i >= 0; i--)
            {
                    if (st.charAt(i) == '1')
                    {
                            resultValue += i;
                            list.add(i);
                    }
            }

            int gap1 = 0;
            for (int i = 1; i < resultValue.length() - 1; i++)
            {
                    int listValue = list.get(i - 1) - list.get(i) - 1;
                    if (listValue > gap1)
                    {
                            gap1 = listValue;
                    }
            }
            
            return gap1;
    }

}
