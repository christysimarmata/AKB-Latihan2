package com.example.a10120806latihan2;

//  25 April 2022
//  Christy Gunawan Simarmata
//  10120806 - IF5

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlmostThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }
    public void verify(View view){
        Intent intent = new Intent(this, Verify.class);
        startActivity(intent);
    }
}