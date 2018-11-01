
package com.wzd.collection.demo;
/**
 * 
* @ClassName: Book  
* @Description: 书本类
* @author wangzedong  
* @date 2018年11月2日上午7:24:11  
*
 */
public class Book {
	private int id;//编号
	private String name;//书名

	public Book() {
		super();
	}

	public Book(int id, String name) {
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

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Book) {
			if (this.getId() == ((Book) obj).getId()) {
				return true;
			}
		}
		return false;
	}
}
