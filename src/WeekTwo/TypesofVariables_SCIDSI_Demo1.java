package WeekTwo;

public class TypesofVariables_SCIDSI_Demo1 {

	int x = 44;

	void display() {
		System.out.println("instance method");
	}

	void display2() {

		System.out.println("instance methos");
	}

	public static void main(String[] args) {

		TypesofVariables_SCIDSI_Demo1 a = new TypesofVariables_SCIDSI_Demo1();

		a.display();
		a.display2();

		System.out.println(a.x);

	}

}
