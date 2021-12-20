package WeekTwo;

public class Overloading_DemoThree {

	public static void main(int[] args) {
		System.out.println("int array");
	}

	public static void main(int args) {
		System.out.println("int parameter");
	}

	public static void main(String[] args) // original main method
	{
		main(12);
		main(new int[] { 4, 5, 6, 7, 8, 9 });
	}

}
