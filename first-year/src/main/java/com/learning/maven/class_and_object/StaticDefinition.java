package com.learning.maven.class_and_object;
class Chinese{
    private String name;
    private  int age;
    private static String country="中国";
    public Chinese(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void setCountry(String c){
        country=c;
    }
    public String getInfo(){
        return "姓名:"+this.name+"、年龄:"+this.age+"、国家:"+Chinese.country;
    }
}
public class StaticDefinition{
    public static void main(String args[]){
        Chinese.setCountry("中华人民共和国");
        Chinese per= new Chinese("张三",10);
        System.out.println(per.getInfo());
    }
}