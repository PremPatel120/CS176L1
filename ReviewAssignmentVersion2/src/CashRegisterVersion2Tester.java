import java.util.Scanner;

public class CashRegisterVersion2Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashRegisterVersion2 register = new CashRegisterVersion2();
		
		final double SENTINEL = -1;
		
		final double DISCOUNT = .10;
		
		final double THRESHOLD = 50;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Purchase Amount or -1 to stop: ");
		
		
		while (input.hasNextDouble())
		{
			
			double Cost = input.nextDouble();
			
			if (Cost == SENTINEL)
			{
				
				break;
				
			}
			
			System.out.println("Enter a Purchase Amount: ");
			
			register.recordPurchase(Cost);
			
		}
		
		register.calculateDiscount(THRESHOLD, DISCOUNT);
		
		/**System.out.println("Enter a Purchase Amount: ");*/
		
		double amountPaid = input.nextDouble();
		
		register.recievePayment(amountPaid);
		
		register.giveChange();
		
		register.printChange();
		

	}

}
