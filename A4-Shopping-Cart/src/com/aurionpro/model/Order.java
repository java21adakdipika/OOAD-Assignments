package com.aurionpro.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
	
	private int id;
	private LocalDate date;
	private List<LineItem> items;
	public Order(int id, String date, List<LineItem> items) {
		super();
		this.id = id;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		this.date = LocalDate.parse(date, formatter);
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public List<LineItem> getItems() {
		return items;
	}
	
	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	
	public double calculateOrderPrice() {
		double orderprice = items.stream().collect(Collectors.summingDouble(LineItem::calculateLineItemCost));
		return orderprice;
	}
	
	@Override
	public String toString() {
		return "\nOrder [id=" + id + ", date=" + date + ", items=" + items + "]";
	}

}
