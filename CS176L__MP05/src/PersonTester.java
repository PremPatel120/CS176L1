
public class PersonTester {

   public static void main(String[] args) {
       PersonList1 personList1 = new PersonList1();
      
       //add 5 persons to list1
       personList1.add("Shreyas", "Male", 5.6, 127.8, 24);
       personList1.add("Alexandro", "Male", 5.4, 130.2, 21);
       personList1.add("Manishka", "Female", 5.2, 98.2, 20);
       personList1.add("Joyna", "Female", 5.1, 102.3, 20);
       personList1.add("Jayesh", "Female", 5.5, 107.8, 22);
      
       //print the person of list-1
       System.out.println("Person in List-1:");
       personList1.print();
       //get the tallest in list-1
       Person tallest = personList1.returnTallest();
       //print the tallest person
       System.out.println("\nThe tallest person in List-1 is:");
       tallest.print();
      
       PersonList2 personList2 = new PersonList2();
       //add 5 persons to list1
       personList2.add("Alice", "Female", 5.7, 115.3, 35);
       personList2.add("Sudiptha", "Female", 5.4, 110.7, 21);
       personList2.add("Karunya", "Male", 5.5, 122.4, 20);
       personList2.add("Zaime", "Male", 6.0, 169.4, 25);
       personList2.add("Hagen", "Male", 5.8, 147.4, 22);
      
       //print the person of list-2
       System.out.println("\nPersons in List-2:");
       personList2.print();
       tallest = personList2.returnTallest();
       //print the tallest person
       System.out.println("\nThe tallest person in List-2 is:");
       tallest.print();
   }
}