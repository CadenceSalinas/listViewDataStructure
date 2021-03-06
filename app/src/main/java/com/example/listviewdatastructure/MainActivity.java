package com.example.listviewdatastructure;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView list;
    queue listInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.list);
        listInput = new queue();

        listInput.add(1);
        listInput.add(2);
        listInput.add(6);
        listInput.add(7);
        listInput.add(10);
        listInput.add(242);
        listInput.add(14);
        listInput.add(10);
        listInput.add(9);
        listInput.add(786);
        listInput.add(100000000);
        listInput.add(0);
        listInput.add(13456);
        listInput.add(7531);
        listInput.add(724);
        listInput.add(727);
        listInput.add(80);
//        for(int i = 30; i >= 1; i--)
//        {
//            listInput.add(i);
//        }

        int num = listInput.getSize();

        String[] numbers = new String[] {};
        List<String> numbers_list = new ArrayList<String>(Arrays.asList(numbers));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers_list);

        for(int i = 0; i < num; i++)
        {
            adapter.add(listInput.data(i) + "");
        }

        list.setAdapter(adapter);
    }
}