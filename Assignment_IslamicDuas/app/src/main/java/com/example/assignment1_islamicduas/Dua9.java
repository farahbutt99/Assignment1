package com.example.assignment1_islamicduas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Dua9 extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua9);
        mp = MediaPlayer.create(this,R.raw.dua9audio);
    }
    public void playaudio(View view) {
        mp.start();

    }
    public void stopaudio(View view) {
        mp.stop();
    }
    public void gotohome(View view) {
        Intent homeIntent= new Intent(Dua9.this,HomeActivity.class);
        startActivity(homeIntent);
        mp.stop();
        finish();
    }
}