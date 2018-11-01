
    /**  
     * @Title: LoginExercise.java
     * @Package com.wzd.collection.exercise
     * @Description: 利用集合实现登陆注册
     * @author wangzedong
     * @date 2018年10月5日下午1:08:24
     * @version V1.0  
     */
    
package com.wzd.collection.exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
     * @ClassName: LoginExercise
     * @Description: 利用集合实现登陆注册
     * @author wangzedong
     * @date 2018年10月5日下午1:08:24
     */

public class LoginExercise {
	
	/**
	 * 
	 * @Title: LoginAndRegister
	 * @Description: 功能菜单
	 * @throws
	 */
	public  void LoginAndRegister() {
		
		//用户集合
		ArrayList<User> users = new ArrayList<User>();getClass();
		
		//接收输入
		Scanner sc = new Scanner(System.in);
		
		//功能菜单
		while(true) {
			System.out.println("请选择功能 R(注册)   L(登陆)  E(退出).......");
			String option = sc.next();
			if("r".equalsIgnoreCase(option)) {  
				System.out.println("你选择了注册功能.....");
				register(sc,users);//注册方法
			} else if ("l".equalsIgnoreCase(option)) {
				System.out.println("你选择了登录功能......");
				login(sc,users);//登陆方法
			} else if ("e".equalsIgnoreCase(option)) {
				System.out.println("退出成功！！！");
				System.exit(0);//退出
			} else {
				System.out.println("您的输入有误，请重新输入.....");
			}
		}
	}

	
	    
	    /**
	     * @param it 
	 * @Title: login
	 * @Description: 登录功能
	 * @param sc
	 * @param user void
	 * @throws
	     */
	    
	private static void login(Scanner sc, ArrayList<User> users) {
		System.out.println("请输入id：");
		int id = sc.nextInt();
		System.out.println("请输入密码：");
		String password = sc.next();
		User user = new User();
		user.setId(id);
		user.setPassword(password);
		if(users.contains(user)) {
			System.out.println("登陆成功！！！");
			return;
		} else {
			System.out.println("登陆失败！！！");
			login(sc, users);
		}
	}


		/**
		 * @param it 
		 * @param it 
	 * @Title: register
	 * @Description: 注册功能
	 * @param sc
	 * @param user void
	 * @throws
	     */
	    
	private static void register(Scanner sc, ArrayList<User> users) {
		System.out.println("请输入注册id(仅限数字)：");
		int id = sc.nextInt();
		
		//迭代器
		Iterator<User> it = users.iterator();
		
		//判断id是否已被注册
		while(it.hasNext()) {
			User user = it.next();
			if(user.getId() == id) {
				System.out.println("对不起，该ID已被注册，请重新输入");
				register(sc, users);
			}
		}
		System.out.println("请输入密码：");
		String password = sc.next();
		//未被注册
		User user = new User();
		user.setId(id);
		user.setPassword(password);
		users.add(user);
		
		System.out.println("已注册用户：" + users);

		
		return;
	}
	
	
}
