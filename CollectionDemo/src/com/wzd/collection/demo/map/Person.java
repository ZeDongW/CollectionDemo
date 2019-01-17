/**  
* @Title: Person.java  
* @Package com.wzd.collection.demo.map  
* @Description: PersonPojo
* @author Administrator  
* @date 2019年1月16日上午6:37:20  
* @version V1.0  
*/
package com.wzd.collection.demo.map;

/**
 * @ClassName: Person
 * @Description: PersonPojo
 * @author Administrator
 * @date 2019年1月16日上午6:37:20
 * 
 */
public class Person {
    private int id;
    private String name;

    public Person() {
        super();
    }

    public Person(int id, String name) {
        super();
        this.id = id;
        this.name = name;
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
    
    /**
    * <p>Title: toString</p>  
    * <p>Description: </p>  
    * @return  
    * @see java.lang.Object#toString()  
    */  
    @Override
    public String toString() {
        return "[" + this.id + ":" + this.name + "]";
    }
    
    /**
    * <p>Title: hashCode</p>  
    * <p>Description: </p>  
    * @return  
    * @see java.lang.Object#hashCode()  
    */  
    @Override
    public int hashCode() {
        return this.id;
    }
    
    /**
    * <p>Title: equals</p>  
    * <p>Description: </p>  
    * @param obj
    * @return  
    * @see java.lang.Object#equals(java.lang.Object)  
    */  
    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return this.id == p.id;
    }
}
