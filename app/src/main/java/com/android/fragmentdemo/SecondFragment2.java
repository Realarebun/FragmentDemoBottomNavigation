package com.android.fragmentdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


public class SecondFragment2 extends Fragment {



    Button button;
    public SecondFragment2() {


    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //get the fragment view using the inflater
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        // Inflate the layout for this fragment
        //find view by ids of the button view in the fragment
        button = view.findViewById(R.id.btn_fragment2);
        //create an event listener for the button object
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //use the instance of the FragmentManager to replace the home fragment with the second fragment
                MainActivity.fragmentManager.beginTransaction().replace(R.id.fragment_layout,new ThirdFragment(),
                        null).addToBackStack(null).commit();

            }
        });
        return  view;
    }
}