package ru.anit.patternlesson;

import ru.anit.patternlesson.lessons.Lesson;

/**
 * Created by 79900 on 17.11.2016.
 */

public interface IPresenter {

    void setLesson(Lesson lesson);
    void printLn(String text);
    void setView(IView mView);

}
