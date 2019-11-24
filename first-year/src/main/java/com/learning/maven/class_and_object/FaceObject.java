package com.learning.maven.class_and_object;

 class Message {
    private String info;
    public Message (String tempInfo){
    info = tempInfo;
}
public String getInfo(){
    return info;
}
public void setInfo(String info){
        this.info=info;
}
}
class Person{
    private String name;
    private int age;
    public Person(Message msg,int tempAge){
        name=msg.getInfo();
        age=tempAge;
    }
    public Message getMessage(){
        return new Message("姓名："+name+"、年龄:"+age);
    }
    public void tell(){
        System.out.println("姓名："+name+"、年龄:"+age);
    }
}
public class FaceObject{
 public static void main(String args[]) {
     Person per = new Person(new Message("魔乐科技"), 12);
     per.tell();
     Message msg = per.getMessage();
     System.out.println((msg.getInfo()));

 }
}