package curs5Tema;

import java.util.Scanner;

public class LunaAn {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Introdu un numar intre 1 si 12 : ");
        int numar = scan.nextInt(); // numar luna
            
		
		
        String[] numeLuna = new String[] {"Invalid", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November", "December"};
         
        
  
        if(numar>0 && numar<13) {
        	System.out.println("Luna este: " + numeLuna[numar]);
        }else {
        	System.out.println("Numarul este invalid. Introdu un numar valid. ");
        }
			
		}
		
		
		
		

	}


