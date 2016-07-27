package DataType;

import java.util.*;

class Dog implements Comparator<Dog> {

	private String dogName;
	private int age;
	
	Dog ()
	{
		
	}
	
	Dog (String dogName, int age)
	{
		this.dogName = dogName;
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.dogName = name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public String getName()
	{
		return dogName;
	}
	
	public String getAge()
	{
		return age+"";
	}

	@Override
	public int compare(Dog d, Dog d1) {
		return d.age - d1.age;
	}

}

public class DogComparatorTest
{
	public static void main(String[] args)
	{
		Dog dog = new Dog();
		dog.setName("Tom");
		dog.setAge(3);
		
		Dog dog1 = new Dog("Jerry", 2);
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(dog);
		dogList.add(dog1);
		System.out.println("No Sort");
		for (Dog d : dogList)
		{
			System.out.println(d.getName() + " " + d.getAge());
		}
		
		System.out.println("Sorting ArrayList using overwrited comparator function(By Age)");
		Collections.sort(dogList, new Dog());
		for (Dog d : dogList)
		{
			System.out.println(d.getName() + " " + d.getAge());
		}
		
		
	}
}
