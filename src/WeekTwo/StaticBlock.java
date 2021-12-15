package WeekTwo;

public class StaticBlock {

	/*
	 * 1. if we specify a group of statements within a pair of flower braces with
	 * static keyword then it is called as static block 
	 * 2. The purpose of the static block is to initialize static variables 
	 * 3. Its not mandatory to initialize
	 * the static variables, if it is not done then the default value to be
	 * considered 
	 * 4. we can have multiple static blocks in a single program 
	 * 5.static block will execuate at the time of class calling or class loading 
	 * 6.static block will be execuated before the main method 
	 * 7. static block will execuate with the main method, without main method the static block will not
	 * be execuated. where as instance block will be execuated , when we create the object of the class
	 * 
	 * what is the execuation order
	 * 
	 * 1. static block 2. Main Method 3. instance block 4. constructor
	 * 
	 */

	static int x;
	
	static {
		x = 44;
	}

	static {
		System.out.println("Hello I am a static block");
	}

	public static void main(String[] args) {
		System.out.println(StaticBlock.x);
	}

}
