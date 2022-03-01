package curs2;

import java.util.Scanner;

public class SwitchHomework {

	public static void main(String[] args) {
		
		System.out.println("Introdu numarul: ");
		Scanner scan = new Scanner(System.in);
		int numar = scan.nextInt();
		
		String ziuaSaptamanii = "";
        boolean nrValid = true;
		
		switch(numar)
        {
		
        case 1:
            ziuaSaptamanii = "luni";
            break;   	
        case 2:
            ziuaSaptamanii = "marti";
            break;   
        case 3:
            ziuaSaptamanii = "miercuri";
            break;   
        case 4:
            ziuaSaptamanii = "joi";
            break;   
        case 5:
            ziuaSaptamanii = "vineri";
            break;   
        case 6:
            ziuaSaptamanii = "sambata";
            break;   
        case 7:
            ziuaSaptamanii = "duminica";
            break;   
		default:
			System.out.println("Te rugam sa introduci un numar intre 1 si 7  ");
			nrValid= false;
        }
        if(nrValid) {
        System.out.println("Ziua saptamanii este " + ziuaSaptamanii);
        }
    }	
     

}
