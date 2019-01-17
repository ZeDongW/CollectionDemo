/**  
* @Title: BooksComparator.java  
* @Package com.wzd.collection.exercise  
* @Description: 自定义Books类比较器
* @author Administrator  
* @date 2019年1月16日上午7:36:17  
* @version V1.0  
*/    
package com.wzd.collection.exercise;

import java.util.Comparator;

/**  
* @ClassName: BooksComparator  
* @Description: 自定义Books类比较器
* @author Administrator  
* @date 2019年1月16日上午7:36:17  
*    
*/
public class BooksComparator implements Comparator<Books>{

    /**
    * <p>Title: compare</p>  
    * <p>Description: </p>  
    * @param o1
    * @param o2
    * @return  
    * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)  
    */  
    public int compare(Books o1, Books o2) {
        return o1.getPublishDate().compareTo(o2.getPublishDate());
    }


}
