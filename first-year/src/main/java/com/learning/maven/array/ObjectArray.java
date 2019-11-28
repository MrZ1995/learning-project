package com.learning.maven.array;

import com.learning.maven.array.Person;



public class ObjectArray {
    public static void main(String args[]) {
        Person per[] = new Person[] {
                new Person("张三", 20), new Person("李四", 18),
                new Person("王五", 19) }; 	// 对象数组静态初始化
        for (int x = 0; x < per.length; x++) {	// 循环输出
            System.out.println(per[x].getInfo());
        }
    }
}



