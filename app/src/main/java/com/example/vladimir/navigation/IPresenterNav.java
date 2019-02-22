package com.example.vladimir.navigation;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.SingleStateStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;

@StateStrategyType(value = SingleStateStrategy.class)
public interface IPresenterNav extends MvpView {
    void eventList();
    void notice();
    void calendar();
    void participation();
    void myProfile();
    void myEventList();
    void logOut();
}
