package curs2;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		System.out.println("Introdu calificativul primit: ");
		Scanner scan = new Scanner(System.in);
		String calificativ = scan.next();
		
		switch(calificativ) {
		
		case "A" :
			System.out.println("Great job!");
			break;
		case "B":
			System.out.println("Not that good!");
			break;
		case "C":
			System.out.println("Kind of bad!!");
			break;		
		default:
			System.out.println("Te rog introdu un calificativ dintre A, B si C");
		}
				
		

	}

}
