package WeekThree;

public class Method_Overriding {
    
	
	/* 
	 * 1. if a single entity shows multiple forms or multiple behaviors then it is called as polymorphism
	 * polymorphism can be classified into 2 types
	 * 
	 * 1. Compile time polymorphism : if the polymorphic nature of an entity is decided by the compiler during the compilation time
	 *                                 then it is called as compiler time polymorphism
	 *                                 - we will use method overloading to achieve CTP (Compile time polymorphism)
	 * Compile (overloading/ static /early binding) method name should be same,  signature should be different,
	 *                                        return type can be different or same
	 * 2. Run time polymorphism      : if the polymorphic nature of an entity is decided by the JVM during the run  time
	 *                                 then it is called as run time polymorphism 
	 *                                 - we will use method overriding  to achieve RTP (run time polymorphism)
	 * RunTime (overriding / dynamic / late binding)  method name should be same, signature should be same ,
	 *                                        return type should be  same and should have parent child relationship
	 *                                       - Overriding means to override the functionality of an exiting method
	 *                                       - declaring a method in the sub class which is already present in 
	 *                                         parent class is know as method overriding     
	 * 
	 * OVerloading                                       OVerriding
	 * 1) Method name should be is same                         1) Method name should be same
	 * 2) Signature should be different                         2) signature should be same
	 * 3) return type can be same or different                  3) return type should be same
	 * 4) instance methods , static methods ,                    4)only  instance instance  
	 *  main  methods and constructor             
	 * 5) can be applied to same or child class                 5) only parent and child class
	 * 6) JVM compilation                                        6) JVM run time (in the run time, JVM figures out the object type and 
	 *                                                                             would run the method
	 *                                                                              that belongs to that particular object)
	 *                                                                              
	 *  Question : can static and final methods can be overridden 
	 *  
	 *                                                                              
	 * */
	
//	 

	
	public static void main(String[] args) {
		
	}
   
	 
}
