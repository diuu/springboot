package com.javabase.day001;

import java.util.Scanner;

public class Student {


    private String name;
    private int id;
    private int score;
    private String []student;


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("请输入学生姓名：");
        String name = scanner.next();
        student.setName(name);

//        System.out.print("请输入学生学号：");
//        int id = scanner.nextInt();
//        student.setId(id);
//
        System.out.print("请输入学生成绩：");
        int score = scanner.nextInt();
        student.setScore(score);

        System.out.println("学生信息已输入：");
        System.out.println("姓名：" + student.getName());
        System.out.println("学号：" + student.getId());
        System.out.println("成绩：" + student.getScore());
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + score +
                '}';
    }

}
