package com.javabase.day001;

import java.util.Scanner;

public class inputArrayDemo01 {
    static int[] id =new int[5];
    String name[]=new String[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inputArrayDemo01 id1 =new inputArrayDemo01 ();
        int j = 0;
        for (int i = 0; i < id.length; i++) {
            System.out.println("input");
            j = i;
            id[i]= scanner.nextInt();

        }
        for (int i = 0; i < id.length; i++) {
            System.out.println (id[i]);

            String all = Integer.toString (id[i]);
            System.out.println ("end");

        }

    }

}
