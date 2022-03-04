package curs3.mostenire;

import java.util.Scanner;

public class TestQualification {

    public static void main(String[] args) {

        QualificationInheritance teacher = new QualificationInheritance();

        System.out.println("What course do you teach ? ");
        Scanner scan = new Scanner(System.in);
        teacher.setCourse(scan.next());

        System.out.println("How many years of experience do you have ? ");
        teacher.setExperienceYears(scan.nextInt());

        System.out.println("What is your schedule ? ");
        teacher.setSchedule(scan.next());

        teacher.verify();

    }
}
