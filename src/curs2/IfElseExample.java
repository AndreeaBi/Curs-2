package curs2;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username = "test";
		String password = "test123";
		
		
		System.out.println("Introdu username :");
		Scanner scan = new Scanner(System.in);
		String user = scan.next();
		System.out.println("Introdu parola :");
		String pass = scan.next();
		
		//&& -- and operator
		// || -- or operator
		
		if(username.equals(user) && password.equals(pass) ) {
			System.out.println("Login successfull!");
		}else {
			System.out.println("Username or password is wrong!");
						
			
		}
		
		
		

	}

}
