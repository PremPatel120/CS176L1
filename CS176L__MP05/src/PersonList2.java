
import java.util.ArrayList;

public class PersonList2 {
	
	ArrayList<Person> personList = new ArrayList<Person> ();
	
	public void add(String inName, String inGender, double inHeight, double inWeight, int inAge)
	{
		
		personList.add(new Person (inName, inGender, inHeight, inWeight, inAge));
		
	}
	
	public void print ()
	{
		
		for (int i = 0; i < personList.size(); i++)
		{
			
			personList.get(i).print();
			
		}
		
	}
	
	public Person returnTallest ()
	{
		
		Person tallest = new Person ();
		
		for (int i  = 0; i < personList.size(); i++)
		{
			
			if (personList.get(i).getHeight() > tallest.getHeight())
			{
				
				tallest = personList.get(i);
				
			}
			
		}
		
		return tallest;
		
	}
	

}
