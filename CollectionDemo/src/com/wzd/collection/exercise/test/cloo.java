
    /**  
     * @Title: cloo.java
     * @Package com.wzd.collection.exercise.test
     * @Description: TODO(用一句话描述该文件做什么)
     * @author wangzedong
     * @date 2018年10月5日下午3:02:38
     * @version V1.0  
     */
    
package com.wzd.collection.exercise.test;

import java.util.ArrayList;

/**
     * @ClassName: cloo
     * @Description: TODO(这里用一句话描述这个类的作用)
     * @author wangzedong
     * @date 2018年10月5日下午3:02:38
     */

public class cloo {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		Object[] array = list.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
	}
}
