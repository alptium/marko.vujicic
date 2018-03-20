package teamselector;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)) {  

			System.out.println("Basketball Team Selector");
			System.out.println();
			System.out.println("Our requirements are: Age 18+, height 175+, weight 40+:");
			System.out.println();
			System.out.println("Please answer the following questions:");
			System.out.println();
			
			System.out.println("Enter your first name");
			String name = sc.next();
			
			System.out.println("Enter your last name");
			String surname = sc.next();
			
			System.out.println("Enter your birth year");
			int birthYear = sc.nextInt();
			
			System.out.println("Enter your height");
			double height = sc.nextDouble();
			
			System.out.println("Enter your weight");
			double weight = sc.nextDouble();
			
			System.out.println("How many years did you play");
			int yearsActive = sc.nextInt();
			
			System.out.println("Did you had any injuries?");
			String injuries = sc.next();
			
			System.out.println("Enter your birth place");
			String birthPlace = sc.next();
			
			Players players = new Players (name, surname, birthYear, height, weight, yearsActive, injuries, birthPlace);
			System.out.println("Name: " + players.getName());
			System.out.println("Surname: " + players.getSurname());
			System.out.println("Birth year: " + players.getBirthYear());
			System.out.println("Height: " + players.getHeight());
			System.out.println("Active years: " + players.getYearsActive());
			System.out.println("Injuries: " + players.getInjuries());
			System.out.println("Birth place: " + players.getBirthPlace());
			
			if (birthYear > 18 && height >= 175 && weight >= 40) {
				System.out.println("Congratulations, you can join our club!");
			} else {
				System.out.println();
				System.out.println("Unfortunatuly, you didn't pass our requirements!");

			}
		}
	}
}
