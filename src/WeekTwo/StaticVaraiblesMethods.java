package WeekTwo;

public class StaticVaraiblesMethods {

	/*
	 * static keyword
	 * 
	 * Same class 1. static variables can be used directly 
	 * Different class  2. if we want to use the static variable of one class to another class we need to use
	 * the class name syntax : className.staticVariable
	 * 3. it can be used in front of variables / methods and blocks 
	 * 4. static keyword is java is used for memory management. it takes memory efficiently ,means it takes less memory 
	 * 5. static variable can be used to refer the common properties of all objects(that are not unique for each object).
	 *  static variables belong to class
	 *  not an individual object
	 * 6. static variables are declared in a class, but outside a method ,inside a constructor or any block 
	 * 7. static variable get memory only once in class area
	 * that to at the time of class loading. / Note for instance variable memory
	 * will be allocated at the time of object creation 
	 * 8. we can not use static variables in a non static methods
	 * 9. its not mandatory to initialize the static variables, if it is not done then the default value to be considered
	 * 10. When ever we create a object of a class, the objects are stored in the heap memory 
	 */

	int slNo; // instance variable
	String studentName;   // instance variable
	static String courseName = "SeleniumWithJava";  // static variable

	void display()   // instance method
	{
		System.out.println("slNo " + slNo + "   studentName  " + studentName + "   courseName   " + courseName);
	}
	
	StaticVaraiblesMethods(int s , String sn)   // constructor with parameters
	{
		slNo = s;
		studentName = sn;
	}

	public static void main(String[] args) {
		
		StaticVaraiblesMethods s1 = new StaticVaraiblesMethods(001,"sowmya");
		StaticVaraiblesMethods s2 = new StaticVaraiblesMethods(002,"saravanan");
		StaticVaraiblesMethods s3 = new StaticVaraiblesMethods(003,"kudil");
		
		s1.display();
		s2.display();
		s3.display();
	}
	


}
