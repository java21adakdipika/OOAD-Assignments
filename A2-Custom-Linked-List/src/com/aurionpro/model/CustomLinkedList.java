package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CustomLinkedList {
	
	private List<Integer> customList;
	
	public CustomLinkedList() {
		this.customList = new LinkedList<>();
	}

	public void add(int i) {
		customList.add(i);
	}
	
	public void remove(Integer i) {
		customList.remove(i);
	}

	public void display() {
		customList.stream().forEach(System.out::println);
	}

	@Override
	public String toString() {
		return "CustomLinkedList [customList=" + customList + "]";
	}
	
	
}
