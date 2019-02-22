package com.example.vladimir.navigation;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = PresenterNavModule.class)
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
