package com.example.cryptoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;

public class CryptoActivity extends AppCompatActivity {

    //binding views using butter knife.

    @BindView(R.id.nameTextView) TextView mNameTextView;
    @BindView(R.id.findListButton) Button mFindListButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crypto);
        mNameTextView = (TextView) findViewById(R.id.nameTextView);
        mFindListButton = (Button)findViewById(R.id.findListButton);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        mNameTextView.setText("Hello, " + name + ". Welcome!");
        mFindListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CryptoActivity.this, ListActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
    }
}