/**  
* @Title: Emp2.java  
* @Package com.wzd.collection.demo  
* @Description: 员工类  
* @author wangzedong  
* @date 2018年11月13日上午7:10:46  
* @version V1.0  
*/
package com.wzd.collection.demo;

/**
 * @ClassName: Emp2
 * @Description: 员工类
 * @author wangzedong
 * @date 2018年11月13日上午7:10:46
 * 
 */
public class Emp2 {
    private int id;
    private String name;
    private int salary;

    public Emp2() {
        super();
    }

    public Emp2(int id, String name, int salary) {
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
        return "Emp2 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }

}
