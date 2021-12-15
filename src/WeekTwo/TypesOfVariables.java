package WeekTwo;

public class TypesOfVariables {
	
	
	/* Types of Variables 
	 * 
	 * 1. Local
	 * 2. Global 
	 * 3. static
	 * 4. Reference variables
	 * 5. non static variables
	 * 
	 * 
	 * 1. Local  2.  Non static variables (Instance Variables) 3. static variables (class variables)
	 * 
	 * Local Variables: A variables which are declared inside the method
	 * 
	 * */
	
	int x =10;  // Instance variable
	static int y = 20;  // static variable or Global variable
	
	public static void main(String[] args) {

	int z = 30;  // local variable	
		
		System.out.println( "my local variable " + z);
		
		System.out.println("my static variable  " + y);
		
        //	System.out.println("my instance variable" + x);
		// can not make a static reference to an non static field x
		
		TypesOfVariables v = new TypesOfVariables();  //v is called reference variable
		
		System.out.println("my instance varaible  " + v.x);
		
	}
	

	

}
