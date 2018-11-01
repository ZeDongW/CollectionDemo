package com.wzd.collection.demo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Collection toArray()
 * 集合转数组遍历集合
 * @author Administrator
 *
 */
public class ToArrayDemo {
	public static void main(String[] args) {
		String[] a = new String[7];
		ArrayList<String> list = new ArrayList<String>();
		list.add("sd");
		list.add("asd");
		list.add("segfdd");
		list.toArray(a);
		System.out.println(Arrays.toString(a));
	}
}
