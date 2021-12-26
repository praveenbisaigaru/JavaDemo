package WeekThree;

public class Method_Overriding_ChildDemo extends Method_Overriding_ParentDemo {
	
	
	void camera() {
		System.out.println("10MP");
	}
	
	public static void main(String[] args) {
		
		Method_Overriding_ChildDemo obj1 = new Method_Overriding_ChildDemo();
		obj1.camera();
		
		obj1.mic();
		
	}

}
