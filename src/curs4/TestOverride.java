package curs4;

public class TestOverride {

	public static void main(String[] args) {
		
		Angajat angajat = new Angajat();
		angajat.work();

		
		Tester tester = new Tester();
		tester.work();
		tester.scrieTeste();
		
		
		Developer developer = new Developer();
		developer.work();
	}

}
