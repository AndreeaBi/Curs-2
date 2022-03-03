package curs3.mostenire;

import java.util.Scanner;

public class QualificationInheritance extends Teacher {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();		
		
		
		teacher.setCourse("Java"); 
		teacher.setExperienceYears(3);
		teacher.setSchedule("Afternoon");
		
		System.out.println("What course do you teach ? ");
		Scanner scan = new Scanner(System.in);
		String Course = scan.next();
		
		System.out.println("How many years of experience do you have ? ");
		int ExperienceYears = scan.nextInt();
		
		System.out.println("What is your schedule ? ");
		String Schedule = scan.next();
		
		if(Course.equals(Course) && ExperienceYears >=3 && Schedule.equals(Schedule)) {
			System.out.println("You qualify to teach at this school!");
		}else {
			System.out.println("You do not qualify!");
		
		}
	
	
	}

	}

	

