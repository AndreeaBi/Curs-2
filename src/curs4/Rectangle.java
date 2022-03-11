package curs4;

public class Rectangle {
	
	//variabile
	//private --> inseamna ca sunt disponibile doar in interiorul clasei in care se afla
	private int length;
	private int width;
	
	//constructorul default (fara parametri) pe care daca nu il scriem, il scrie Java. este intodeauna identic cu numele clasei
	public Rectangle() {}
	//constructor cu parametri
	public Rectangle(int num1, int num2) {
		setLength(num1); //method call
		setWidth(num2); 
	}
	
	//getter --> metode specifice care returneaza valoarea unei variabile private
	public int getLength() {
		return length;
	}
	
	//setter --> metode specifice care seteaza valoarea unei variabile private
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	//metoda java accessmodifier (public) returnType(void) numeMeetoda(aici se afla parametrii metodei)
	//void --> inseamna ca nu returneaza nimic.
	//metoda asta va fi chemata numeObj.calculeazaAria(); --> type este obiect
	public void calculeazaAria() {
		
		//System.out.println("Aria este: ");
	
	}
	
	//metoda java
	//return int
	//metoda asta va fi chemata numeObj.calculeazaPerimetru(); --> type este int
	//la executie numeObj.calculeazaPerimetru() = (2*length + 2*width) = 8;
	public int calculeazaPerimetru() {
		
		return (2 * 2) + (2 * 2);
	
	
		
	}
	
	

}
