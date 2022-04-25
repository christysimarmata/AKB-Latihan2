package com.example.a10120806latihan2;

//  25 April 2022
//  Christy Gunawan Simarmata
//  10120806 - IF5

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
    }
    public void pushSend(View view){
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}