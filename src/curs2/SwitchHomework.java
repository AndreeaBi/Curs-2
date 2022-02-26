package curs2;

import java.util.Scanner;

public class SwitchHomework {

	public static void main(String[] args) {
		
		System.out.println("Introdu numarul: ");
		Scanner scan = new Scanner(System.in);
		String ziuaSaptamanii = scan.next();
		
		switch(ziuaSaptamanii)
        {
		
		case "1":
			System.out.println("Ziua saptamanii este luni ");
			break;		
		case "2":
			System.out.println("Ziua saptamanii este marti ");
			break;
		case "3":
			System.out.println("Ziua saptamanii este miercuri ");
			break;
		case "4":
			System.out.println("Ziua saptamanii este joi ");
			break;
		case "5":
			System.out.println("Ziua saptamanii este vineri ");
			break;
		case "6":
			System.out.println("Ziua saptamanii este sambata ");
			break;
		case "7":
			System.out.println("Ziua saptamanii este duminica ");
			break;
		default:
			System.out.println("Te rugam sa introduci un numar intre 1 si 7  ");
			
        }

	}

}
