/**  
* @Title: TreeMapDemo.java  
* @Package com.wzd.collection.demo.map  
* @Description: TreeMap示例
* @author Administrator  
* @date 2019年1月16日上午6:55:48  
* @version V1.0  
*/    
package com.wzd.collection.demo.map;

import java.util.TreeMap;

/**  
* @ClassName: TreeMapDemo  
* @Description: TreeMap示例
* @author Administrator  
* @date 2019年1月16日上午6:55:48  
*    
*/
public class TreeMapDemo {
    public static void main(String[] args) {
        MyComparator myComparator = new MyComparator();
        TreeMap<Employee, Integer> map = new TreeMap<Employee, Integer>(myComparator);
        /*
         * map.put("c", 1); map.put("a", 2); map.put("d", 3); map.put("b", 4);
         * map.put("f", 5);
         */
        map.put(new Employee("张三", 4000.00), 001);
        map.put(new Employee("李四", 5000.00), 002);
        map.put(new Employee("王五", 6000.00), 003);
        map.put(new Employee("赵六", 7000.00), 004);
        map.put(new Employee("王二", 7000.00), 005);
        
        
        System.out.println("Map:" + map);
    }
}
