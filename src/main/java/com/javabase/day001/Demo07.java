package com.javabase.day001;

import java.util.Arrays;

//遍历二位数组，
public class Demo07 {
    public static void main(String[] args) {
       /* int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}} ;
        for (int[] each: arr2) {
            for (int each1: each) {
                System.out.println (each1);
            }
            System.out.println (each);

        }
        int[][] arr3= new int[arr2.length][arr2[0].length];
        for (int i = 0; i < arr2.length; i++) {
            System.arraycopy (arr2[i],0,arr3[i],0,arr2[i].length);
        }
        for (int[] each: arr3) {
            for (int each1: each) {
                System.out.println (each1);
            }
//            System.out.println (each);

        }*/
        int[] arr4 = new int[]{1,2,3,4,5};
        int[] arr5 = new int[]{6,7,8,9,10};
        int[] arr6 = new int[arr4.length+arr5.length];
        System.arraycopy (arr4,0,arr6,0,arr4.length);
        System.arraycopy (arr5,0,arr6,5,arr5.length);
        for (int arr:
            arr6 ) {
            System.out.println (arr);

        }
        for (int each:
             arr4) {
            System.out.println (each);
        }

        int[] arr7 = Arrays.copyOfRange (arr6,0,30);//如果产出 则直接扩容
        for (int each1:
             arr7) {
            System.out.println (each1);
        }
        String exchangeArr7 = Arrays.toString (arr7);//转换成String类型
        System.out.println (exchangeArr7);
        int[] arr8 = {2,12,3,4,1};
        System.out.println (Arrays.toString (arr8));
        Arrays.sort (arr8);
        System.out.println (Arrays.toString (arr8));
        System.out.println (String.valueOf (Arrays.equals (arr6,arr7)));

        int[] arr9=new int[10];
        Arrays.fill (arr9,99);
        Arrays.fill (arr7,99);
        double[] arr11 =new double[10];
        System.out.println (Arrays.toString (arr7));


    }

}

