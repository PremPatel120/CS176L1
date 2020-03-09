
public class ComboLock {
	
	private int number = 0;
	
	private int secret1;
	private int secret2;
	private int secret3;
	
	private boolean pos0 = false;
	private boolean pos1 = false;
	private boolean pos2 = false;
	private boolean pos3 = false;
	private boolean unlock = false;
	
	public ComboLock (int insecret1, int insecret2, int insecret3)
	{
		
		secret1 = insecret1;
		
		secret2 = insecret2;
		
		secret3 = insecret3;		
		
	}
	
	public void reset()
	{
		
		pos0 = true;
		
		pos1 = false;
		
		pos2 = false;
		
		pos3 = false;
		
	}
	
	public void turnLeft(int left)
	{
		
		if (pos0 == true)
		{
			
			number = (number + left)%40;
			
			if (number == secret2)
			{
				
				pos2 = true;
				
			}
			
			else
			{
				
				pos2 = false;
				
			}
			
		}
		
	}
	
	public void turnRight(int right)
	{
		
		if (pos1)
		{
			
			number = (40 - right);
			
			if (number == secret1)
			{
				
				pos1 = true;
				
				pos0 = false;
				
			}
			
			else
			{
				
				if (number - right > 0)
				{
					
					pos3 = true;
					
				}
				
				else
				{
					
					number = (40 - (right - number));
					
					pos3 = false;
					
					if (number == secret3)
					{
						
						pos3 = true;
						
					}
					
				}
				
			}
			
		}
		
	}
	
	public boolean open()
	{
		
		if (pos1 && pos2 && pos3)
		{
			
			unlock = true;
			
			System.out.print("Lock is open");
			
		}
		
		else
		{
			
			unlock = false;
			
			System.out.println("Lock did not open. Try againg");
			
		}
		
		return unlock;
		
	}
	
	public int getNumber()
	{
		
		return number;
		
	}
	

}
