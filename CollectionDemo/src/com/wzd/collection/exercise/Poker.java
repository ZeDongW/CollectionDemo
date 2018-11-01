/**  
* @Title: Poker.java  
* @Package com.wzd.collection.exercise  
* @Description: 扑克牌类 
* @author wangzedong  
* @date 2018年10月31日上午7:40:51  
* @version V1.0  
*/
package com.wzd.collection.exercise;

/**
 * 
* @ClassName: Poker  
* @Description: 扑克牌类  
* @author wangzedong  
* @date 2018年10月31日上午7:40:51  
*
 */
public class Poker {
    private String colors;// 扑克牌花色
    private String numbers;// 扑克牌点数

    public Poker() {
        super();
    }

    public Poker(String colors, String numbers) {
        super();
        this.colors = colors;
        this.numbers = numbers;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getNumbers() {
        return numbers;
    }

    public void setNumbers(String numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "[" + colors + numbers + "]";
    }
}
