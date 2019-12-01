package com.learning.maven.code_block;
class Message{
    public static String getCountry(){
        return "www.mldn.cn";
    }
}
class Person {
    private static String country;

    static {
        country = Message.getCountry();
        System.out.println(country);
    }

}

public class JavaDemo4 {
    public static void main(String args[]) {
        new Person();
    }

    }


