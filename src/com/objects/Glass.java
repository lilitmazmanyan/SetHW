package com.objects;

public class Glass implements Comparable<Glass> {
    String name;
    int thicknessInMM;

    public Glass(String name, int thicknessinMM) {
        this.name = name;
        this.thicknessInMM = thicknessinMM;
    }

    @Override
    public int compareTo(Glass glasses) {
        return this.thicknessInMM - glasses.thicknessInMM;
    }

    @Override
    public String toString() {
        return name + ", thickness is: " + thicknessInMM;
    }

}
