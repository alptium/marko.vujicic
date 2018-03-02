package gradebook;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)) { 
		
		String student1;
		String student2;
		String student3;
		String student4;
		String student5;
		
		System.out.println("Enter student1 grade:");
		student1 = sc.next();
		System.out.println("Enter student2 grade:");
		student2 = sc.next();
		System.out.println("Enter student3 grade:");
		student3 = sc.next();
		System.out.println("Enter student4 grade:");
		student4 = sc.next();
		System.out.println("Enter student5 grade:");
		student5 = sc.next();
		
		int totalGrade = 0;
		
		System.out.println("Total grade is =" +  student1 + student2 + student3 + student4 + student5 + totalGrade );
		
		
		}
		
	}

}
