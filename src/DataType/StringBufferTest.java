package DataType;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuilder sBuilder = new StringBuilder("xyz");
		for (int i = 0; i < 2; i++)
		{
			sBuilder.append("a").append(" ").append(" ");
		}
		
		//Insert offset is the place it actually insert
		sBuilder.insert(1, "2");
		System.out.println(sBuilder.toString());
		
		//Delete offset is the place it actually start deleting, and 3-2=1 delete one
		sBuilder.delete(2, 3);
		System.out.println(sBuilder.toString());
		
		//Replace
		sBuilder.replace(1, 2, "1");
		System.out.println(sBuilder.toString());
		
		//Combines StringBuilder
		StringBuilder s2 = new StringBuilder("s2");
		sBuilder.append(s2);
		System.out.println(sBuilder.toString());
		
		//SubString
		System.out.println(sBuilder.substring(1, 3));
		
		//Reverse
		System.out.println(new StringBuilder().append("abc").reverse());
		
		//Performance
		new StringBufferTest().Performance();
		
		//CapacityPerformance
		new StringBufferTest().CapacityPerformance();
		
		//StringOrCharPerformance
		new StringBufferTest().StringCharPerformance();
		
	}
	//Test String and StringBuilder's performance, StringBuilder is much more fast then String, 
	//Because String is immutable and final, each change will create a new object and generate garbage,
	//While StringBuilder and StringBuffer is mutable.
	public void Performance()
	{
		long t1 = System.currentTimeMillis();
		String string = "";
		for (int i = 0; i < 10000; i++)
		{
			string += i;
		}
		
		long t2 = System.currentTimeMillis();
		StringBuilder sBuilder = new StringBuilder();
		for (int i = 0; i < 10000; i++)
		{
			sBuilder.append(i);
		}
		long t3 = System.currentTimeMillis();
		
		System.out.println("String need time: "+ (t2 - t1));
		System.out.println("StringBuilder need time: " + (t3 - t2));
		
	}
	
	//If give a capacity to a builder is very close with without define the capacity, this should be really careful about overflow.
	public void CapacityPerformance()
	{
		long t1 = System.currentTimeMillis();
		StringBuilder sBuilder1 = new StringBuilder(1000000);
		for (int i = 0; i < 1000000; i++)
		{
			sBuilder1.append(i);
		}
		long t2 = System.currentTimeMillis();
		StringBuilder sBuilder2 = new StringBuilder();
		for (int i = 0; i < 1000000; i++)
		{
			sBuilder2.append(i);
		}
		long t3 = System.currentTimeMillis();
		System.out.println("Capacity time: "+ (t2 - t1));
		System.out.println("Without capacity time: "+ (t3 - t2));
	}
	
	//Obviously char is quicker
	public void StringCharPerformance()
	{
		long t1 = System.currentTimeMillis();
		StringBuilder sBuilder1 = new StringBuilder();
		for (int i = 0; i < 1000000; i++)
		{
			sBuilder1.append("X");
		}
		long t2 = System.currentTimeMillis();
		StringBuilder sBuilder2 = new StringBuilder();
		for (int i = 0; i < 1000000; i++)
		{
			sBuilder2.append('X');
		}
		long t3 = System.currentTimeMillis();
		System.out.println("StringBuild append String time: "+ (t2 - t1));
		System.out.println("StringBuild append Char time: "+ (t3 - t2));
	}

}
