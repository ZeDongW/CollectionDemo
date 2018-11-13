/**  
* @Title: SortString.java  
* @Package com.wzd.collection.exercise  
* @Description: 对字符串中的数值进行排序  
* @author wangzedong  
* @date 2018年11月14日上午7:05:29  
* @version V1.0  
*/    
package com.wzd.collection.exercise;

import java.util.Iterator;
import java.util.TreeSet;

/**  
* @ClassName: SortString  
* @Description: 对字符串中的数值进行排序 
* @author wangzedong  
* @date 2018年11月14日上午7:05:29  
*    
*/
public class SortString {
    public static void main(String[] args) {
        String str = "8 10 15 5 2 7";
        String[] data = str.split(" ");
        TreeSet tree = new TreeSet();
        for (int i = 0; i < data.length; i++) {
            tree.add(Integer.parseInt(data[i]));
        }
        Iterator it = tree.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
