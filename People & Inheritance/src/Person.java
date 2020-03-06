
public class Person {
	
	private String name;
	private int birthyear;
	
	public Person (String inName, int inBirthYear)
	{
		
		name = inName;
		
		birthyear = inBirthYear;
		
	}
	
	public void setName (String inName)
	{
		
		name = inName;
		
	}
	
	public void setBirthYear (int inBirthYear)
	{
		
		birthyear = inBirthYear;
		
	}
	
	public String getName ()
	{
		
		return name;
		
	}
	
	public int getBirthYear ()
	{
		
		return birthyear;
		
	}
	
	public String toString ()
	{
		
		return
				
				"Person: " + name + "\n" + 
				
				"Birth Year: " + birthyear;
		
	}
	

}
