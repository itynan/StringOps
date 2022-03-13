package ops;
//adapted from Jamie Chan - Learn Java in one Day 
import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchDemo {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {	
		//tryCatch(s);
		//tryCatch2(s);
	}

	public static void tryCatch(Scanner s){
		int num, deno;
		
		try
		{
			System.out.print("please enter the numerator: ");
			num = s.nextInt();
			System.out.print("please enter the denominator: ");
			deno = s.nextInt();
			System.out.println("Your result is "+ num/deno);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			tryCatch(s);
		}
		
	}
	
	public static void tryCatch2(Scanner s){
		int element = 0;
		int[] arr   = {1,2,3,4,5,6,7,8,9};
		System.out.println("Please enter Array index: ");
		
		try
		{
			element = s.nextInt();
			System.out.printf("arr[%d] = %d%n", element, arr[element]);
		}catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("index out of bounds");
		}catch(InputMismatchException e)
		{
			System.out.println("input was not an integer");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
