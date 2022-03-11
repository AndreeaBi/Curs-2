package curs5;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		//ce e mai jos pot sa folosesc intr-o noua clasa de tip main, in care sa printez rezultatul sau direct aici, in clasa "Calculator"
		
		Calculator calc = new Calculator();
		calc.askTheuser();
		calc.calculateValues();
		calc.printResults();
	}
	
	
	/**Calculator pentru operatiile de baza (+, -, *, /) cu 2 numere
	//numerele sunt date de la tastatura, la fel si operatia matematica
	//printam operatia matematica si rezultatul: ex: 3 + 5 = 8
	*/
	
	int num1;
	int num2;
	char calculus;
	int result;
	
	//sa aflam numerele si operatia
	public void askTheuser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter the calculus:");
		calculus = scan.next().charAt(0);
		System.out.println("Please enter second number:");
		num2 = scan.nextInt();
	}
	
	//sa calculam
	public void calculateValues() {
		
		if(calculus == '+') {
			result = num1 + num2;
		}
		else if(calculus == '-') {
			result = num1 - num2;
		}
		
		else if(calculus == '*' || calculus == 'x') {
			result = num1 * num2;
		}else if(calculus == '/') {
			result = num1 / num2;
		}
		else {
			System.out.println("Wrong character!");
			
		
		
	}
	}
	
	//sa printam
	public void printResults() {
		System.out.println(num1 + " " + calculus + " " + num2 + " = " + result);
	}

}
