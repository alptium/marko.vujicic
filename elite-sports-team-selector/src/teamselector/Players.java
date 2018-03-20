package teamselector;

public class Players {
	
	private String name;
	private String surname;
	private int birthYear;
	private double height;
	private double weight;
	private int yearsActive;
	private String injuries;
	private String birthPlace;
	
	public Players(String name, String surname, int birthYear, double height, double weight, int yearsActive, String injuries, String birthPlace) {
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.height = height;
		this.weight = weight;
		this.yearsActive = yearsActive;
		this.injuries = injuries;
		this.birthPlace = birthPlace;
	}
	
		public String getName() {
			return name;
		}
		
		public String getSurname() {
			return surname;
		}

		public int getBirthYear() {
			return birthYear;
		}
		
		public double getHeight() {
			return height;
		}
			
		public double getWeight() {
			return weight;
		}	
		
		public int getYearsActive() {
			return yearsActive;
		}	
		
		public String getInjuries() {
			return injuries;

		}
		
		public String getBirthPlace() {
			return birthPlace;
		}	
}
