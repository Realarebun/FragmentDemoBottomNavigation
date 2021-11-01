package com.android.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    //get reference to the fragment container _  frame layout
    FrameLayout frameLayout;
    //get the reference to the fragment manager
    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the id for the fragment manager
        frameLayout = findViewById(R.id.frame_layout);
        //create an instance for the fragment manager using the get supportFragmentManager() method
        fragmentManager = getSupportFragmentManager();
        //set the default fragment for the activity usingthe object of the frsgment manager
        //check if saved instanceStatwe has value
        if (savedInstanceState !=null){
            return;
        }
        fragmentManager.beginTransaction().add(R.id.frame_layout,new HomeFragment(),null).commit();
    }
}