package ru.anit.patternlesson.lessons.lesson1;

import ru.anit.patternlesson.aplication.App;
import ru.anit.patternlesson.lessons.Lesson;

/**
 * Created by 79900 on 17.11.2016.
 */

public class FlyWithWings implements IFlyBehavior{
    @Override
    public void fly() {
        Lesson.printLn("fly with wings");
    }
}
