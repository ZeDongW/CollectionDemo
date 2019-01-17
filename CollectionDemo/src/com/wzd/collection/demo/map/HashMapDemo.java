/**  
* @Title: HashMapDemo.java  
* @Package com.wzd.collection.demo.map  
* @Description: HashMap示例 
* @author Administrator  
* @date 2019年1月16日上午6:36:42  
* @version V1.0  
*/    
package com.wzd.collection.demo.map;

import java.util.HashMap;

import sun.applet.Main;

/**  
* @ClassName: HashMapDemo  
* @Description: HashMap示例
* @author Administrator  
* @date 2019年1月16日上午6:36:42  
*    
*/
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<Person,String>();
        map.put(new Person(110,"张三"), "001");
        map.put(new Person(220,"李四"), "002");
        map.put(new Person(330,"王五"), "003");
        map.put(new Person(110,"赵六"), "004"); //如果出现相同的键，之后的值会取代之前的值
        
        System.out.println("Map:" + map);
    }
}
