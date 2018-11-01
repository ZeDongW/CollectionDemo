/**  
* @Title: PokerExerciseTest.java  
* @Package com.wzd.collection.exercise.test  
* @Description: TODO(用一句话描述该文件做什么)  
* @author wangzedong  
* @date 2018年10月31日上午8:02:14  
* @version V1.0  
*/    
package com.wzd.collection.exercise.test;

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

    @Test
    public void PokerExerciseTest() {
        PokerExercise pokers = new PokerExercise();
        System.out.println(pokers.initPokers().size());
    }
}
