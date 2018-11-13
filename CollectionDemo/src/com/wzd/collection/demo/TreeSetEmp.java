/**  
* @Title: TreeSetEmp.java  
* @Package com.wzd.collection.demo  
* @Description: 自定义元素TreeSet排序  
* @author wangzedong  
* @date 2018年11月13日上午7:16:00  
* @version V1.0  
*/    
package com.wzd.collection.demo;

import java.util.TreeSet;

/**  
* @ClassName: TreeSetEmp  
* @Description: 自定义元素TreeSet排序 
* @author wangzedong  
* @date 2018年11月13日上午7:16:00  
*    
*/
public class TreeSetEmp {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Emp(110, "小张", 5000));
        treeSet.add(new Emp(130, "小王", 8000));
        treeSet.add(new Emp(120, "小刘", 13000));
        treeSet.add(new Emp(140, "小明", 6000));
        System.out.println(treeSet);
    }
}
