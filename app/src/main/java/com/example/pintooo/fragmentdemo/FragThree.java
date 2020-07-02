package com.example.pintooo.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragThree extends Fragment {

    View view;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {



        if(view==null){
            view=inflater.inflate(R.layout.frag_three, null);

        }

        return view;
    }
}
