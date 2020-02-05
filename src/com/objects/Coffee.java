package com.objects;

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
        return this.coffeeType.compareTo(o.coffeeType);
    }

    @Override
    public String toString() {
        return "Type of coffee is: " +
                this.coffeeType + "; Sugar added: " +
                this.getSugar() + " spoons\n";
    }

}


