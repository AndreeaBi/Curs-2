package curs4Tema;

public class Bicicleta extends Vehicul {
	public Bicicleta(String brand, int nivelPoluare, int vitezaMedie) {
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
	}
	
	public Bicicleta() {
		
	}
	@Override
	public  String nume() {
		return "bicicleta ";
	}
	@Override
	public  String motorizare() {
		return "pedale";
	}
		
}