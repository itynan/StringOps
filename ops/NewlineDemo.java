package ops;
import java.util.Scanner;
//taken from Jamie Chan - Learn Java in one Day 

public class NewlineDemo {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("enter an int:");
	
//	double myDoub= s.nextDouble();
//	double myDoub2= s.nextDouble();
	
	int myInt = s.nextInt();
	
	System.out.printf("you entered %d.%n%n",myInt);
	//System.out.println(myDoub2);
	
	System.out.print("enter a double:");
	double myDouble = s.nextDouble();
	System.out.printf("you entered %.2f.%n%n", myDouble);
	
	System.out.print("Enter a String: ");
	s.nextLine();  //need to consume newline from myDouble user entry
	
	String myString = s.nextLine();	
	System.out.printf("You entered \"%s\".", myString);
	System.out.printf("Yoasdfasdfasdf");
	}
	
	
}
