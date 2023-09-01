package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // 생성자가 없는데 어떻게 부를 수 있을까? -> 생성자가 없을때 자바가 알아서 만들어줌
        Student s1 = new Student("22000747","천주현");
        System.out.println(s1);
        System.out.println(s1.toString());
    }
}