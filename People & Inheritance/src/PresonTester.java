
public class PresonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person ("John", 1965);
		Person p2 = new Person ("Mary Ann", 1970);
	
		
		Person s1 = new Student ("Ann", 1982, "Computer Science");
		Person s2 = new Student ("Thomas", 1986, "Biology");
		
		
		Person i1 = new Instructor ("Joseph", 1954, 65000);
		
		
		System.out.print(p1);
		System.out.println("Expected: Person[name = John, birthyear = 1965]" + "\n");
		
		System.out.print(p2);
		System.out.println("Expected: Person[name = Mary Ann, birthyear = 1965]" + "\n");
		
		System.out.print(s1);
		System.out.println("Expected: Student[super = Person[name = Ann, birthyear = 1982], major = Computer Science]" + "\n");
		
		System.out.print(s2);
		System.out.println("Expected: Student[super = Person[name = Thomas, birthyear = 1986], major = Biology]" + "\n");
		
		System.out.print(i1);
		System.out.println("Expected: Instructor[super = Person[name = Joseph, birthyear = 1954], salary = 65000.0]" + "\n");
		

	}

}
