package practicebeginner.Concepts;


public class SwitchCase {
	
	
	public void characterSwitch() { 
		char ch='b';
	     switch(ch)
	     {
		 case 'd':
		   System.out.println("Case1 "); 
		 case 'b':
		   System.out.println("Case2 ");
		 case 'x':
		   System.out.println("Case3 ");
		 case 'y':
	          System.out.println("Case4 ");
	     default:
		   System.out.println("Default ");
	     }
	 }
	
	public void intergerSwitch() { //Break statements are used when you want your program-flow to come out of the switch body.
		int i=2;
	      switch(i)
	      {
		 case 1:
		   System.out.println("Case1 ");
		   break;
		 case 2:
		   System.out.println("Case2 ");
		   break;
		 case 3:
		   System.out.println("Case3 ");
		   break;
		 case 4:
	           System.out.println("Case4 ");
	           break;
		 default:
		   System.out.println("Default ");
	      }
	}
 public static void main(String args[]) {
	 SwitchCase obj1=new SwitchCase();
	 System.out.println("Switchcase method without break");
	 obj1.characterSwitch();
	 
	 System.out.println("Switchcase method with break");
	 obj1.intergerSwitch();
	  
}
}

