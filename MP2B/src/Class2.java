import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class Class2 {
	
	Scanner input = new Scanner(System.in);
	
	private int[] arrayUser;
	private int arrayLength = 0;
	
	public Class2 (int length)
	{
		
		arrayLength = length;
		
	}
	
	public void load ()
	{
		
		int[] integer = new int[arrayLength];
		
		System.out.println("Enter Number Values (Q to quit) : ");
		
		arrayLength = 0;
		
		for (int i = 0; i < integer.length; i++)
		{
			
			if (input.hasNextInt())
			{
				
				integer[i] = input.nextInt();
				
				System.out.println("Enter Number Values (Q to quit): ");
				
				arrayLength++;
				
			}
			
		}
		
		arrayUser = new int[arrayLength];
		
		for (int i = 0; i < arrayLength; i++)
		{
			
			arrayUser[i] = integer[i];
			
		}
		
	}
	
	public boolean search (int inNum)
	{
		
		//Scanner in = new Scanner(System.in);
		
		//System.out.println("Input search value: ");
		
		//int searchValue = in.nextInt();
		
		boolean found = false;
		
		int index = 0;
		
		while(index < arrayUser.length&&!found)
		{
			
			if(inNum == arrayUser[index])
			{
				
				found = true;
				
			}
			
			index++;
			
		}
		
		if(found) System.out.println(inNum + " found at location " + index);
		
		else System.out.println(inNum + " is not found in the Array");
		
		return found;
		
	}
	
	public int findMax ()
	{
		
		int largest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arrayLength; i++)
		{
			
			if (arrayUser[i] > largest)
			{
				
				largest = arrayUser[i];
				
			}
			
		}
		
		System.out.println("Largest Value: " + largest);
		
		return largest;
		
	}
	
	public int findMin ()
	{
		
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < arrayLength; i++)
		{
			
			if (arrayUser[i] < smallest)
			{
				
				smallest = arrayUser[i];
				
			}
			
		}
		
		System.out.println("Smallest Value: " + smallest);
		
		return smallest;
		
	}
	
	public int findMaxPos ()
	{
		
		int maximum = Integer.MIN_VALUE;
		
		int maxPosition = 0;
		
		for (int i = 0; i < arrayLength; i++)
		{
			
			if (arrayUser[i] > maximum)
			{
				
				maximum = arrayUser[i];
				
				maxPosition = i;
				
			}
			
		}
		
		System.out.println("Maximum Position: " + maxPosition);
		
		return maxPosition;
		
	}
	
	public int findMinPos ()
	{
		
		int minimum = Integer.MAX_VALUE;
		
		int minPosition = 0;
		
		for (int i = 0; i < arrayLength; i++)
		{
			
			if (arrayUser[i] > minimum)
			{
				
				minimum = arrayUser[i];
				
				minPosition = i;
				
			}
			
		}
		
		System.out.println("Minimum Position: " + minPosition);
		
		return minPosition;
		
	}
	
	

}
