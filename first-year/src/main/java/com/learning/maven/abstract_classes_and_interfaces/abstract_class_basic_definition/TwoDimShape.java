package com.learning.maven.abstract_classes_and_interfaces.abstract_class_basic_definition;
abstract class TwoDimShape {
    public abstract double getArea();
}
class Rectangle extends TwoDimShape{
    private double width;
    private double height;
    Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return height*width;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
}
class Circle extends TwoDimShape{
    private double r;
    Circle(double r){
        this.r = r;
    }
    public double getArea() {
        return r*r*3.14;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
}
 class Test1 {
    public static void main(String args[]) {
        Rectangle rec = new Rectangle(8.5,10);
        rec.getArea();
        System.out.println("矩形的面积为:" + rec.getArea());
        Circle cir = new Circle(20);
        cir.getArea();
        System.out.println("圆形的面积为:" + cir.getArea());
    }

}
