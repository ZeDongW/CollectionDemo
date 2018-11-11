/**  
* @Title: VectorDemo.java  
* @Package com.wzd.collection.demo  
* @Description: Vector类及方法
* @author wangzedong  
* @date 2018年11月12日上午7:01:39  
* @version V1.0  
*/    
package com.wzd.collection.demo;

import java.util.Enumeration;
import java.util.Vector;

/**  
* @ClassName: VectorDemo  
* @Description: Vector类及方法
* @author wangzedong  
* @date 2018年11月12日上午7:01:39  
*/
public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("张三");
        v.addElement("李四");
        v.addElement("王五");
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
