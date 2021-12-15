package WeekTwo;

public class StateExampleTwo {

	 // instance variable  
	 // Memory allocation will be done at the time of object creation for instance variables
	 // Memory allocation will be done at the time of class loading for static variables
	
	static int count = 0;          

	StateExampleTwo() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {

		StateExampleTwo c1 = new StateExampleTwo();
		StateExampleTwo c2 = new StateExampleTwo();
		StateExampleTwo c3 = new StateExampleTwo();

	}

}
