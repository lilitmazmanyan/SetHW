package com.package1;

import com.objects.Coffee;
import com.objects.CoffeeTypes;
import com.objects.Student;

public class Main {
    public static void main(String[] args) {
        CoffeeTesting();
        System.out.println("------------------------Break-here------------------------\n");
        StudentTesting();
        System.out.println("------------------------Break-here------------------------\n");

    }

    public static void CoffeeTesting() {
        Coffee forMe = new Coffee(CoffeeTypes.LATTE);
            forMe.setSugar(2);
        Coffee forYou = new Coffee(CoffeeTypes.AMERICANO);
            forYou.setSugar(3);
        Coffee forHer = new Coffee(CoffeeTypes.CAPPUCCINO);
            forHer.setSugar(1);
        Coffee forHim = new Coffee(CoffeeTypes.FRAPPE);
        Coffee forUs = new Coffee(CoffeeTypes.MOCHA);

        MySet<Coffee> coffeeSet = new MySet<>();
        coffeeSet.add(forMe);
        coffeeSet.add(forYou);
        coffeeSet.add(forHer);
        coffeeSet.add(forHim);
        coffeeSet.add(forUs);

        coffeeSet.print(coffeeSet);
    }

    static void StudentTesting() {
        Student s1 = new Student("Paruyr Sevak", 12);
        Student s2 = new Student("Hovhannes Tumanyan", 21);
        Student s3 = new Student("Vahan Teryan", 30);
        Student s4 = new Student("Hamo Sahyan", 1);
        Student s5 = new Student("Avetik Isayakyan", 5);
        Student s6 = new Student("Eghishe Charenc", 17);
        Student s7 = new Student("Derenik Demirchyan", 17);

        MySet<Student> writersSet = new MySet<>();

        writersSet.add(s1);
        writersSet.add(s2);
        writersSet.add(s3);
        writersSet.add(s4);
        writersSet.add(s5);
        writersSet.add(s6);
        writersSet.add(s7);

        writersSet.print(writersSet);

    }

}
