package com.javabase.day001;

public class Demo04 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2,32,4,5,6};
        for (int i = array1.length-1; i >-1 ; i--) {
            int a = array1[i];
            System.out.println (array1[i]);
//            System.out.println ("6");
        }
//        for (int i = 0; i < array1.length; i++) {
//            System.out.println (array1[i]);
//        }
        for (int each:array1){
            System.out.println (each);
        }
        System.out.println ("min nubmer");
        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if(min>array1[i]){
                min = array1[i];

                }


            }

        }
//        System.out.println (min);
//
//        for (int i = 0; i < array1.length; i++) {
//                int mins = array1[0];
//            for (int j = 0; j < i; j++) {
//
//                if(array1[j]<mins){
//               ok     array1[j]=min;
//                }
//
//            }
//        }

}
