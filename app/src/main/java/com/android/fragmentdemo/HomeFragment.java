package com.android.fragmentdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HomeFragment extends Fragment {
    Button button;




    public HomeFragment() {
//Required empty public construtor

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //get the fragment view using the inflater
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_home, container, false);
        //find view by ids of the button view in the fragment
        button = view.findViewById(R.id.btn_fragment1);
        //create an event listener for the button object
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //use the instance of the FragmentManager to replace the home fragment with the second fragment
                MainActivity.fragmentManager.beginTransaction().replace(R.id.frame_layout,new SecondFragment2(),
                        null).addToBackStack(null).commit();

            }
        });
        return  view;
    }
}