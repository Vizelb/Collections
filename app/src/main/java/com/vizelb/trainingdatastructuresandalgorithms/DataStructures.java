package com.vizelb.trainingdatastructuresandalgorithms;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

//import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataStructures extends AppCompatActivity {

    Button buttonBack;
    Button buttonCreate, buttonAddValue, buttonRemoveValue, buttonClear;
    EditText editTextCreate, editTextAddValue, editTextRemoveIndex;
    TextView textViewOutput;

    final ArrayList<String> list = new ArrayList<String>();
    final String[] myString = {""};
    final String myStringG = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structures);

        buttonBack = findViewById(R.id.button_back);
        buttonCreate = findViewById(R.id.button_create);
        buttonAddValue = findViewById(R.id.button_add_value);
        buttonRemoveValue = findViewById(R.id.button_remove_value);
        buttonClear = findViewById(R.id.button_clear_values);

        editTextCreate = findViewById(R.id.edit_text_create);
//        final String[] myString = {""};

//        elementData = ()
//        list.add()
        editTextAddValue = findViewById(R.id.edit_text_add_value);
        editTextRemoveIndex = findViewById(R.id.edit_text_index_remove);

        textViewOutput = findViewById(R.id.text_view_output);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        buttonCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //где

                myString[0] = editTextCreate.getText().toString();
                list.add(editTextCreate.getText().toString());
//                for (int i = 0; i < myString.length; i++) {
//                    list.add(myString[i]);
//                     в стринге 1 элемнт под 0 индексом, зачем тогда я это сделал?
//                }
                textViewOutput.setText(myString[0]);
                editTextCreate.setText("");
            }
        });

//        list.size();

        //Добавить обработку пропуска
        buttonAddValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String listToString = ""; //v1.0 - нет обработки пробелов
                list.add(editTextAddValue.getText().toString());
//                listToString = new String(String.valueOf(list.size()));
//                textViewOutput.setText((CharSequence) list); //error hm-hm
                String[] listToStringMassive = new String[list.size()]; //v2.01 - добавляются пробелы с запятыми    а еще можно юзать массив myString
                for (int i = 0; i < list.size(); i++) {
//                    listToString += list.get(i); //v1.0
                    listToStringMassive[i] = list.get(i); //v2.01
                }
//                textViewOutput.setText(listToString); //v1.0        вывести конечный лист со всеми изменениями
//                String[] listToStringMassive = list.toArray(new String[list.size()]); // v2.02 - работает также как и v2.01
                textViewOutput.setText(Arrays.toString(listToStringMassive)); //v2.0
                editTextAddValue.setText("");
            }
        });

        buttonRemoveValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String myStringG = editTextRemoveIndex.getText().toString();
//                int index = Integer.parseInt(myStringG);
                final int index = Integer.parseInt(editTextRemoveIndex.getText().toString());
                System.out.println(index);
                list.remove((int) index); //не работает
                outputArray();
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.clear();
                outputArray();
            }
        });

    }

    private void outputArray() {
        String[] listToStringMassive = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            listToStringMassive[i] = list.get(i); //v2.01
        }
        textViewOutput.setText(Arrays.toString(listToStringMassive));
    }


//    private void onClickRemoveValue(View view) {
//        String myStringG = editTextRemoveIndex.getText().toString();
//        int index = Integer.parseInt(myStringG);
//        list.remove(index);
//    }


}
