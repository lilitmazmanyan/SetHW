package com.objects;

public class Student implements Comparable<Student> {
    String fullName;
    int age;

    public Student(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Full Name='" + fullName + "," +
                "; age=" + age + "\n";
    }

    @Override
    public int compareTo(Student student) {
        return this.age - student.age;
    }

}
