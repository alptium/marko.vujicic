package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {  
			
			System.out.println("Gradebook");
			
			System.out.println("Enter student's name:");
			String studentName1 = sc.next();
			System.out.println("Enter student's surname:");
			String studentSurname1 = sc.next();
			System.out.println("Enter student's grade:");
			double studentGrade1 = sc.nextDouble();
			
			System.out.println("Enter student's name:");
			String studentName2 = sc.next();
			System.out.println("Enter student's surname:");
			String studentSurname2 = sc.next();
			System.out.println("Enter student's grade:");
			double studentGrade2 = sc.nextDouble();
			
			System.out.println("Enter student's name:");
			String studentName3 = sc.next();
			System.out.println("Enter student's surname:");
			String studentSurname3 = sc.next();
			System.out.println("Enter student's grade:");
			double studentGrade3 = sc.nextDouble();
			
			System.out.println("Enter student's name:");
			String studentName4 = sc.next();
			System.out.println("Enter student's surname:");
			String studentSurname4 = sc.next();
			System.out.println("Enter student's grade:");
			double studentGrade4 = sc.nextDouble();
			
			System.out.println("Enter student's name:");
			String studentName5 = sc.next();
			System.out.println("Enter student's surname:");
			String studentSurname5 = sc.next();
			System.out.println("Enter student's grade:");
			double studentGrade5 = sc.nextDouble();
			
			double totalGrade = (studentGrade1 + studentGrade2 + studentGrade3 + studentGrade4 + studentGrade5) / 5;
			
			System.out.println("Total Grade is: " + totalGrade);
		
		}
	}
}
