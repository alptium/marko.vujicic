package calculator;
import java.util.Scanner;



public class Calculator {

	public static void main(String[] args) {
		
System.out.println("Markova Matematika");


try (Scanner sc = new Scanner(System.in)){


System.out.println ("Unesite prvi broj: ");
int firstNumber = sc.nextInt();
System.out.println("Izaberite operaciju: +, -, * ,/ ");
String operation = sc.next();
System.out.println ("Unesite drugi broj: ");
int secondNumber = sc.nextInt();


int result = 0;

if(operation.equals("+")) {
	result = firstNumber + secondNumber;
} else if(operation.equals("-")) {
	result = firstNumber - secondNumber;
} else if(operation.equals("*")) {
	result = firstNumber * secondNumber;		
} else if(operation.equals("/")) {
	result = firstNumber / secondNumber;			
}


System.out.println("Rezultat je: " + result);

}
		
	}

}
