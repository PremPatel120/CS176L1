
public class Instructor extends Person {
	
	private double salary;
	
	public Instructor (String inName, int inBirthYear, double inSalary)
	{
		
		super (inName, inBirthYear);
		
		salary = inSalary;
		
	}
	
	public void setSalary (double inSalary)
	{
		
		salary = inSalary;
		
	}
	
	public double getSalary ()
	{
		
		return salary;
		
	}
	
	public String toString ()
	{
		
		return
				super.toString() + "\n" + 
				
				"Salary: " + salary + "\n";
		
	}
	

}
