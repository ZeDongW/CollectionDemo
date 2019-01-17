/**  
* @Title: Books.java  
* @Package com.wzd.collection.exercise  
* @Description: BooksPojo
* @author Administrator  
* @date 2019年1月16日上午7:32:36  
* @version V1.0  
*/
package com.wzd.collection.exercise;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: Books
 * @Description: BooksPojo
 * @author Administrator
 * @date 2019年1月16日上午7:32:36
 * 
 */
public class Books {
    private String bookName;
    private Date publishDate;

    public Books() {
        super();
    }

    public Books(String bookName, Date publishDate) {
        super();
        this.bookName = bookName;
        this.publishDate = publishDate;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "Books [bookName=" + bookName + ", publishDate=" + sdf.format(publishDate)
                + "]";
    }

}
