package curs4Tema;

public class Main {

	public static void main(String[] args) {
		
		Vehicul Bicicleta = new Bicicleta();
		Vehicul Masina = new Masina();

		Bicicleta.detaliiVehicul("Pegas", 15, 75);
		Masina.detaliiVehicul("Dacia", 80, 190);

		Main obj =  new Main();
		obj.verificaMotorizarea(Bicicleta);
		obj.verificaMotorizarea(Masina);


	}
	public void verificaMotorizarea(Vehicul vehicul){
		System.out.println(vehicul.nume());
		System.out.println(vehicul.motorizare());
	}
		

	}
