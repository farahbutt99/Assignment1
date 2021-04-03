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

    public void dua1(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua1.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua2(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua2.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua3(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua3.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua4(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua4.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua5(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua5.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua6(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua6.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua7(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua7.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua8(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua8.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua9(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua9.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua10(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua10.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua11(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua11.class);
        startActivity(homeIntent);
        finish();
    }
    public void dua12(View view)
    {
        Intent homeIntent= new Intent(HomeActivity.this,Dua12.class);
        startActivity(homeIntent);
        finish();
    }
}