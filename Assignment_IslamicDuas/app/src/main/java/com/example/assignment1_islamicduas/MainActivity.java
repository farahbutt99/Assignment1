package com.example.assignment1_islamicduas;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT= 8000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp = MediaPlayer.create(this,R.raw.bismillah);
        TextView textView= findViewById(R.id.textView2);
        textView.animate().alpha(0).scaleXBy(0.5f).scaleYBy(0.5f).setDuration(8000);
        mp.start();
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent= new Intent(MainActivity.this,HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }


}
