package ru.javafortesters.fruitbox.model;

public class Apple extends Fruit{
    public static final float APPLE_WEIGHT=1f;
    public static final String TITTLE="Apple";

    @Override
    public float getWeight() {
        return APPLE_WEIGHT;
    }

    @Override
    public String getTittle() {
        return TITTLE;
    }
}
