package ru.javafortesters.fruitbox.services;


import ru.javafortesters.fruitbox.model.Box;
import ru.javafortesters.fruitbox.model.Fruit;

import java.util.Iterator;
import java.util.Optional;

public class Operator implements IOperator {
    public static float  INACCURACY=0.001f;

    @Override
    public Box<Fruit> takeNewBox(float maxWeight) {
        return new Box<>(maxWeight);
    }

    @Override
    public boolean putFruit(Box<Fruit> box, Fruit fruit) {
        if (fruit.getWeight()<box.getMaxWeight()){
        if (box.getContent().isEmpty()){
            box.getContent().add(fruit);
            return true;
        }
        if(box.getWeight()<box.getMaxWeight())
        {
            if(box.getContent().get(0).getTittle().equals(fruit.getTittle())){
            box.getContent().add(fruit);
            return true;}}}
        return false;
    }

    @Override
    public boolean compareWeight(Box<Fruit> firstBox, Box<Fruit> secondBox) {
        if(Math.abs((firstBox.getWeight()-secondBox.getWeight()))<INACCURACY){return true;}
        return false;
    }

    @Override
    public boolean intersperse(Box<Fruit> firstBox, Box<Fruit> secondBox) {
        boolean intersperseResult=false;
        Iterator<Fruit> fruitIterator=firstBox.getContent().iterator();
        while (fruitIterator.hasNext()){
            Fruit fruit=fruitIterator.next();
            if(putFruit(secondBox,fruit)){
                fruitIterator.remove();
                intersperseResult=true;
                }
            }
        return intersperseResult;
    }

    @Override
    public Optional<Fruit> takeFruit(Box<Fruit> box) {
        Optional<Fruit> fruit =null;
        if(!box.getContent().isEmpty()){
            fruit = Optional.of(box.getContent().get(box.getContent().size()-1));
            box.getContent().remove(box.getContent().size()-1);
    }
    return fruit;
    }
}
