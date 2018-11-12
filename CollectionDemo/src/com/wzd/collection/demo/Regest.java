/**  
* @Title: Regest.java  
* @Package com.wzd.collection.demo  
* @Description: 用户注册 
* @author wangzedong  
* @date 2018年11月13日上午6:37:40  
* @version V1.0  
*/    
package com.wzd.collection.demo;

import java.util.HashSet;
import java.util.Scanner;

/**  
* @ClassName: Regest  
* @Description: 用户注册
* @author wangzedong  
* @date 2018年11月13日上午6:37:40  
*    
*/
public class Regest {

    public static void main(String[] args) {
        HashSet<User> set = new HashSet<User>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入用户名：");
            String username = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();
            User user = new User(username, password);
            if(set.add(user)) {
                System.out.println("注册成功！");
                System.out.println("当前用户有：" + set);
            } else {
                System.out.println("注册失败...");
            }
        }
    }

}
