package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Calculator");

		try(Scanner sc = new Scanner(System.in)) { 
			
			System.out.println("Enter your first number");
			double number1 = sc.nextDouble();
			
			System.out.println("Choose your operation +, -, * , / ");
			String operation = sc.next();
			
			System.out.println("Choose your second number");
			double number2 = sc.nextDouble();
			
			double result = 0;
			
			if(operation.equals("+")) {
				result = number1 + number2;
			} else if(operation.equals("-")) {
				result = number1 - number2;
			} else if(operation.equals("*")) {
				result = number1 * number2;
			} else if(operation.equals("/")) {
				result = number1 / number2;
			}			
			
			System.out.println("Your first number is: " + number1);
			System.out.println("Your second number is: " + number2);
			System.out.println("Result is: " + result);
		}
	}
}
