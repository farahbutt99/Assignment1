package com.example.assignment1_islamicduas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ListView listView = findViewById(R.id.ListViewDuas);
        ArrayList<String> arrayListDuas= new ArrayList<String>();
        arrayListDuas.add("1۔ علم میں اضافے کی دعا");
        arrayListDuas.add("2۔سفر کی دعا");
        arrayListDuas.add("3۔ اذان کے بعد کی دعا");
        arrayListDuas.add("4۔ غصے کی دعا");
        arrayListDuas.add("5۔جسم میں درد کی دعا");
        arrayListDuas.add("6");
        arrayListDuas.add("7");
        arrayListDuas.add("8");
        arrayListDuas.add("9");
        arrayListDuas.add("10");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 ,arrayListDuas);
       listView.setAdapter(arrayAdapter);
    }
}