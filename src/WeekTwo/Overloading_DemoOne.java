package WeekTwo;

public class Overloading_DemoOne {
	
	void addition(int x, int y)   // instance method
	{	
		System.out.println("Result3:  " +(x+y));
	}
	
	void addition(int a, float b)   // instance method
	{	
		System.out.println("Result1:  " +(a+b));
	}
	
	void addition(float a, int b)   // instance method
	{	
		System.out.println("Result4:  " +(a+b));
	}
	
	void addition(int x, int y,int z)    // instance method
	{	
		System.out.println("Result2:  " +(x+y+z));
	}
	
	public static void main(String[] args) {
		
		Overloading_DemoOne obj1 = new Overloading_DemoOne();
		
		obj1.addition(5, 5, 5);
		obj1.addition(5, 5);
		obj1.addition(5.0f, 15);
		obj1.addition(5, 1.0f);
		
	}

}
