package com.aurionpro.test;

import com.aurionpro.model.Guitar;
import com.aurionpro.model.Inventory;

public class GuitarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inventory inventory = new Inventory();
		initializeInventory(inventory);
		
		Guitar whatDipikaLikes = new Guitar("", 0, "fender", "Stratocastor","electric", "Alder", "Alder");
		Guitar guitar = inventory.searchGuitar(whatDipikaLikes);
		
		if (guitar != null) {
			System.out.println("Dear Customer, you might like this: ");
			System.out.println("Guitar Builder: "+ guitar.getBuilder());
			System.out.println("Guitar Model: " + guitar.getModel());
			System.out.println("Guitar Type: " + guitar.getGuitarType());
			System.out.println("Guitar Top-Wood: " + guitar.getTopWood());
			System.out.println("Guitar Back-Wood: " + guitar.getBackWood());
			System.out.println("Hey! You can have this guitar for only Rs. " + guitar.getPrice());
		} else {
			System.out.println("Sorry Dipika! We have nothing for you :(");
		}
	}
	
	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("V95693", 1499.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
		inventory.addGuitar("V95712", 1899.95, "Wingle", "Eurocastor", "electric", "Welmon", "Alder");
	}

}
