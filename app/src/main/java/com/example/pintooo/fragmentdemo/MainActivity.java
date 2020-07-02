package com.example.pintooo.fragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);

        loadFrag(new FragOne());


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFrag(new FragOne());

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFrag(new FragTwo());


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFrag(new FragThree());
            }
        });

    }
//https://stackoverflow.com/questions/5159982/how-do-i-add-a-fragment-to-an-activity-with-a-programmatically-created-content-v
    private void loadFrag(android.support.v4.app.Fragment frag) {

        android.support.v4.app.FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,frag);
        transaction.commit();

    }

}
