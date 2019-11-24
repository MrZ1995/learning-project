package com.learning.maven.class_and_object;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Message msg,int tempAge){
        name=msg.getInfo();
        age=tempAge;
    }

    public void tell() {
        System.out.println("姓名：" + this.name + "年龄：" + this.age);
    }
    public Message getMessage(){
        return new Message("姓名："+name+"、年龄:"+age);
    }

}