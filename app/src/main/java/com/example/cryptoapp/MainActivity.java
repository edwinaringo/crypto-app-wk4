package com.example.cryptoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = MainActivity.class.getSimpleName();


   // @BindView(R.id.findCryptosButton) Button mFindCryptosButton;
    //@BindView(R.id.nameEditText) EditText mNameEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  mNameEditText = (EditText) findViewById(R.id.nameEditText);
     //   mFindCryptosButton = (Button)findViewById(R.id.findCryptosButton);
          //  mFindCryptosButton.setOnClickListener(new View.OnClickListener() {
          //
    }
}