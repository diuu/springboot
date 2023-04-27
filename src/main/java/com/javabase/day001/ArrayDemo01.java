package com.javabase.day001;

import java.util.Arrays;

public class ArrayDemo01 {



    private int [] id;
    private String []name;
    private int [] age;
    int j=0;
    static int[] id1 = new int[]{10,20,30};
    String[] name1 = {"张三","李四","王五"};
    int[] age1 = new int[]{18,19,20};

    public int[] getId() {
        return id;
    }

    public void setId(int[] id) {
        this.id = id;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public int[] getAge() {
        return age;
    }

    public void setAge(int[] age) {
        this.age = age;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public static int[] getId1() {
        return id1;
    }

    public static void setId1(int[] id1) {
        ArrayDemo01.id1 = id1;
    }

    public String[] getName1() {
        return name1;
    }

    public void setName1(String[] name1) {
        this.name1 = name1;
    }

    public int[] getAge1() {
        return age1;
    }

    public void setAge1(int[] age1) {
        this.age1 = age1;
    }



    public static void main(String[] args) {
        int sum = 0;
        for (int j = 1; j <= 3; j++) {
            System.out.println(id1[j - 1]);
        }
        for (int i = 0; i < id1.length; i++) {
            System.out.println(id1[i]);

            sum = sum + id1[i];
        }
        System.out.println(sum);


    }


}
