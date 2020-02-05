package com.package1;

/**
 * The SetHW program implements an application that
 * implements Set interface and add,remove, getSize, contains methods
 *
 * @author Lilit Mazmanyan
 * @version 1.0
 * @compamny EPAM
 * @Position Student for now
 * @since 04.01.2020
 */

public class Main {
    public static void main(String[] args) {
        //New Creation instance to have an access to its methods,
        //Because access of non-static methods from static field is forbidden
        Creation c = new Creation();
        c.CoffeeTesting();
        System.out.println("------------------------Break-here------------------------\n");
        c.StudentTesting();
        System.out.println("------------------------Break-here------------------------\n");
        c.GlassesTesting();

    }

}
