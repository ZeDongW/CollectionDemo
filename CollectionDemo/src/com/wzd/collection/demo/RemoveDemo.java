package com.wzd.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * iterator remove()
 * ÒÆ³ýÔªËØ
 * @author Administrator
 *
 */
public class RemoveDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sd");
		list.add("asd");
		list.add("segfdd");
		/*Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(list);*/
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
			listIterator.remove();
		}
		System.out.println(list);
	}

}
