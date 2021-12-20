package WeekTwo;

public class OverloadingDemoTwo {

	static void show(int x) {
		System.out.println("int parameter");
	}

	static void show(double x) {
		System.out.println("double parameter");
	}

	public static void main(String[] args) {

		show(10);

		show(5.0);

	}
}
