package WeekTwo;

public class InstanceBlock {
	
	/* 1. if we specify a group of statements within a pair of flower braces without any keyword then it is called as instance block
	 * 2. The purpose of the instance block is to initialize instance variables
	 * 3. Its not mandatory to initialize the instance variables, if it is not done then the default value to be considered
	 * 4. we can have multiple instance blocks in a single program
	 * 5. instance block will execuate at the time of object creation, multiple object creation will execuate instance block mutiple times
	 * */
	
	 int age;
	 float score;
	public static void main(String[] args) {
		
		InstanceBlock v1 = new InstanceBlock();
		InstanceBlock v2 = new InstanceBlock();
		System.out.println(v1.age);
		System.out.println(v1.score);
//		System.out.println(InstanceBlock.a);
		
	}
	
//	3 different way to assign instance variables
	
//	1   At the time of declaration
	int y = 25;
	
//	2   By using constructor
	InstanceBlock(){
		int c = 30;
	}
	
//	3   By using Instance block
	{
		int z = 32;
		System.out.println(z);
	}
	
	{
		int t = 12;
		System.out.println(t);
	}
//	4  In static block
	
	static 
	{
		int a = 20;
	}
	

}
