package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.Customer;
import com.aurionpro.model.LineItem;
import com.aurionpro.model.Order;
import com.aurionpro.model.Product;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product maggi = new Product(1, "Maggi", 60, 10);
		Product pasta = new Product(2, "Pasta", 80, 10);
		Product chips = new Product(3, "Chips", 20, 10);
		Product milk = new Product(4, "Milk", 45, 10);
		Product bread = new Product(5, "Bread", 25, 10);
		
		List<LineItem> itemList1 = Arrays.asList(
				new LineItem(01, 3, maggi),
				new LineItem(02, 4, chips),
				new LineItem(03, 2, milk),
				new LineItem(04, 2, bread)); 
		
		List<LineItem> itemList2 = Arrays.asList(
				new LineItem(01, 4, pasta), 
				new LineItem(02, 1, chips)); 
		
		Order ord1 = new Order(11, "2023-01-01", itemList1);
		Order ord2 = new Order(12, "2023-02-01", itemList2);
		
		Customer cust1 = new Customer(101, "Dipika", Arrays.asList(ord1, ord2));
		
//		System.out.println(cust1);
		
		System.out.println("Shopping Cart: ");
		
		for (Order ord : cust1.getOrders()) {
			System.out.println(ord);
			System.out.println("Total price of order: " + ord.calculateOrderPrice());
		}

//		System.out.println(cust1.calculateTotalPrice());

	}

}
