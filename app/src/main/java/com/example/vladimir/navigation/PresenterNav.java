package com.example.vladimir.navigation;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class PresenterNav extends MvpPresenter<IPresenterNav> {

    public void eventList() {
        getViewState().eventList();
    }
    public void notice(){
        getViewState().notice();
    }
    public void calendar(){
        getViewState().calendar();
    }
    public void participation(){
        getViewState().participation();
    }
    public void myProfile(){
        getViewState().myProfile();
    }
    public void myEventList(){
        getViewState().myEventList();
    }
    public void logOut(){
        getViewState().logOut();
    }

}
