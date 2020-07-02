package com.example.pintooo.fragmentdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragOne extends Fragment {

    View view;
    TextView textView1;

    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {


        if (view==null){
            view=inflater.inflate(R.layout.frag_one,null);

            textView1=view.findViewById(R.id.tv1);


            textView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    FragTwo fragTwo=new FragTwo();
                    Bundle bundle=new Bundle();
                    bundle.putString("DATA",textView1.getText().toString());
                    fragTwo.setArguments(bundle);
                    getFragmentManager().beginTransaction().replace(R.id.frame,fragTwo).addToBackStack(null).commit();

                }
            });

        }


        return view;
    }
}
