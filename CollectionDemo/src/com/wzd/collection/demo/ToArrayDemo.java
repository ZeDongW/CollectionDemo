package com.wzd.collection.demo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Collection toArray()
 * ����ת�����������
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
