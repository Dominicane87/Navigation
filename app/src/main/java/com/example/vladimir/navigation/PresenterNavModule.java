package com.example.vladimir.navigation;

import android.content.Context;
import android.support.annotation.NonNull;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterNavModule {

    @Provides
    @NonNull
    @Singleton
    public PresenterNav providePresentNav() {
        return new PresenterNav();
    }
}
