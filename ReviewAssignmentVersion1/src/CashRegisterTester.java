import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CashRegister1 cashier = new CashRegister1();
		
		System.out.println("Enter a purchase amount, or -1 to stop: ");
		
		Scanner input = new Scanner(System.in);
		double restore = input.nextDouble();
		
		while (restore != -1)
		{
			
			cashier.recordPurchase(restore);
			
			System.out.println("Enter a purchase amount, or -1 to stop: ");
			
			restore = input.nextDouble();
			
			cashier.recordPurchase(restore);
			
		}
		
		System.out.println("Enter Payment: ");
		
		double payment = input.nextDouble();
		
		cashier.recievePayment(payment);
		
		System.out.print("Change: ");
		
		System.out.printf("%.2f", cashier.giveChange());
		

	}

}
