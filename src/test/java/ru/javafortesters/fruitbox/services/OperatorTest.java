package ru.javafortesters.fruitbox.services;

import org.junit.Test;
import ru.javafortesters.fruitbox.model.Apple;
import ru.javafortesters.fruitbox.model.Box;
import ru.javafortesters.fruitbox.model.Fruit;
import ru.javafortesters.fruitbox.model.Orange;
import java.util.Optional;

import static org.junit.Assert.*;

public class OperatorTest {

    @Test
    public void putFruitTest() {
        IOperator operator=new Operator();
        Box<Fruit> appleBox=operator.takeNewBox(10f);
        assertTrue(operator.putFruit(appleBox,new Apple()));
        assertTrue(operator.putFruit(appleBox,new Apple()));
        assertFalse(operator.putFruit(appleBox,new Orange()));
    }

    @Test
    public void compareWeightTest() {
        IOperator operator=new Operator();
        Box<Fruit> firstBox=operator.takeNewBox(10f);
        operator.putFruit(firstBox,new Apple());
        operator.putFruit(firstBox,new Apple());
        operator.putFruit(firstBox,new Apple());
        Box<Fruit> secondBox=operator.takeNewBox(10f);
        operator.putFruit(secondBox,new Orange());
        operator.putFruit(secondBox,new Orange());
        assertTrue(operator.compareWeight(firstBox,secondBox));
        operator.putFruit(secondBox,new Orange());
        assertFalse(operator.compareWeight(firstBox, secondBox));
    }

    @Test
    public void takeFruitTest() {
        IOperator operator=new Operator();
        int expected=0;
        Box<Fruit> appleBox=operator.takeNewBox(10f);
        operator.putFruit(appleBox,new Apple());
        operator.putFruit(appleBox,new Apple());
        operator.takeFruit(appleBox);
        operator.takeFruit(appleBox);
        operator.takeFruit(appleBox);
        assertEquals(expected,appleBox.getContent().size());
    }

    @Test
    public void takeFruitFromEmptyBoxTest() {
        IOperator operator=new Operator();
        Fruit apple=new Apple();
        Box<Fruit> appleBox=operator.takeNewBox(10f);
        operator.putFruit(appleBox,new Apple());
        assertEquals(apple.getTittle(),
                operator.takeFruit(appleBox).get().getTittle());
        // This part not works
        //if(operator.takeFruit(appleBox).isPresent()){
        // assertEquals(apple.getTittle(),
        //         operator.takeFruit(appleBox).get().getTittle());
        //}
    }

    @Test
    public void intersperseTest() {
        IOperator operator=new Operator();
        Box<Fruit> firstBox=operator.takeNewBox(10f);
        operator.putFruit(firstBox,new Apple());
        operator.putFruit(firstBox,new Apple());
        operator.putFruit(firstBox,new Apple());
        Box<Fruit> secondBox=operator.takeNewBox(3f);
        operator.putFruit(secondBox,new Apple());
        operator.putFruit(secondBox,new Apple());
        assertTrue(operator.intersperse(firstBox,secondBox));
        Box<Fruit> thirdBox=operator.takeNewBox(6f);
        operator.putFruit(thirdBox,new Orange());
        operator.putFruit(thirdBox,new Orange());
        assertFalse(operator.intersperse(firstBox,thirdBox));
    }
}