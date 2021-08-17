package practicebeginner.Concepts;

   class Parent {
	void disp()//Overridden method
	   {
		System.out.println("This is a overridden method of parent class");
	   }	   
	void newmethod1() {
		System.out.println("This is non overriden method of parent class");
	}
	}
	class MethodOverriding extends Parent{
		
		
		public MethodOverriding() {
			System.out.println("This is a no arg constructor of the sub/child class");
		}
		
	   //Overriding method
	   void disp(){
		System.out.println("disp() method of Child class");
	   }
	   public void newMethod2(){
		System.out.println("new method2 of child class");
	   }
	   public static void main( String args[]) {
		/* When Parent class reference refers to the parent class object
		 * then in this case overridden method (the method of parent class)
		 *  is called.
		 */
		Parent obj = new Parent(); //new keyword calls the Parent class constructor and the object 'obj'
		   // is used to access the Parent class attributes and methods.
		obj.disp();

		
		MethodOverriding obj2 = new MethodOverriding(); //new keyword calls the MethodOverriding class constructor and the object 'obj2' is used to access the MethodOverriding class attributes and methods
		obj2.disp();//This is called dynamic method dispatch and runtime polymorphism


		Parent obj3=new MethodOverriding(); //new keyword calls the MethodOverriding class constructor and the object 'obj3' is used to access the Parent class attributes and methods as well as child class overriding methods. 
		obj3.disp(); //This is called dynamic method dispatch and runtime polymorphism
		obj3.newmethod1();//accessing base class non overridden methods


		MethodOverriding obj4=new MethodOverriding();
		obj4.newMethod2();
		
		new MethodOverriding();
	   }
}
