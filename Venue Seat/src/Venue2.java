import java.util.Scanner;

public class Venue2 {
		
   //Boolean array allSeats
   boolean allSeats[][][];
  
   //constructor to initialized the array
   public Venue2(int section, int row, int seat)
   {
	   
       allSeats = new boolean [section][row][seat];
      
       //initialized the array
       for(int i=0; i<section; i++)
    	   
           for(int j=0; j<row; j++)
        	   
               for(int k=0; k<seat; k++)
            	   
                   allSeats[i][j][k] = false;
       
   }
  
   //method seatLookup to return false if the seat is available or true if unavailable.
   public boolean seatLookup(int section, int row, int seat)
   {
	   
       if(allSeats[section][row][seat]==false) return false;
       
       return true;
       
   }
   
   
}