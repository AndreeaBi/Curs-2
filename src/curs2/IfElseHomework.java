package curs2;

import java.util.Scanner;

public class IfElseHomework {

	public static void main(String[] args) {
		
		
		System.out.println("Ce punctaj ai obtinut? ");
		Scanner scan = new Scanner(System.in);
		int punctaj = scan.nextInt();
		
		if(punctaj <= 65) {
			System.out.println("Ai picat. Mai incearca. ");
		
		
		}else {
			System.out.println("Felicitari. Ai trecut. ");
		}

	}

}
