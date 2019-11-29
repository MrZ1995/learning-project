package com.learning.maven.class_and_object;

public class Directstatic {
    public static void main(String args[]){
        System.out.println("直接访问static属性：“+Chinese.country");
        Chinese.country="伟大的中国";
        Chinese per = new Chinese("张三",10);
        System.out.println(per.getInfo());

    }
}
