/**  
* @Title: MyComparator.java  
* @Package com.wzd.collection.demo  
* @Description: 自定义比较器  
* @author wangzedong  
* @date 2018年11月14日上午6:49:40  
* @version V1.0  
*/    
package com.wzd.collection.demo;

import java.util.Comparator;

/**  
* @ClassName: MyComparator  
* @Description: 自定义比较器  
* @author wangzedong  
* @date 2018年11月14日上午6:49:40  
*    
*/
public class MyComparator implements Comparator<Emp2>{

    /**
    * <p>Title: compare</p>  
    * <p>Description: </p>  
    * @param o1
    * @param o2
    * @return  
    * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)  
    */  
    @Override
    public int compare(Emp2 o1, Emp2 o2) {
        return o1.getId() - o2.getId();
    }

}
