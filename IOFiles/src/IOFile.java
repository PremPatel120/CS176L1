import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IOFile {
	
   public static void main(String[] args) throws Exception {
	   
       Scanner inputFile = null;
       
       try 
       {
    	   
           inputFile = new Scanner(new File("numbers.txt"));
           
       } 
       catch (FileNotFoundException e) 
       {
    	   
           System.out.println("FILE NOT FOUND");
           
           return;
           
       }
       
       // looping through the file
       double total = 0, n;
       
       while (inputFile.hasNextDouble()) 
       {
    	   
           n = inputFile.nextDouble();
           
           total += n;

       }
       
       PrintWriter pw = new PrintWriter(new File("total.txt"));
       
       pw.println(total);
       
       pw.close();
       
       inputFile.close();
       
       System.out.println("Printed total to file");
       
   }
   
}