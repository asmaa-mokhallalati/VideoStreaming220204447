package com.asmaa.videostreaming220204447;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button video1BTN,video2BTN,video3BTN,video4BTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video1BTN=findViewById(R.id.video1BTN);
        video2BTN=findViewById(R.id.video2BTN);
        video3BTN=findViewById(R.id.video3BTN);
        video4BTN=findViewById(R.id.video4BTN);

        video1BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/iugfirebase.appspot.com/o/videos%2FKittens%20walk%20with%20a%20tiny%20chicken.mp4?alt=media&token=a157c5e4-7f51-49b6-89fe-f30130d539ab");
                startActivity(intent);
            }
        });
        video2BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/iugfirebase.appspot.com/o/videos%2FThe%20Breathtaking%20Beauty%20of%20Nature%20_%20HD.mp4?alt=media&token=5339d07a-4c9a-4a02-b04b-13da16de047b");
                startActivity(intent);
            }
        });
        video3BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/iugfirebase.appspot.com/o/videos%2FPip%20_%20A%20Short%20Animated%20Film%20by%20Southeastern%20Guide%20Dogs.mp4?alt=media&token=79c87ba4-fde4-4541-9b8b-ac7d9c2a757a");
                startActivity(intent);
            }
        });
        video4BTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,VideoActivity.class);
                intent.putExtra("url","https://firebasestorage.googleapis.com/v0/b/iugfirebase.appspot.com/o/videos%2FNature%20Makes%20You%20Happy%20_%20BBC%20Earth.mp4?alt=media&token=0e28d809-1ad1-46fc-99d5-219742245c2c");
                startActivity(intent);
            }
        });

    }
}