package com.wzd.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Collection ForEach()
 * foreach±éÀú¼¯ºÏ
 * @author Administrator
 *
 */
public class ForEachDemo {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sd");
		list.add("asd");
		list.add("segfdd");
		for (String string : list) {
			System.out.println(string);
		}
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
