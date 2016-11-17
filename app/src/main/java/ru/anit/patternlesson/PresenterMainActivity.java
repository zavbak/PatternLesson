package ru.anit.patternlesson;

import ru.anit.patternlesson.lessons.Lesson;

/**
 * Created by 79900 on 17.11.2016.
 */

public class PresenterMainActivity implements IPresenter {

    IView     mView;
    Lesson mLesson;
    ViewModel viewModel;

    public PresenterMainActivity() {
        viewModel = new ViewModel();
    }

    @Override
    public void setLesson(Lesson mLesson) {
        viewModel.setTxActivity(null);
        this.mLesson = mLesson;
        mLesson.execute();
    }


    @Override
    public void printLn(String text) {
        if(viewModel.getTxActivity() == null){
            viewModel.setTxActivity(text);
        }else{
            viewModel.setTxActivity(viewModel.getTxActivity()+ " \n"+ text);
        }
    }

    @Override
    public void setView(IView mView) {
        this.mView = mView;
        viewModel.setView(mView);
    }


}
