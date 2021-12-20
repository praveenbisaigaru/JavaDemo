package WeekTwo;

public class OverloadingChild_Demo1 extends OverloadingParent_Demo1 {

	void displays(int x) 
	{
		System.out.println(x);
		System.out.println("child Method");
	}

	public static void main(String[] args) {

		OverloadingChild_Demo1 obj1 = new OverloadingChild_Demo1();

		obj1.displays();
		obj1.displays(10);

	}
}
