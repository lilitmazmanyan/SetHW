package com.objects;

import java.util.Comparator;

public class Student {
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

    Comparator<Student> comp = new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            return s1.fullName.length() - s2.fullName.length();
        }
    };

}
