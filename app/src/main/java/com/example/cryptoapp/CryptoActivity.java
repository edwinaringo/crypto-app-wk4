package com.example.cryptoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CryptoActivity extends AppCompatActivity {
    private TextView mNameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto);
        mNameTextView = (TextView) findViewById(R.id.nameTextView);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        mNameTextView.setText("Hello, " + name + ". Welcome!");
    }
}