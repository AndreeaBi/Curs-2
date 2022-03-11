package curs5;

import java.util.Scanner;

public class TernaryOperatorEx2 {
	
	//citeste 2 numere
	//verifica daca fiecare este >0 (pozitiv)
	//verifica daca ambele sunt pozitive
	//verifica care este cel mai mic numar
	

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the first number : ");
		num1 = scan.nextInt();
		System.out.println("Enter the second number : ");
		num2 = scan.nextInt();
		
		String answer;
		
		//verifica daca fiecare este >0 (pozitiv)
		//cazul 1 cu if-else
		if(num1>0) {
			System.out.println("Num1 is positive");
		}else {
			System.out.println("Num1 is negative");
		}
		//cazul 2 cu operator ternar
		answer = num1>0 ? "Num1 is positive" : "Num1 is negative";
		System.out.println(answer);
		
		//verifica daca ambele sunt pozitive
		//cazul 1 cu if-else
		if(num1>0 && num2>0) {
			System.out.println("Both are positive");
		}else {
			System.out.println("One is negative");
		}
		//cazul 2 cu operator ternar
		answer = (num1>0) && (num2>0) ? "Both are positive":"One is negative";
		System.out.println(answer);
		
		//verifica care este cel mai mic numar
		//cazul 1 cu if-else
		if(num1<num2) {
			System.out.println("Num1 is the smallest");
			
		}else if(num1==num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Num 2 is the smallest");
					
		}
		//cazul 2 cu operator ternar
		answer = num1==num2 ? "Numbers are equals" : num1<num2 ? "Num 1 is the smallest" : "Num 2 is the smallest";

	}

}
