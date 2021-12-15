package WeekTwo;

public class StaticBlock_ExampleTwo {

	static {
		System.out.println("Static block 1");
	}

	static {
		System.out.println("Static block 2");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		StaticBlock_ExampleTwo d = new StaticBlock_ExampleTwo();	
	}

	{
		System.out.println("Instance Block 1");
	}

	{
		System.out.println("Instance Block 2");
	}

	StaticBlock_ExampleTwo() {
		System.out.println("Zero Parameter constructor");
	}

	StaticBlock_ExampleTwo(int x) {
		System.out.println("Parameter constructor");
		System.out.println(x);
	}

}
