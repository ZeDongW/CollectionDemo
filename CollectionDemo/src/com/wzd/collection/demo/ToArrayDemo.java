package com.wzd.collection.demo;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
* @ClassName: ToArrayDemo  
* @Description: 将Collection转换为数组  
* @author wangzedong  
* @date 2018年11月2日上午7:28:38  
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
