/**  
* @Title: MyComparatorDemo.java  
* @Package com.wzd.collection.demo  
* @Description: 自定义比较器 
* @author wangzedong  
* @date 2018年11月14日上午6:54:55  
* @version V1.0  
*/    
package com.wzd.collection.demo;

import java.util.TreeSet;

/**  
* @ClassName: MyComparatorDemo  
* @Description: 自定义比较器 
* @author wangzedong  
* @date 2018年11月14日上午6:54:55  
*    
*/
public class MyComparatorDemo {
    /**  
    * @Title: main  
    * @Description: TODO(这里用一句话描述这个方法的作用)  
    * @param @param args    参数  
    * @return void    返回类型  
    * @throws  
    */  
    public static void main(String[] args) {
        MyComparator comparator = new MyComparator();
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.add(new Emp2(110, "小张", 5000));
        treeSet.add(new Emp2(130, "小王", 8000));
        treeSet.add(new Emp2(120, "小刘", 13000));
        treeSet.add(new Emp2(140, "小明", 6000));
        System.out.println(treeSet);
    }
}
