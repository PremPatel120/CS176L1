
public class CashRegister1 {
	
	private double purchase;
	private double payment;
	
	public CashRegister1 ()
	{
		
		purchase = 0;
		
		payment = 0;
		
	}
	
	public void recordPurchase (double sale)
	{
		
		purchase = purchase + sale;
		
		
	}
	
	public void recievePayment (double amount)
	{
		
		payment = payment + amount;
		
	}
	
	public double giveChange ()
	{
		
		return purchase - payment;
		
	}
	
	
	

}
