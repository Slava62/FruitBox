package ru.javafortesters.fruitbox.services;

import ru.javafortesters.fruitbox.model.Box;
import ru.javafortesters.fruitbox.model.Fruit;

import java.util.Optional;

public interface IOperator {
    Box<Fruit> takeNewBox(float maxWeight);
    boolean    putFruit(Box<Fruit> box, Fruit fruit);
    boolean    compareWeight(Box<Fruit> firstBox, Box<Fruit> secondBox);
    boolean    intersperse(Box<Fruit> firstBox,Box<Fruit> secondBox);
    Optional<Fruit>      takeFruit(Box<Fruit> box);
}
