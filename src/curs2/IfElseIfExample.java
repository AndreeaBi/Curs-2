package curs2;

import java.util.Scanner;

public class IfElseIfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//intrebam punctajul unui test si atribuim un calificativ
		
		//daca a obtinut <= 90 puncte --> B
		//daca a obtinut <= 80 --> C
		//daca a obtinut <= 70 --> D
		//daca a obtinut < 60 --> E
		//daca a obtinut > 90 --> A
		
		System.out.println("Ce punctaj ai obtinut?");
		Scanner scan = new Scanner(System.in);
		int punctaj = scan.nextInt();
		
		char calificativ;
		
		if(punctaj <=60) {
			calificativ = 'E';
						
		}else if(punctaj <=70) {
			calificativ = 'D';
			
		}else if(punctaj <=80) {
			calificativ = 'C';
			
		}else if(punctaj <=90) {
			calificativ = 'B';
			
		}else {
			calificativ = 'A';
			
		}						
			
		
		System.out.println("Calificativul primit este :" + calificativ);
		

	}

}
