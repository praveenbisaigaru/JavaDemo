package WeekThree;

public class ThisDemo {

	/*
	 * 1. This keyword refers to current instance of the class 2. Using this keyword
	 * we can access instance members both ( variables and methods ). 3. specifying
	 * this keyword is sometimes optional and sometimes mandatory
	 * 
	 * Mandatory
	 * 
	 * if there is a confusion between instance variables and local variables then specifying this keyword is mandatory
	 * - what is confusion - instance and local variables if they share the same name
	 * In such cases if we do not specify the "this" keyword then the compiler will also not specify this keyword and instead access local variables.
	 * if we want to access instance variables which has a same name as local variables then the programmer
	 * has to specify this keyword 
	 * 
	 * 
	 * Optional
	 * 
	 * 
	 * 
	 */

	int a = 10; // instance variables

	void display() {
		int a = 20;  // local variables
		System.out.println("instance varaibles: "+ this.a);
		System.out.println("local variable:  " + a);	
	}

	public static void main(String[] args) {

		ThisDemo obj1 = new ThisDemo();
//		System.out.println(obj1.a);
		obj1.display();
	}
}
