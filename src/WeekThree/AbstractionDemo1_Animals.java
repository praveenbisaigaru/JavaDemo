package WeekThree;

abstract public class AbstractionDemo1_Animals {   // abstract class 
	
	abstract  void sound();    // abstract method or unimplemented method
	
	void display()   // concreate method
	{
		System.out.println("i am a concreate method of parent abstract class");
	}
	
	AbstractionDemo1_Animals()
	{
		System.out.println("i am a Constructor of parent abstract class");
	}

}
