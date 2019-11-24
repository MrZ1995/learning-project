package com.learning.maven.basic_concepts_2.array_case_analysis;

public class ArraySorting {
    public static void sort(int data[]) {
        for (int x = 0; x < data.length; x++) {
            for (int y = 0; y < data.length - x - 1; y++) {
                if (data[y] > data[y + 1]) {
                    int temp = data[y];
                    data[y] = data[y + 1];
                    data[y + 1] = temp;
                }
            }

        }
    }

    public static void printArray(int temp[]) {
        for (int x = 0; x < temp.length; x++) {
            System.out.print(temp[x] + "、");
        }
        System.out.println();
    }


public static void main(String args[]) {
    int data[] = new int[]{8, 9, 0, 2, 3, 5, 10, 7, 6, 1};
    ArraySorting.sort(data);
    ArraySorting.printArray(data);
}
}