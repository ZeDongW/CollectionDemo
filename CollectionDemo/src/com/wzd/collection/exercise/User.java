
/**  
 * @Title: User.java
 * @Package com.wzd.collection.exercise
 * @Description: 用户类
 * @author wangzedong
 * @date 2018年10月5日下午1:52:19
 * @version V1.0  
 */

package com.wzd.collection.exercise;

/**
 * @ClassName: User
 * @Description: 用户类
 * @author wangzedong
 * @date 2018年10月5日下午1:52:19
 */

public class User {
	private int id; // id
	private String password; // 密码

	/**
	 * 创建一个新的实例 User.
	 *
	 */

	public User() {
		super();
	}

	/**
	 * 创建一个新的实例 User.
	 *
	 * @param age
	 * @param password
	 */

	public User(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	/**
	 * @return id
	 */

	public int getId() {
		return id;
	}

	/**
	 * @return password
	 */

	public String getPassword() {
		return password;
	}

	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param paramtheparamthe{bare_field_name} to set
	 */

	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * (非 Javadoc)
	 * 
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	/*
	 * (非 Javadoc)
	 * 
	 * 
	 * @param obj
	 * 
	 * @return
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	
	    /* (非 Javadoc)
	    * 
	    * 
	    * @return
	    * @see java.lang.Object#toString()
	    */
	    
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + "]";
	}
}
