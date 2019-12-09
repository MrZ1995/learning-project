package com.learning.maven.string_class;
class Dept{}
public class StringDemo2 {
    public static void main(String args[]){
        Dept deptA = new Dept();
        Dept deptB = new Dept();
        Dept deptC = deptB;
        System.out.println(deptA==deptB);
        System.out.println(deptA==deptC);
        System.out.println(deptC==deptB);
    }
}
