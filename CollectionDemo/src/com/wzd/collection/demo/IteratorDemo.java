package com.wzd.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
* @ClassName: IteratorDemo  
* @Description: iterator遍历Collection 
* @author wangzedong  
* @date 2018年11月2日上午7:26:26  
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
