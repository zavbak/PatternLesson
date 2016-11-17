package ru.anit.patternlesson;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/**
 * Created by 79900 on 17.11.2016.
 */

public class ViewModel {

    String txActivity;
    IView  mView;

    public void animAlpha(){

        if(mView != null){
            mView.animAlpha();
        }

    }


    public void setTxActivity(String txActivity) {
        this.txActivity = txActivity;
        show();
    }

    public String getTxActivity() {
        return txActivity;
    }

    public void setView(IView mView) {
        this.mView = mView;
        show();

    }

    void show() {
        if (mView != null) {
            mView.show(txActivity);
        }
    }



}


