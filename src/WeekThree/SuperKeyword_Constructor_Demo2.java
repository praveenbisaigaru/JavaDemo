package WeekThree;

public class SuperKeyword_Constructor_Demo2  extends SuperKeyword_Constructor_Demo1{
	
	SuperKeyword_Constructor_Demo2()
	{
//		super();
		System.out.println("THis is my child constructor");		
	}
	
	public static void main(String[] args) {
		
		SuperKeyword_Constructor_Demo2 obj1 = new SuperKeyword_Constructor_Demo2();  // constructor will be execuated at the time of object creation
	
	}

}
