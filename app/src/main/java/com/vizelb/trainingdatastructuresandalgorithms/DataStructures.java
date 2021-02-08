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
    Button buttonAddValue, buttonAddValueIndex, buttonRemoveValueIndex, buttonClear , buttonShowMassive, buttonContains;
    EditText editTextAddValue, editTextAddValueIndex, editTextRemoveValueIndex, editTextContains;
    TextView textViewOutput;

    final ArrayList<String> list = new ArrayList<>();
    final String[] myString = {""};
    final String myStringG = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_structures);

        buttonBack = findViewById(R.id.button_back);
        buttonAddValue = findViewById(R.id.button_add_value);
        buttonAddValueIndex = findViewById(R.id.button_add_value_under_index);
        buttonRemoveValueIndex = findViewById(R.id.button_index_remove_value);
        buttonClear = findViewById(R.id.button_clear_values);
        buttonContains = findViewById(R.id.button_contains);
        buttonShowMassive = findViewById(R.id.button_show_massive);

        editTextAddValue = findViewById(R.id.edit_text_add_value);
//        final String[] myString = {""};

//        elementData = ()
//        list.add()
        editTextAddValue = findViewById(R.id.edit_text_add_value);
        editTextRemoveValueIndex = findViewById(R.id.edit_text_index_remove_value);
        editTextContains = findViewById(R.id.edit_text_contains);

        textViewOutput = findViewById(R.id.text_view_output);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        buttonAddValue.setOnClickListener(new View.OnClickListener() {
            //нужно придумать как сделать так, чтобы он добавлял каждый элемент отдельно
            @Override
            public void onClick(View v) {
                list.add(editTextAddValue.getText().toString());
                outputArray(editTextAddValue);
            }
        });

        //Добавить обработку пропуска
        buttonAddValueIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //старый код сотворенный с самого начала
////                String listToString = ""; //v1.0 - нет обработки пробелов
//                list.add(editTextAddValueIndex.getText().toString());
////                listToString = new String(String.valueOf(list.size()));
////                textViewOutput.setText((CharSequence) list); //error hm-hm
//                String[] listToStringMassive = new String[list.size()]; //v2.01 - добавляются пробелы с запятыми    а еще можно юзать массив myString
//                for (int i = 0; i < list.size(); i++) {
////                    listToString += list.get(i); //v1.0
//                    listToStringMassive[i] = list.get(i); //v2.01
//                }
////                textViewOutput.setText(listToString); //v1.0        вывести конечный лист со всеми изменениями
////                String[] listToStringMassive = list.toArray(new String[list.size()]); // v2.02 - работает также как и v2.01
//                textViewOutput.setText(Arrays.toString(listToStringMassive)); //v2.0
//                editTextAddValueIndex.setText("");

                // новый код, надо создавать новый класс и методы get для него, займемся позже
//                list.add(editTextAddValueIndex,);

            }
        });

        buttonRemoveValueIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 int index = Integer.parseInt(editTextRemoveValueIndex.getText().toString());
                if(index <= list.size() && index != 0) {
                    index -= 1;
                    list.remove((int) index); //не работает
                    outputArray(editTextRemoveValueIndex);
                }
                else textViewOutput.setText("Недопустимое значение");
                editTextRemoveValueIndex.setText("");
            }
        });

        buttonContains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (list.contains(editTextContains.getText().toString()))
                    textViewOutput.setText((String) "true");
                else textViewOutput.setText((String) "false");
                editTextContains.setText("");
            }
        });

        buttonShowMassive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputArray(editTextAddValue);
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.clear();
                outputArray(editTextAddValue);
            }
        });

    }

    private void outputArray(EditText editText) {
        String[] listToStringMassive = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            listToStringMassive[i] = list.get(i); //v2.01
        }
        textViewOutput.setText(Arrays.toString(listToStringMassive));
        editText.setText("");
    }


//    private void onClickRemoveValue(View view) {
//        String myStringG = editTextRemoveIndex.getText().toString();
//        int index = Integer.parseInt(myStringG);
//        list.remove(index);
//    }


}
