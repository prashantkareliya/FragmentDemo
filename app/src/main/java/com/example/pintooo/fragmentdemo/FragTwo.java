package com.example.pintooo.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragTwo extends Fragment {

    View view;
    String data="";

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {


        if (view==null){
            view=inflater.inflate(R.layout.frag_two, null);

            if (getArguments()!=null){

                data=getArguments().getString("DATA");

                getJson(data);

            }

        }
        return view;
    }

    private void getJson(String data) {

        String JSON_URL = data;





    }
}
