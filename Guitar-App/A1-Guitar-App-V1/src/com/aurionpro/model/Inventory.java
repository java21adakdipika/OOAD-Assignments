package com.aurionpro.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
	
	private List<Guitar> guitarsList;

	public Inventory() {
		super();
		this.guitarsList = new LinkedList<>();
	}
	
	public void addGuitar(String serialNum, double price, String builder, String model, String guitarType, String backWood, String topWood) {
		guitarsList.add(new Guitar(serialNum, price, builder, model, guitarType, backWood, topWood));
	}
	
	public Guitar getGuitar(String num) {
		for (Guitar x: guitarsList) {
			if (x.getSerialNum() == num) {
				return x;
			}
		}
		return null;
	}
	
	public Guitar searchGuitar(Guitar y) {
		for (Guitar x: guitarsList) {
			if (x.getBuilder()==y.getBuilder() && 
					x.getModel()==y.getModel() && 
					x.getGuitarType()==y.getGuitarType() &&
					x.getBackWood()==y.getBackWood() &&
					x.getTopWood()==y.getTopWood()) {
				return x;
			}
		}
		return null;
	}
}
