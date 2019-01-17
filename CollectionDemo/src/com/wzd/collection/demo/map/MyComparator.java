/**  
* @Title: Comparator.java  
* @Package com.wzd.collection.demo.map  
* @Description: 自定义Employee类的比较器 
* @author Administrator  
* @date 2019年1月16日上午7:16:29  
* @version V1.0  
*/    
package com.wzd.collection.demo.map;

import java.util.Comparator;

/**  
* @ClassName: Comparator  
* @Description: 自定义Employee类的比较器
* @author Administrator  
* @date 2019年1月16日上午7:16:29  
*    
*/
public class MyComparator implements Comparator<Employee>{

    /**
    * <p>Title: compare</p>  
    * <p>Description: </p>  
    * @param o1
    * @param o2
    * @return  
    * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)  
    */  
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary()-o2.getSalary());
    }


}
