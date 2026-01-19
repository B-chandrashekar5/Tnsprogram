package com.tnsif.Demo.Day12;

import java.util.LinkedList;

public class LinkedListCollectionDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(101);
		ll.add(102);
		ll.add(103);
		ll.addFirst(105);
		ll.addFirst("ChanduTNS");
		ll.addLast("last");
		System.out.println(ll);
		ll.remove(1);
		System.out.println(ll);
		
	}

}