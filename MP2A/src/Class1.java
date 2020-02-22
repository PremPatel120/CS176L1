import java.util.Scanner;

public class Class1 {
	
	Scanner input =new Scanner(System.in);
	
	private String[] arrayUser;
	private int arrayLength = 0;
	
	public Class1 (int length)
	{
		
		arrayLength = length;
		
	}
	
	public void load ()
	{
		
		String[] string = new String[arrayLength];
		
		System.out.println("Enter Names (Q to quit): ");
		
		arrayLength = 0;
		
		for (int i = 0; i < string.length; i++)
		{
			
			if (input.hasNext())
			{
				
				string[i] = input.next();
				
				arrayLength++;
				
			}
			
		}
		
		arrayUser = new String[arrayLength];
		
		for (int i = 0; i < arrayLength; i++)
		{
			
			arrayUser[i] = string[i];
			
		}
		
	}
	
	public boolean search1 (String inWord)
	{
		
		//Scanner in = new Scanner(System.in);
		
		//System.out.println("Input search value: ");
		
		//int searchValue = in.nextInt();
		
		boolean found = false;
		
		int index = 0;
		
		while(index < arrayUser.length&&!found)
		{
			
			if(arrayUser[index].equals(inWord))
			{
				
				found = true;
				
			}
			
			index++;
			
		}
		
		if(found) System.out.println(inWord + " is found in the array");
		
		else System.out.println(inWord + " is not found in the Array");
		
		return found;
		
	}
	
	public String findMax ()
	{
		
		int maxPosition = 0;
		
		for (int i = 1; i < arrayLength; i++)
		{
			
			if (arrayUser[maxPosition].compareTo(arrayUser[i]) < 0)
			{
				
				maxPosition = i;
				
			}
			
		}
		
		System.out.println("Highest Position in Lexicographic Ordering: " + arrayUser[maxPosition]);
		
		return arrayUser[maxPosition];
		
	}
	
	public String findMin ()
	{
		
		int minPosition = 0;
		
		for (int i = 1; i < arrayLength; i++)
		{
			
			if (arrayUser[minPosition].compareTo(arrayUser[i]) > 0)
			{
				
				minPosition = i;
				
			}
			
		}
		
		System.out.println("Lowest Position in Lexicographic Ordering: " + arrayUser[minPosition]);
		
		return arrayUser[minPosition];
		
	}
	
	public String findLongest ()
	{
		
		 int maxLength = 0;
		 
	      String longestString = null;
	      
	      for (String s : arrayUser) 
	      {
	    	  
	          if (s.length() > maxLength) 
	          {
	        	  
	              maxLength = s.length();
	              
	              longestString = s;
	              
	          }
	          
	      }
	      
	      System.out.println("Longest String: " + maxLength);
	      
	      return longestString;
		
	}
	
	public String findShortest ()
	{
		
		int minLength = Integer.MAX_VALUE;
		
		String shortestString = null;
		
		for (int i = 0; i < arrayLength; i++)
		{
			
			if (arrayUser[i].length() == minLength)
			{
				
				shortestString += ", " + arrayUser[i];
				
			}
			
			else if (arrayUser[i].length() <= minLength)
			{
				
				shortestString = arrayUser[i];
				
				minLength = arrayUser[i].length();
				
			}
			
		}
		
		System.out.println("Shortest String: " + minLength);
		
		return shortestString;
		
	}
		
	

}
