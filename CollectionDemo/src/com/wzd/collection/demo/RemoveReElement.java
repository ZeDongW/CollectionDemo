package com.wzd.collection.demo;

import java.util.ArrayList;
import java.util.ListIterator;

public class RemoveReElement {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book(110,"java1"));
		list.add(new Book(220,"java2"));
		list.add(new Book(330,"java3"));
		list.add(new Book(110,"java4"));
		ArrayList<Book> list2 = new ArrayList<Book>();
		ListIterator<Book> it = list.listIterator();
		while (it.hasNext()) {
			Book book = (Book) it.next();
			if(list2.contains(book)) {
				continue;
			}
			list2.add(book);
		}
		System.out.println(list2);
	}

}
