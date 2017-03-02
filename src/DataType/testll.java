package DataType;

public class testll {
	public static void main(String[] args)
	{
		String a = null;
		try{
			a.toString();
		}catch(Exception E)
		{
			System.out.println("Bye");
		}finally{
			System.out.println("Error");
		}
	}
}
