package ru.anit.patternlesson.lessons.lesson1;

import ru.anit.patternlesson.aplication.App;
import ru.anit.patternlesson.lessons.Lesson;

/**
 * Created by 79900 on 17.11.2016.
 */

public class Lesson1 extends Lesson {

    void run(Duck duck){
        duck.display();
        duck.performFly();
        duck.performQuack();
    }


    @Override
    public void execute() {
        Lesson.printLn("Lesson 1");
        Lesson.printLn("...");

        run(new MallardDuck());
        Lesson.printLn("...");

        Duck moDuck = new ModelDuck();
        run(moDuck);
        Lesson.printLn("...");

        moDuck.setFlyBehavior(new FlyWithRoket());
        run(moDuck);


    }
}
