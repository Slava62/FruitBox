package ru.javafortesters.fruitbox.model;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private float maxWeight;
    private List<T> content;

    public Box(float maxWeight) {
        this.maxWeight = maxWeight;
        content=new ArrayList<T>();
    }

    public float getWeight(){
        float totalWeight=0;
        for (T fruit: content) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public List<T> getContent(){return content;}
    public float getMaxWeight(){return maxWeight;}
}
