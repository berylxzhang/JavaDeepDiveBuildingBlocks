
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class ArithmeticCalculator {
	
	public static void main(String[] args) 
	{
		//storing two numbers
		
		double n1, n2;
		
		//Get the input from the user
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		
		//Take in the numbers 
		
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		
		System.out.println("Enter the operator (+,-,*,/)");
		
		char op = sc.next().charAt(0);
		
		double out = 0;
		
		switch(op) {
		
		//adding two numbers
		
		case '+':
		
			out = n1 + n2;
		
			break;
		
		//subtracting two numbers
			
		case '-':
			
			out = n1 - n2;
			
			break;
		
		//multiplying two numbers
			
		case '*':
			
			out = n1*n2;
			
			break;
		
		//dividing two numbers
			
		case '/':
			
			out = n1/n2;
			
			break;
		
		default:
			
			System.out.println("You entered wrong inputs.");
			
			break;
		}
		
		System.out.println("The final result:");
		
		System.out.println();
		
		//printing the final result
		
		System.out.println(n1 +" "+ op +" "+ n2 + " = " + out);
	}
}
