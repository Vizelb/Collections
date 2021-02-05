package com.vizelb.trainingdatastructuresandalgorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonArrayList = (Button) findViewById(R.id.button_array_list);
        buttonArrayList.setOnClickListener(this::onClickArrayList);
//        buttonArrayList.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent;
//                intent = new Intent(MainActivity.this, DataStructures.class);
//                startActivity(intent);
//            }
//        });
    }

    public void onClickArrayList(View view) {
//        Button buttonArrayList = (Button) findViewById(R.id.button_array_list);
        Intent intent;
        intent = new Intent(MainActivity.this, DataStructures.class);
        startActivity(intent);
    }

//    @Override
//    public void onClick(View v) {
////        Intent intent;
////        intent = new Intent(MainActivity.this, DataStructures.class);
////        startActivity(intent);
//    }




}