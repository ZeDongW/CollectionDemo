/**  
* @Title: User.java  
* @Package com.wzd.collection.demo  
* @Description: 用户类 
* @author wangzedong  
* @date 2018年11月13日上午6:32:06  
* @version V1.0  
*/
package com.wzd.collection.demo;

/**
 * @ClassName: User
 * @Description: 用户类
 * @author wangzedong
 * @date 2018年11月13日上午6:32:06
 * 
 */
public class User {
    private String username;// 用户名
    private String password;// 密码

    public User() {
        super();
    }

    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" + this.username + "," + this.password + "}";
    }

    @Override
    public int hashCode() {
        return username.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (username == null) {
            return false;
        } else if (!username.equals(other.username))
            return false;
        return true;
    }
}
