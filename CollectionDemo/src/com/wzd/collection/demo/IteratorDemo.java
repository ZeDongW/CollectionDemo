package com.wzd.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Collection iterator()
 * iterator±éÀú¼¯ºÏ
 * @author Administrator
 *
 */
public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sd");
		list.add("asd");
		list.add("segfdd");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
