/**  
* @Title: TreeMapBooksExercise.java  
* @Package com.wzd.collection.exercise  
* @Description: 练习题 
* @author ZeDongW  
* @date 2019年1月16日上午7:47:53  
* @version V1.0  
*/
package com.wzd.collection.exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TreeMap;


/**
 * @ClassName: TreeMapBooksExercise
 * @Description: 练习题
 * @author ZeDongW
 * @date 2019年1月16日上午7:47:53
 * 
 */
public class TreeMapBooksExercise {

    // 定义操作符静态常量
    private static final String ADD_BOOK = "A"; // 添加书本
    private static final String SHOW_BOOKS = "S"; // 展示书本
    private static final String DELETE_BOOK = "D"; // 删除书本
    private static final String EXIT = "E"; // 退出功能菜单
    private static final String Yes = "Y"; // 是
    private static final String No = "N"; // 否

    public static void main(String[] args) {

        BooksComparator comp = new BooksComparator(); // 创建自定义比较器对象
        TreeMap<Books, Date> map = new TreeMap<Books, Date>(comp); // 创建一个TreeMap用于存储书，并传入自定义比较器
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        Books book = new Books();
        while (true) {
            System.out.println("***********************************************************");
            System.out.println("**********Please select the corresponding function*********");
            System.out.println("**A:Add book information***********************************");
            System.out.println("**S:Show all the book information**************************");
            System.out.println("**D:Delete the corresponding book information**************");
            System.out.println("**E:Exit function******************************************");
            System.out.println("***********************************************************");
            String operate = sc.next().toUpperCase(); // 获取用户选择的操作符，并统一转换为大写
            if (ADD_BOOK.equals(operate)) { // 进入添加书本功能
                System.out.println("You have selected the add books function...");
                addBook(map, sc, sdf, book);
            } else if (SHOW_BOOKS.equals(operate)) { // 进入展示书本功能
                System.out.println("You have selected the display book function...");
                showBooks(map);
            } else if (DELETE_BOOK.equals(operate)) { // 进入删除书本功能
                System.out.println("You have selected the delete book function...");
                deleteBook(map, sc, sdf, book);
            } else if (EXIT.equals(operate)) { // 退出功能菜单
                System.out.println("Exit menu successful!!!");
                System.exit(0);// 退出
            } else {
                System.out.println("Your choice is wrong, please choose again...");
            }
        }
    }

    /**
     * @Title: deleteBook 
     * @Description: 删除书本功能
     * @param @param books 
     * @param @param sc 参数
     * @return void 返回类型 
     * @throws
     */
    private static void deleteBook(TreeMap<Books, Date> map, Scanner sc, SimpleDateFormat sdf, Books book) {
        book = enterBook(sc, sdf);
        if(!map.containsKey(book)) {
            System.out.println("The book information you entered does not exist and cannot be deleted");
            return;
        }
        if(map.remove(book,book.getPublishDate())) {
            System.out.println("successfully delete");
        } else {
            System.out.println("fail to delete");
        }
        showBooks(map);
        return;
    }

    /**
     * @Title: showBooks 
     * @Description: 按顺序展示所有书本
     * @param @param books 
     * @param @param sc 参数 
     * @return void 返回类型 
     * @throws
     */
    private static void showBooks(TreeMap<Books, Date> map) {
        System.out.println(map);
    }

    /**
     * @Title: addBook 
     * @Description: 添加书本
     * @param 参数
     * @return void 返回类型
     * @throws
     */
    private static void addBook(TreeMap<Books, Date> map, Scanner sc, SimpleDateFormat sdf, Books book) {
        book = enterBook(sc, sdf);
        if(map.containsKey(book)) {
            while (true) {
                System.out.println("The book information already exists, does it cover the original information? Y or N");
                String choose = sc.next().toUpperCase();
                if(Yes.equals(choose)) {
                    System.out.println("Saving the book");
                    map.put(book, book.getPublishDate());
                    System.out.println("Add book success");
                    showBooks(map);
                    return;
                } else if (No.equals(choose)) {
                    System.out.println("Give up adding the book");
                    return;
                } else {
                    System.out.println("Your choice is wrong, please choose again...");
                }
            }
           
        }
        map.put(book, book.getPublishDate());
        System.out.println("Add book success");
        showBooks(map);
        return;
    }
    
    /**  
     * @Title: enterBook  
     * @Description: 根据用户输入信息，创建一本书对象 
     * @param @param sc
     * @param @param book
     * @param @param sdf    参数  
     * @return void    返回类型  
     * @throws  
     */  
     private static Books enterBook(Scanner sc, SimpleDateFormat sdf) {
         Books book = new Books();
         System.out.println("Please enter the bookName:");
         String bookName = sc.next();
         book.setBookName(bookName);
         while (true) {
             System.out.println("Please enter the publication date of the book:(In the form of XXXX-XX-XX)");
             String next = sc.next();
             Date publishDate;
             try {
                 publishDate = sdf.parse(next);
                 book.setPublishDate(publishDate);
                 break;
             } catch (ParseException e) {
                 System.out.println("The date you entered is not in the correct format. Please enter it again...");
             }
         }
         return book;
     }
}
