import java.util.Random;

public class VenueTester
{
   //main class
   public static void main (String[] args)
   {
       //create an object of Venue class
       Venue2 prudentialCenter = new Venue2(4, 5, 10);
      
       int section, row, seat;
      
       //create an instance of Random class
       Random rand = new Random();
      
       //loop executes 100 times
       for(int i=0; i<100; i++)
       {
    	   
           //generate a new section, row and seat randomly
    	   
           section = rand.nextInt(4);
           
           row = rand.nextInt(5);
           
           seat = rand.nextInt(10);
          
           //determine if the seat is taken true or available false.
           
           boolean fg= prudentialCenter.seatLookup (section,row,seat);
          
           //If available
           
           if(fg==false)
           {
        	   
               //Print seat awarded
        	   
               System.out.println ((section+1) + "-" + (row+1) + "-" + (seat+1) + " seat awarded");
               
               //seatLookup will award the seat and change it to true
               
               prudentialCenter.allSeats[section][row][seat] = true;
               
           }
           
           else
           {
        	   
               //Print seat taken if it was unavailable.
        	   
               System.out.println ((section+1) + "-" + (row+1) + "-" + (seat+1) + " seat taken");
               
           }
           
       }
       
   }
   
   
}