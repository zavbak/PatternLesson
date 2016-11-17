package ru.anit.patternlesson.lessons.lesson1;

import ru.anit.patternlesson.aplication.App;
import ru.anit.patternlesson.lessons.Lesson;

/**
 * Created by 79900 on 17.11.2016.
 */

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        Lesson.printLn("display .. Model duck");
    }
}
