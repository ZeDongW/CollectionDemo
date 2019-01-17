/**  
* @Title: Employee.java  
* @Package com.wzd.collection.demo.map  
* @Description: EmployeePojo
* @author Administrator  
* @date 2019年1月16日上午7:01:36  
* @version V1.0  
*/
package com.wzd.collection.demo.map;

/**
 * @ClassName: Employee
 * @Description: EmployeePojo
 * @author Administrator
 * @date 2019年1月16日上午7:01:36
 * 
 */
public class Employee { //implements Comparable<Employee>{
    private String name;
    private Double salary;

    public Employee() {
        super();
    }

    public Employee(String name, Double salary) {
        super();
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((salary == null) ? 0 : salary.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (salary == null) {
            if (other.salary != null)
                return false;
        } else if (!salary.equals(other.salary))
            return false;
        return true;
    }

    /**
    * <p>Title: compareTo</p>  
    * <p>Description: </p>  
    * @param o
    * @return  
    * @see java.lang.Comparable#compareTo(java.lang.Object)  
    */  
    /*
    @Override
    public int compareTo(Employee o) {
        return (int) (this.salary-o.salary);
    }
    */

}
