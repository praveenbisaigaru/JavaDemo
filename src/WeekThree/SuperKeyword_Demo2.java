package WeekThree;

public class SuperKeyword_Demo2 extends SuperKeyword_Demo {

	
	
	int x = 20;
	
	
	void a1()
	{
//		
		System.out.println("This is a child class method");
		super.a1();
	} 
	
	void display()
	{
		int x = 30;
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	
	
	public static void main(String[] args) {
		
		SuperKeyword_Demo2 obj1 = new SuperKeyword_Demo2();
		obj1.display();
		obj1.a1();
		
		
		/*
		 * // if there is no super keyword for accessing parent method a1
		 * 
		 * SuperKeyword_Demo obj2 = new SuperKeyword_Demo(); obj2.a1(); // disadvantages
		 * - extra lines of code and extra memory allocation
		 */	}
}
