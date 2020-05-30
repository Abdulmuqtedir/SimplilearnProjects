package assistedjava;

//Creating an object

public class Buddy {
	
	public Buddy (String name)  {
//This constructor has one parameter, name
		
		System.out.println("Passed name is: " + name);
	}

	public static void main(String[] args) {
//The following statement would create an object myBuddy
		
		Buddy myBuddy = new Buddy("Fierce");

	}

}
 