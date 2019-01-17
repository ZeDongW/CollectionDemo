/**  
* @Title: Emp.java  
* @Package com.wzd.collection.demo  
* @Description: 员工类  
* @author wangzedong  
* @date 2018年11月13日上午7:10:46  
* @version V1.0  
*/
package com.wzd.collection.demo;

/**
 * @ClassName: Emp
 * @Description: 员工类
 * @author wangzedong
 * @date 2018年11月13日上午7:10:46
 * 
 */
public class Emp implements Comparable<Emp>{
    private int id;
    private String name;
    private int salary;

    public Emp() {
        super();
    }

    public Emp(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

    /**
    * <p>Title: compareTo</p>  
    * <p>Description: </p>  
    * @param o
    * @return  
    * @see java.lang.Comparable#compareTo(java.lang.Object)  
    */  
    public int compareTo(Emp o) {
        return this.salary-o.salary;
    }

}
