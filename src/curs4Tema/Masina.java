package curs4Tema;

public class Masina extends Vehicul{
	
	public Masina(String brand, int nivelPoluare, int vitezaMedie) {
		setBrand(brand);
		setNivelPoluare(nivelPoluare);
		setVitezaMedie(vitezaMedie);
	}
	
	public Masina() {
		
	}

	@Override
	public  String nume() {
		return "masina ";
	}
	@Override
	public  String motorizare() {
		return "benzina";
	}

}