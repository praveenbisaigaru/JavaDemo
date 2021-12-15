package WeekTwo;

public class TypesofVariables_SCIDCS_Demo1 {

	static int x = 44;

	static void display() {
		System.out.println("static method");
	}

	void display2() {
		System.out.println("instance method");
	}

	public static void main(String[] args) {

		TypesofVariables_SCIDCS_Demo1 a = new TypesofVariables_SCIDCS_Demo1();
		a.display2();

		display();
		System.out.println(x);

	}

}
