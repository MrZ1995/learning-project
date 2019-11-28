package com.learning.maven.class_and_object;

class Chinese{
    private String name;
    private int age;
    static String country  = "中国人民共和国";
    public Chinese(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getInfo(){
        return "姓名:"+this.name+"、年龄:"+this.age+"、国家:"+this.country;
    }
}
public class StaticKeyword {
    public static void main(String args[]){
        Chinese perA = new Chinese("张三",10);
        Chinese perB = new Chinese("李四",10);
        Chinese perC = new Chinese("王五",11);
        perA.country = "伟大的中国";
        System.out.println(perA.getInfo());
        System.out.println(perB.getInfo());
        System.out.println(perC.getInfo());



    }
}

