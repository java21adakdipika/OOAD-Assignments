package com.aurionpro.test;

import com.aurionpro.model.CustomLinkedList;

public class CLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomLinkedList list = new CustomLinkedList();
		list.add(4);
		list.add(7);
		list.add(29);
		list.add(13);
		
		list.remove(7);
		list.display();
		
//		for (int i: list) {
//			System.out.println(i);
//		}
	}

}
