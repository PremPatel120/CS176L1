
public class Student extends Person {
	
	private String major;
	
	public Student (String inName, int inBirthYear, String inMajor)
	{
		
		super (inName, inBirthYear);
		
//		this.setName(inName);
//		
//		this.setBirthYear(inBirthYear);
		
		major = inMajor;
		
	}
	
	public void setMajor (String inMajor)
	{
		
		major = inMajor;
		
	}
	
	public String getMajor ()
	{
		
		return major;
		
	}
	
	public String toString ()
	{
		
		return
				super.toString() + "\n" +
				
				"Major: " + major + "\n";
		
	}
	

}
