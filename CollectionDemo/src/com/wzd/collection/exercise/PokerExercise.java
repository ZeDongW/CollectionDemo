/**  
* @Title: PokerExercise.java  
* @Package com.wzd.collection.exercise  
* @Description: 利用LinkedList实现扑克牌洗牌 
* @author wangzedong  
* @date 2018年10月31日上午7:50:37  
* @version V1.0  
*/
package com.wzd.collection.exercise;

import java.util.LinkedList;

/**
 * @ClassName: PokerExercise
 * @Description: 利用LinkedList实现扑克牌洗牌
 * @author wangzedong
 * @date 2018年10月31日上午7:50:37
 * 
 */
public class PokerExercise {

    /**
     * 
     * @Title: initPokers @Description: 初始化扑克牌 @param @param list @param @return
     * 参数 @return LinkedList 返回类型 @throws
     */
    public LinkedList initPokers() {
        LinkedList<Poker> list = new LinkedList<Poker>();
        String[] colors = { "黑桃", "红桃", "方片", "梅花" };
        String[] numbers = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "J", "Q", "K" };
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                list.add(new Poker(colors[i], numbers[j]));
            }
        }
        return list;
    }
    
    /**
     * 
    * @Title: printPokers  
    * @Description: 打印扑克牌，每10张换行 
    * @param @param pokers    参数  
    * @return void    返回类型  
    * @throws
     */
    public void printPokers(LinkedList<Poker> pokers){
        for (int i = 0; i < pokers.size(); i++) {
            System.out.print(pokers.get(i) + ",");
            if(i%10==9) {
                System.out.println();
            }
        }
    }
}
