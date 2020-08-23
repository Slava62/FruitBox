package ru.javafortesters.fruitbox.model;

public class Orange extends Fruit {
    public static final float ORANGE_WEIGHT=1.5f;
    public static final String TITTLE="Orange";

    @Override
    public float getWeight() {
        return ORANGE_WEIGHT;
    }

    @Override
    public String getTittle() {
        return TITTLE;
    }
}
