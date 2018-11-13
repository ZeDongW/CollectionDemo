/**  
* @Title: TreeSetDemo.java  
* @Package com.wzd.collection.demo  
* @Description: TreeSet集合   
* @author wangzedong  
* @date 2018年11月13日上午6:59:00  
* @version V1.0  
*/    
package com.wzd.collection.demo;

import java.util.TreeSet;

/**  
* @ClassName: TreeSetDemo  
* @Description: TreeSet集合  
* @author wangzedong  
* @date 2018年11月13日上午6:59:00  
*    
*/
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        /*treeSet.add(1);
        treeSet.add(19);
        treeSet.add(23);
        treeSet.add(5);
        treeSet.add(11);
        treeSet.add(9);
        treeSet.add(13);*/
        treeSet.add('v');
        treeSet.add('a');
        treeSet.add('f');
        treeSet.add('h');
        System.out.println(treeSet);
    }
}
