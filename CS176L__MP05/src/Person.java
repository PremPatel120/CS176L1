

public class Person {
	
	private String name;
	private String gender;
	private double height;
	private double weight;
	private int age;
	
	public Person ()
	{
		
		name = "None";
		
		gender = "None";
		
		height = 0.0;
		
		weight = 0.0;
		
		age = 0;
		
	}
	
	public Person (String inName, String inGender, double inHeight, double inWeight, int inAge)
	{
		
		name = inName;
		
		gender = inGender;
		
		height = inHeight;
		
		weight = inWeight;
		
		age = inAge;
		
	}

	public String getName () 
	{
		
		return name;
		
	}

	public void setName (String inName) 
	{
		
		name = inName;
		
	}

	public String getGender () 
	{
		
		return gender;
		
	}

	public void setGender (String inGender) 
	{
		
		gender = inGender;
		
	}

	public double getHeight () 
	{
		
		return height;
		
	}

	public void setHeight (double inHeight) 
	{
		
		height = inHeight;
		
	}

	public double getWeight () 
	{
		
		return weight;
		
	}

	public void setWeight (double inWeight) 
	{
		
		weight = inWeight;
		
	}

	public int getAge ()
	{
		
		return age;
		
	}

	public void setAge (int inAge)
	{
		
		age = inAge;
		
	}
	
	public void print ()
	{
		
		System.out.println("Name: " + getName() + "\tGender: " + gender + "\tHeight: " + getHeight()
							+ "\tWeight: " + getWeight() + "\tAge: " + getAge());
		
	}
	
	/**public String toString ()
	{
		
		return 
				
				"Name: " + name +"\n" + 
				
				"Gender: " + gender +"\n" +
				
				"Height: " height +"\n" +
				
				"Weight: " weight +"\n" +
				
				"Age: " + age +"\n";
		
	}*/
	
	
	

}
