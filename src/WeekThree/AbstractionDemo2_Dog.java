package WeekThree;

public class AbstractionDemo2_Dog extends AbstractionDemo1_Animals{
	
	
	  void sound() 	            // The type AbstractionDemo2_Dog must implement the inherited abstract method AbstractionDemo1_Animals.sound()
	  {                         // A class derived from the abstract class must implement all those methods that are declared as abstract in the parent class
		                        // Abstract methods implementation will be written in the child class/derived class/sub class.
		  System.out.println("Barking"); 
		  }    
	 
	
	public static void main(String[] args) {
		
		
		  AbstractionDemo2_Dog obj1 = new AbstractionDemo2_Dog();
		  obj1.sound();
		  obj1.display();
		 
		
		/*
		 * AbstractionDemo1_Animals obj2 = new AbstractionDemo1_Animals(); // error: Cannot instantiate the type AbstractionDemo1_Animals 
		 * obj2.display();                                                 // For abstract classes we can create a reference variables but not an object of abstract class.
		 *  obj2.sound();
		 */
		
		
		/*
		 * AbstractionDemo1_Animals obj3 = new AbstractionDemo2_Dog(); // no error
		 * obj3.display(); obj3.sound();
		 */
		
	}
	

}
