package com.example.assignment1_islamicduas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Dua3 extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mp = MediaPlayer.create(this,R.raw.dua3audio);
        setContentView(R.layout.activity_dua3);
    }
    public void playaudio(View view) {
        mp.start();

    }
    public void stopaudio(View view) {
        mp.stop();
    }
    public void gotohome(View view) {
        Intent homeIntent= new Intent(Dua3.this,HomeActivity.class);
        startActivity(homeIntent);
        mp.stop();
        finish();
    }
}