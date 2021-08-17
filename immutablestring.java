package practicebeginner.ExercisePrograms;

public class immutablestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Sachin";
s.concat(" Tendulkar"); //concat() method appends the string at the end
System.out.println(s);  //will print Sachin because strings are immutable objects  


s=s.concat(" Tendulkar"); //if we explicitely assign it to the reference variable, it will refer to "Sachin Tendulkar"
System.out.println(s); 
	}

}
