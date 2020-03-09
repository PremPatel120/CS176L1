import java.util.Scanner;

public class ComboLockDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		ComboLock Demo = new ComboLock(10, 20, 30);
		
		Demo.turnRight(30);
		Demo.turnLeft(10);
		Demo.turnRight(30);
		
		Demo.open();
		
		Demo.turnRight(38);
		Demo.turnLeft(23);
		Demo.turnRight(23);
		
		Demo.open();

	}

}
