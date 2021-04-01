package com.example.assignment1_islamicduas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void dua1(View view) {
        Intent homeIntent= new Intent(HomeActivity.this,Dua1.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua2(View view) {
    }
    public void dua3(View view) {
    }
    public void dua4(View view) {
    }
    public void dua5(View view) {
    }
    public void dua6(View view) {
    }
    public void dua7(View view) {
    }
    public void dua8(View view) {
    }
    public void dua9(View view) {
    }
    public void dua10(View view) {
    }
    public void dua11(View view) {
    }
    public void dua12(View view) {
    }
}