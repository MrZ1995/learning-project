package com.learning.maven.string_class;

public class StringDemo10 {
    public static void main(String args[]){
        String strA = new String("mldn").intern();
        String strB = "mldn";
        System.out.println(strA==strB);
    }
}
