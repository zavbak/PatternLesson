package ru.anit.patternlesson.lessons.lesson1;

import ru.anit.patternlesson.aplication.App;
import ru.anit.patternlesson.lessons.Lesson;

/**
 * Created by 79900 on 17.11.2016.
 */

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        Lesson.printLn("display .. duck!!!");
    }
}
