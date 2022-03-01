package curs3;

public class IncrementDecrementExample {

	public static void main(String[] args) {
		
		int number = 10;
		
		System.out.println(number = number+1); 
		
		System.out.println(++number); // pre increment (incrementarea se face inainte de executia liniei)
		
		System.out.println(number++); //post increment (incrementarea se face dupa executia liniei)
		
		System.out.println(number);
		
		System.out.println(--number); //pre decrement;
		
		System.out.println(number--); //post decrement
		
		System.out.println(number);

	}

}
