package com.objects;

import java.util.Objects;

public class Coffee implements Comparable<Coffee> {
    Enum coffeeType;
    int sugar;

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public Coffee(Enum<CoffeeTypes> coffeeType) {
        this.coffeeType = coffeeType;
    }

    @Override
    public int compareTo(Coffee o) {
        return this.sugar - o.sugar;
    }

    @Override
    public String toString() {
        return "Type of coffee is: " +
                this.coffeeType + "; Sugar added: " +
                this.getSugar() + " spoons\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return coffeeType.equals(coffee.coffeeType);
    }


    @Override
    public int hashCode() {
        return Objects.hash(coffeeType, sugar);
    }
}


