package ru.anit.patternlesson.lessons.lesson1;

import ru.anit.patternlesson.IPresenter;

/**
 * Created by 79900 on 17.11.2016.
 */

public abstract class Duck {

    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    void performQuack(){
        quackBehavior.quack();
    }

    void performFly(){
        flyBehavior.fly();
    }

    abstract void display();
}
