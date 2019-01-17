/**  
* @Title: MapIteration.java  
* @Package com.wzd.collection.demo.map  
* @Description: Map的迭代方法 
* @author Administrator  
* @date 2019年1月14日上午6:45:26  
* @version V1.0  
*/
package com.wzd.collection.demo.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @ClassName: MapIteration
 * @Description: Map的迭代方法
 * @author Administrator
 * @date 2019年1月14日上午6:45:26
 * 
 */
public class MapIteration {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("abc", "123");
        map.put("def", "456");
        map.put("ghi", "789");
        
        //使用KeySet()获取值
        /*
         * Set<String> keys = map.keySet(); for (String key : keys) {
         * System.out.println(key + ":" + map.get(key)); }
         * 
         * Iterator<String> it = keys.iterator(); while (it.hasNext()) { String
         * key = it.next(); System.out.println("键：" + key + " 值:" +
         * map.get(key)); }
         */
        
        //使用values获取值
        /*
         * Collection<String> values = map.values(); Iterator<String> it =
         * values.iterator(); while (it.hasNext()) { System.out.println("值:" +
         * it.next()); }
         */
        
        //使用EntrySet()
        Set<Entry<String,String>> entrySet = map.entrySet();
        Iterator<Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Entry<String, String> entry = it.next();
            System.out.println(entry.toString());
        }
    }
}
