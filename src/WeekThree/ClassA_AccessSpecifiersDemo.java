package WeekThree;

public class ClassA_AccessSpecifiersDemo {

	
//	private int x = 10;  // private
	
//	int x = 10;   // default
	
//	protected int x = 10;  // protected
	
	public int x = 10;
	
	public static void main(String[] args) {
		
		ClassA_AccessSpecifiersDemo obj1 = new ClassA_AccessSpecifiersDemo();
		
		System.out.println(obj1.x);
		
	}
}

// public > protected > default > private  