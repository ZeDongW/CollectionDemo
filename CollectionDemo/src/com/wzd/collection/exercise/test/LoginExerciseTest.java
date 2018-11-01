
    /**  
     * @Title: LoginExerciseTest.java
     * @Package com.wzd.collection.exercise.test
     * @Description: 集合注册登录练习测试类
     * @author wangzedong
     * @date 2018年10月5日下午2:13:28
     * @version V1.0  
     */
    
package com.wzd.collection.exercise.test;

import org.junit.Test;

import com.wzd.collection.exercise.LoginExercise;

/**
     * @ClassName: LoginExerciseTest
     * @Description: 集合注册登录练习测试类
     * @author wangzedong
     * @date 2018年10月5日下午2:13:28
     */

public class LoginExerciseTest {
	
	@Test
	public void LoginAndRegist() {
		LoginExercise le = new LoginExercise();
		le.LoginAndRegister();
	}
}
