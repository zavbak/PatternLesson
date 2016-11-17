package ru.anit.patternlesson;

import ru.anit.patternlesson.lessons.ILesson;

/**
 * Created by 79900 on 17.11.2016.
 */

public class PresenterMainActivity implements IPresenter {

    IView mView;
    ILesson mLesson;



    public PresenterMainActivity(IView view) {
        this.mView = view;
        mView.show("Ready..");
    }


    public void setLesson(ILesson mLesson) {
        this.mLesson = mLesson;
        mView.show(mLesson.execute());
    }
}
