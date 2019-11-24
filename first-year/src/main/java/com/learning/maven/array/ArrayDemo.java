package com.learning.maven.array;

class ArrayUtil {
    public static void reverse(int data[]) {
        int center = data.length / 2 ; // 确定转换的次数
        int head = 0 ;	// 【前索引】操作脚标
        int tail = data.length - 1 ; // 【后索引】操作脚标
        for (int x = 0 ; x < center ; x ++) {// 循环转置
            int temp = data [head] ;// 数据交换
            data [head] = data [tail] ;// 数据交换
            data [tail] = temp ;// 数据交换
            head ++ ;// 前索引自增
            tail -- ;// 后索引自减
        }
    }
    public static void printArray(int temp[]) {	// 数组输出
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + "、");
        }
        System.out.println();
    }
}
public class ArrayDemo {
    public static void main(String args[]) {
        int data[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };// 排序原始数组
        ArrayUtil.reverse(data) ;// 转置处理
        ArrayUtil.printArray(data);// 数组输出
    }
}
