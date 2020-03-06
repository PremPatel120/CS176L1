

public class PersonList1 extends Person {
	
	private Person personList[] = new Person[100];
	private static int count = 0;
	
	public void add (String inName, String inGender, double inHeight, double inWeight, int inAge)
	{
		
		personList[count] = new Person (inName, inGender, inHeight, inWeight, inAge);
		
		count++;
		
	}
	
	public void print ()
	{
		
		for (int i = 0; i < count; i++)
		{
			
			personList[i].print();
			
		}
		
	}
	
	public Person returnTallest ()
	{
		
		Person tallest = new Person();
		
		for (int i = 0; i < count; i++)
		{
			
			if (personList[i].getHeight() > tallest.getHeight())
			{
				
				tallest = personList[i];
				
			}
			
		}
		
		return tallest;
		
	}
	

}
