package WeekThree;

public class Employer_SingleLevelInheritanceDemo extends Employee_SingleLevelInheritanceDemo {
	
	float bonus = 5000;
	
	public static void main(String[] args) {
		
		Employer_SingleLevelInheritanceDemo obj1 = new Employer_SingleLevelInheritanceDemo();
		
		System.out.println(obj1.salary+obj1.bonus);

	}
}
