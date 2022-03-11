package curs4;

public class RoomCalculator {

	public static void main(String[] args) {
		
		Rectangle obiect = new Rectangle ();
		obiect.calculeazaAria();
		obiect.calculeazaPerimetru();
		
		//System.out.println(obiect.calculeazaAria());
		System.out.println(obiect.calculeazaPerimetru());
		int num3 = obiect.calculeazaPerimetru();
		
		System.out.println(num3);
		
		Rectangle obiect2 = new Rectangle(2,2);
		obiect2.calculeazaAria();
		System.out.println(obiect2.calculeazaPerimetru());

	}

}
