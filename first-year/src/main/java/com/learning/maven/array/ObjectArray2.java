package com.learning.maven.array;

class Person {
    private String name ;
    private int age ;
    public Person(String name,int age) {
        this.name = name ;
        this.age = age ;
    }
    public String getInfo() {
        return "姓名：" + this.name
                + "、年龄：" + this.age ;
    }

}
    public class ObjectArray2 {
        public static void main(String args[]) {
            Person per[] = new Person[3];    //
            per[0] = new Person("张三", 20);    //
            per[1] = new Person("李四", 18);    //
            per[2] = new Person("王五", 19);    //
            for (int x = 0; x < per.length; x++) {// 循环输出
                System.out.println(per[x].getInfo());
            }
        }
    }


