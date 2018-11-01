package com.wzd.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 
* @ClassName: RemoveDemo  
* @Description: 使用iterator和 listIterator操作集合元素
* @author wangzedong  
* @date 2018年11月2日上午7:26:41  
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
