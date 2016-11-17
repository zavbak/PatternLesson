package ru.anit.patternlesson.lessons;

import ru.anit.patternlesson.aplication.App;

/**
 * Created by 79900 on 17.11.2016.
 */

public abstract class Lesson {
    public static void printLn(String text){
        App.getInstanse().getPresenter().printLn(text);
    }

    public abstract void execute();


}
