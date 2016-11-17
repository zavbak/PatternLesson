package ru.anit.patternlesson.aplication;

import android.app.Application;

import ru.anit.patternlesson.IPresenter;
import ru.anit.patternlesson.PresenterMainActivity;

/**
 * Created by 79900 on 17.11.2016.
 */

public class App extends Application {

    IPresenter presenter;

    private static App sInstance;

    public static synchronized App getInstanse() {
        return sInstance;
    }

    public IPresenter getPresenter() {
        return presenter;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        presenter = new PresenterMainActivity();
    }

    
}
