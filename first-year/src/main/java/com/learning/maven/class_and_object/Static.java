package com.learning.maven.class_and_object;
class Book {
    private String title;
    private static int count = 0;
    public Book(String title){
        this.title = title;
        count++;
        System.out.println("第"+count+"本图书创建出来。");
    }
}
public class Static {
    public static void  main(String args[]){
        new Book("Java开发实战经典");
        new Book("Spring实战开发");
        new Book("Spring微结构实战开发");

    }

}
