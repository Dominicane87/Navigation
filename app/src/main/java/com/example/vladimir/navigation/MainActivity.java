package com.example.vladimir.navigation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

import javax.inject.Inject;

public class MainActivity extends MvpAppCompatActivity
        implements IPresenterNav, NavigationView.OnNavigationItemSelectedListener {

    @InjectPresenter
    @Inject
    PresenterNav presenterNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getComponent().inject(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        drawer.openDrawer(GravityCompat.START);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem  item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.eventList) {
            presenterNav.eventList();
        } else if (id == R.id.myProfile) {
            presenterNav.myProfile();
        } else if (id == R.id.notice) {
            presenterNav.notice();
        } else if (id == R.id.calendar) {
            presenterNav.calendar();
        } else if (id == R.id.participation) {
            presenterNav.participation();
        } else if (id == R.id.myEventList) {
            presenterNav.myEventList();
        } else if (id == R.id.logOut) {
            presenterNav.logOut();
        }
        return true;
    }

    @Override
    public void eventList() {
        Toast.makeText(this, "Go to Event list", Toast.LENGTH_SHORT).show();
        DrawerLayout drawer =  findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public void notice() {
        Toast.makeText(this, "Go to Notice(by Drawer)", Toast.LENGTH_SHORT).show();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public void calendar() {
        Toast.makeText(this, "Go to calendar", Toast.LENGTH_SHORT).show();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public void participation() {
        Toast.makeText(this, "Go to participation", Toast.LENGTH_SHORT).show();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public void myProfile() {
        Toast.makeText(this, "Go to My Profile", Toast.LENGTH_SHORT).show();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public void myEventList() {
        Toast.makeText(this, "Go to My event list", Toast.LENGTH_SHORT).show();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    @Override
    public void logOut() {
        Toast.makeText(this, "Go to Logout", Toast.LENGTH_SHORT).show();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }
}
