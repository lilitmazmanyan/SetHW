package com.package1;

import com.LinkedList.MyLinkedList;
import com.objects.Coffee;
import com.objects.CoffeeTypes;
import com.objects.Glass;
import com.objects.Student;

class Creation {

    /**
     * Creating some instances of Coffee class to test whether print and add methods work or not
     */

    void CoffeeTesting() {
        Coffee forMe = new Coffee(CoffeeTypes.LATTE);
        forMe.setSugar(3);
        Coffee forYou = new Coffee(CoffeeTypes.AMERICANO);
        forYou.setSugar(1);
        Coffee forHer = new Coffee(CoffeeTypes.CAPPUCCINO);
        forHer.setSugar(2);
        Coffee forHim = new Coffee(CoffeeTypes.FRAPPE);
        forHim.setSugar(5);
        Coffee forUs = new Coffee(CoffeeTypes.MOCHA);

        MyLinkedList<Coffee> coffeeSet = new MyLinkedList<>();

        System.out.println(coffeeSet.getSize());

        coffeeSet.add(forMe);
        coffeeSet.add(forHer);
        coffeeSet.add(forYou);
//        coffeeSet.add(forHim);
//        coffeeSet.add(forUs);
        coffeeSet.print();
        System.out.println(coffeeSet.getSize());

        System.out.println(coffeeSet.remove(forHer));
        coffeeSet.print();

        System.out.println(coffeeSet.getSize());

    }

    //Creating some instances of Student class to check the add and size methods function correct
    void StudentTesting() {
        Student sevak = new Student("Paruyr Sevak", 12);
        Student tumanyan = new Student("Hovhannes Tumanyan", 21);
        Student teryan = new Student("Vahan Teryan", 30);
        Student sahyan = new Student("Hamo Sahyan", 1);
        Student isayakyan = new Student("Avetik Isayakyan", 5);
        Student charenc = new Student("Eghishe Charenc", 17);
        Student demirchyan = new Student("Derenik Demirchyan", 17);

        MyLinkedList<Student> writersSet = new MyLinkedList<>();

        writersSet.add(sevak);
        writersSet.add(tumanyan);
        writersSet.add(teryan);
        writersSet.add(sahyan);
        writersSet.add(isayakyan);
        writersSet.add(charenc);
        writersSet.add(demirchyan);

        System.out.println("Does students set contain a new Student that isn't on thiat list: "
                + writersSet.contains(new Student("Bethoven", 60)));

        System.out.println("Does writers set contain Hovhannes Tumanyan: " + writersSet.contains(tumanyan));

    }

    //Creating some instances of Glass type to see if add, remove and print methods operate correctly
    void GlassesTesting() {
        Glass forWine = new Glass("For Wine", 5);
        Glass forShortSighteds = new Glass("For Short Sighteds", 10);
        Glass forAWindow = new Glass("For Windows", 20);
        Glass forTableTop = new Glass("For Table Top", 22);

        MyLinkedList<Glass> glassesSet = new MyLinkedList<>();
        glassesSet.add(forWine);
        glassesSet.add(forShortSighteds);
        glassesSet.add(forShortSighteds);
        glassesSet.add(forAWindow);
        glassesSet.add(forTableTop);
        glassesSet.add(forTableTop);
        glassesSet.add(forTableTop);

        System.out.println("Printing the size of glasses set " + glassesSet.getSize());
        System.out.println(glassesSet.remove(forAWindow));
        System.out.println("Printing the size after one removal: " + glassesSet.getSize());

    }


}
