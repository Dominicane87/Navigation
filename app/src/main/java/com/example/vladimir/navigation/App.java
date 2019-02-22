package com.example.vladimir.navigation;

import android.app.Application;

public class App extends Application {
    private static AppComponent component;

    public static AppComponent getComponent(){
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        component=buildComponent();
    }

    protected AppComponent buildComponent(){
        return DaggerAppComponent.builder()
                .presenterNavModule(new PresenterNavModule())
                .build();
    }

    public void clearAppComponent(){
        component = null;
    }
}
