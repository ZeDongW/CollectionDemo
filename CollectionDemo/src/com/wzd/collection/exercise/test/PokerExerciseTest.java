/**  
* @Title: PokerExerciseTest.java  
* @Package com.wzd.collection.exercise.test  
* @Description: TODO(用一句话描述该文件做什么)  
* @author wangzedong  
* @date 2018年10月31日上午8:02:14  
* @version V1.0  
*/
package com.wzd.collection.exercise.test;

import java.util.LinkedList;

import org.junit.Test;

import com.wzd.collection.exercise.PokerExercise;

/**
 * @ClassName: PokerExerciseTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author wangzedong
 * @date 2018年10月31日上午8:02:14
 * 
 */
public class PokerExerciseTest {

    /**
     * 
     * @Title: PokerExerciseTest @Description: 扑克牌练习方法测试类 @param 参数 @return void
     * 返回类型 @throws
     */
    @Test
    public void PokerExerciseTest() {
        // 创建扑克牌联系对象
        PokerExercise pe = new PokerExercise();

        // 扑克牌初始化方法创建一副扑克牌
        LinkedList pokers = pe.initPokers();
        
        System.out.println("洗牌前扑克牌顺序-------------------");
        
        // 打印扑克牌初始顺序
        pe.printPokers(pokers);

        // 洗牌(打乱扑克牌顺序)
        pe.shufflePokers(pokers);

        System.out.println("洗牌后扑克牌顺序-------------------");
        
        // 打印扑克牌洗牌后的顺序
        pe.printPokers(pokers);
    }
}
