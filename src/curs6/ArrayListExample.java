package curs6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		//List<E> --> generic type
		
		list.add("Oana");
		list.add("Ion");
		list.add("Maria");
		list.add("Gabi");
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		
		System.out.println("...........................");
		for(String nume : list) {
			System.out.println(nume);
		}
		
		System.out.println("...........................");
		list.add(0, "ozzy");
		//0 aici reprezinta pozitia in care vreau sa il introduc pe "ozzy" in lista
		System.out.println(list.size());
		
		for(String nume : list) {
			System.out.println(nume);
			
		}
		System.out.println("...........................");
		
		list.remove(0);
		list.remove("Maria");
		
		for(String nume : list) {
			System.out.println(nume);
		}
		System.out.println("...........................");
		

	}

}
