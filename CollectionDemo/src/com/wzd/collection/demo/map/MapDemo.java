/**  
* @Title: MapDemo.java  
* @Package com.wzd.collection.demo.map  
* @Description: Map特有方法
* @author Administrator  
* @date 2019年1月12日上午6:51:51  
* @version V1.0  
*/    
package com.wzd.collection.demo.map;

import java.util.HashMap;
import java.util.Map;

/**  
* @ClassName: MapDemo  
* @Description: Map特有方法 
* @author Administrator  
* @date 2019年1月12日上午6:51:51  
*    
*/
public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String,String>();
        map.put("三国演义","罗贯中");
        map.put("西游记","吴承恩");
        map.put("水浒传","施耐庵");
        map.put("红楼梦","曹雪芹");
        
        System.out.println("集合元素：" + map);
    }
}
