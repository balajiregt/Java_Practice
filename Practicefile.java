package practicebeginner.Concepts;

//run time polymorphism
//overridden method vs overriding method
//
public class Practicefile {
    public void mymethod() {
        System.out.println("This in the parent class method implementation");
    }
}
class child extends Practicefile{
    public void mymethod(){
        System.out.println("This the child class method implementation ");
    }
}

class Main{

    public static void main(String args[]) {
       child obj1=new child();
       System.out.println("The object reference is" +obj1);
       obj1.mymethod(); //here overriding method is used

       Practicefile obj2  =new child(); //method determination is done by the 'type of object' during run time. And it is "child"
       obj2.mymethod();

       Practicefile obj3=new Practicefile(); //method determination is done by the 'type of object' during run time. And it is "Practicefile"
       obj3.mymethod();

    }
}



