package com.learning.maven.code_block;
class Person{
    public Person(){
       System.out.println("【构造方法】Person类方法构造执行");
}

    {
            System.out.println("【静态块)静态块执行");
            }
    {
                System.out.println("【构造块)Person构造块执行");
    }
            }
public class JavaDemo {
    public static void main(String args[]){
        new Person();
        new Person();
    }


}
