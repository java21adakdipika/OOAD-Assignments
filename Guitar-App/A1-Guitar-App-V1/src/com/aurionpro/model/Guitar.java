package com.aurionpro.model;

public class Guitar {
	
	private String serialNum;
	private double price;
	private String builder;
	private String model;
	private String guitarType;
	private String backWood;
	private String topWood;
	
	public Guitar(String serialNum, double price, String builder, String model, String guitarType, String backWood,
			String topWood) {
		super();
		this.serialNum = serialNum;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.guitarType = guitarType;
		this.backWood = backWood;
		this.topWood = topWood;
	}
	
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getGuitarType() {
		return guitarType;
	}
	public void setGuitarType(String guitarType) {
		this.guitarType = guitarType;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}

	@Override
	public String toString() {
		return "Guitar [serialNum=" + serialNum + ", price=" + price + ", builder=" + builder + ", model=" + model
				+ ", guitarType=" + guitarType + ", backWood=" + backWood + ", topWood=" + topWood + "]";
	}
	
	
}
