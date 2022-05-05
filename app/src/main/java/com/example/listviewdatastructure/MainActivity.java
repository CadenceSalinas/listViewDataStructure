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

    String setAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView)findViewById(R.id.list);
        Button add = (Button)findViewById(R.id.click);
        EditText inputUser = (EditText)findViewById(R.id.userInput);


        String[] fruits = new String[] {""};

        List<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, fruits_list);

        list.setAdapter(adapter);
        add.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                setAnswer = inputUser.getText().toString();

                Log.i("info", "Added new item to list");
                fruits_list.add("Freaky");
                fruits_list.add(setAnswer);
                //fruits_list.add("Jolly");

                adapter.notifyDataSetChanged();
            }
        });
    }
}