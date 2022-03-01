package curs2;

import java.util.Scanner;

public class IfElseIfHomework {

	public static void main(String[] args) {
		
		System.out.println("Ce varsta ai? ");
		
		Scanner scan = new Scanner(System.in);
		int varsta = scan.nextInt();
		
		if(varsta < 0) {
	        System.out.println("Inca nu te-ai nascut!");			        
		}
		else if(varsta < 18) {
			System.out.println("Esti minor. ");		
		
		}
		else if(varsta <= 65) {
			System.out.println("Esti adult. ");
		
		
		}else
			System.out.println("Esti batran. ");				

	}

}
