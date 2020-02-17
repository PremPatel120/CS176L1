import java.text.NumberFormat;

public class CashRegisterVersion2 {
	
	private double purchase;
	private double payment;
	private double discount;
	private double amountDiscounted;
	private double afterDiscount;
	
	NumberFormat format = NumberFormat.getCurrencyInstance();
	
	public CashRegisterVersion2 ()
	{
		
		purchase = 0.0;
		
		payment = 0.0;
		
	}
	
	public void recordPurchase (double sale)
	{
		
		purchase = purchase + sale;
		
	}
	
	public void calculateDiscount (final double THRESHOLD, final double DISCOUNT)
	{
		
		if (purchase >= THRESHOLD)
		{
			
			amountDiscounted = DISCOUNT * purchase;
			
			afterDiscount = purchase - amountDiscounted;
			
			System.out.println("Your total purchases are: " + format.format(purchase));
			
		}
		
	}
	
	public void recievePayment (double amount)
	{
		
		payment = payment + amount;
		
	}
	
	public double giveChange ()
	{
		
		return payment - afterDiscount;
		
	}
	
	public void printChange ()
	{
		
		System.out.println("Your change is: " + format.format(giveChange()));
		
	}
	

}
