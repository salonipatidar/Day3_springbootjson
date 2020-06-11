package com.example.demo;

public class Student
{
    int rollno;
    int age;
    String name;
    String city;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(int rollno, int age, String name, String city) {
        this.rollno = rollno;
        this.age = age;
        this.name = name;
        this.city = city;
    }
}
