package curs3.mostenire;

public class QualificationInheritance extends Teacher {

	public void verify() {

		if (getExperienceYears() > 3 && getCourse().equalsIgnoreCase("Java") && getSchedule().equalsIgnoreCase("Afternoon")) {
			System.out.println("You qualify to teach at this school!");
		}
		else {
			System.out.println("You do not qualify!");
		}
	}

	}