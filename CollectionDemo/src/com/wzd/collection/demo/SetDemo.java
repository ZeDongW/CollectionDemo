/**  
* @Title: SetDemo.java  
* @Package com.wzd.collection.demo  
* @Description: Set接口，无需，不可重复
* @author wangzedong  
* @date 2018年11月12日上午7:23:36  
* @version V1.0  
*/    
package com.wzd.collection.demo;

import java.util.HashSet;
import java.util.Set;

/**  
* @ClassName: SetDemo  
* @Description: Set接口，无需，不可重复
* @author wangzedong  
* @date 2018年11月12日上午7:23:36  
*    
*/
public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        System.out.println("添加元素成功吗？" + set.add("李四"));
        System.out.println(set);
    }
}
