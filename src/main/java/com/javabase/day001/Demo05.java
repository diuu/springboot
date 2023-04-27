package com.javabase.day001;

public class Demo05 {
    public static void main(String[] args) {
        int[] arr = {12, 21, 4, 5, 2, 231, 42};
        int[] arr1 = {12, 21, 4, 5, 2, 231, 42};


        //选择排序算法
        for (int j = 0; j < arr1.length; j++) {
            for (int i = j + 1; i < arr.length; i++) {
                if (arr1[i] < arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }

            }
            System.out.println (arr1[j]);

        }
//        for (int i = 0; i < arr1.length-1; i++) {
//            System.out.println (arr1[i]);
//        }


        //冒泡排序算法 从后往前
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - j - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp1 = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp1;
                }
            }
            System.out.println (arr[j]);
        }

        for (int each : arr) {
            System.out.println (each);

        }


    }
}