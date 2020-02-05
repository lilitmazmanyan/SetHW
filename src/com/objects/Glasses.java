package com.objects;

import java.util.Comparator;

public class Glasses {
    int thickness;

    public Glasses(int thickness) {
        this.thickness = thickness;

    }

    Comparator<Glasses> com = new Comparator<Glasses>() {
        @Override
        public int compare(Glasses glasses, Glasses t1) {
            return glasses.thickness - t1.thickness;
        }
    };

}
