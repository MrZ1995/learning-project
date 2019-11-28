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
        Person per[] = new Person[] {
                new Person("张三", 20), new Person("李四", 18),
                new Person("王五", 19) }; 	// 对象数组静态初始化
        for (int x = 0; x < per.length; x++) {	// 循环输出
            System.out.println(per[x].getInfo());
        }
    }
}



