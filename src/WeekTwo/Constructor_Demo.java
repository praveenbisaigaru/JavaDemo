package WeekTwo;

public class Constructor_Demo {

	/*
	 * Rules/ Concepts of constructor 
	 * 1. Constructor a special type of method 
	 * 2.Constructor Name must to same as the class name 
	 * 3. It can not contain return type 
	 * 4. It is used to initialize an instance variables 
	 * 5. It will execute during object creation 
	 * 6. It will execute one time for every object creation
	 * 7. It can contain any number of parameters 1) Zero parameterized constructor
	 * (Default constructor) 2. parameterized constructor 8. A class may contain any
	 * number of constructors but the order of the parameters or number of
	 * parameters should be different - (Signature of the constructor) 
	 * 9. Constructor job is not be create a object of the class, it is used to
	 * initialize the values to the object , the new keyword is used to create an
	 * object / instance of the class class_Name obj1 = new Class_Name();
	 * 
	 * classname referenceVariable = new -create an object/instnace of the class
	 * constructor which is used to initilize the value of the instance variables not to create an object
	 * as discussed above object creation will be done by new keyword, also after creating an object
	 * initialization is mandatory else it will be default values which has no meaning / no sense.
	 * 
	 * 10. Case1 : don't initiize instance variables 
	 *  when ever an object is created a seperate cpoy of the instance varaibles are created
	 *  and for these variables a default values with be assigned by JVM
	 *  
	 *  the case 1 can be resolved with the help of constructor , where with the help of constructor 
	 *  we can assign values to the instance variables which are not initiized 
	 *  
	 * 11. instance variables - method - object Creation
	 *     instance varaibles - constructor - you can do it directly, with the help of object creation 
	 * 
	 */

	int Slno;
	String StudentName;
	String course;

	public static void main(String[] args) {
		Constructor_Demo obj1 = new Constructor_Demo();
		Constructor_Demo obj2 = new Constructor_Demo();
		/*
		 * Constructor_Demo obj3 = new Constructor_Demo(001, "praveen");
		 * Constructor_Demo obj4 = new Constructor_Demo("Raju", 002); Constructor_Demo
		 * obj5 = new Constructor_Demo("Satish", 003); Constructor_Demo obj6 = new
		 * Constructor_Demo("naresh", 004, "javaWithSelenium");
		 */

	}

	Constructor_Demo() {
		System.out.println("Default constructor");
		Slno = 101; // 11 point
		System.out.println(Slno);
		System.out.println(StudentName);
	}
	/*
	 * Constructor_Demo(int n, String s) { Slno = n; StudentName = s;
	 * System.out.println("Parameterized constructor");
	 * System.out.println("SLNO:   " + Slno + "  StudentName:   " + StudentName); }
	 * 
	 * Constructor_Demo(String s, int n) { Slno = n; StudentName = s;
	 * System.out.println("Parameterized constructor");
	 * System.out.println("SLNO:   " + Slno + "  StudentName:   " + StudentName); }
	 * 
	 * Constructor_Demo(String s, int n, String c) { Slno = n; StudentName = s;
	 * course = c; System.out.println("Parameterized constructor");
	 * System.out.println("SLNO:   " + Slno + "  StudentName:   " + StudentName +
	 * " courseName:  " + course); }
	 */
}
