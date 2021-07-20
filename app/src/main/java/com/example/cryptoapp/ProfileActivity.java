package com.example.cryptoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;

public class ProfileActivity extends AppCompatActivity {


    @BindView(R.id.nameTextView) TextView mNameTextView;
    @BindView(R.id.findListButton) Button mFindListButton;
    @BindView(R.id.signOut) Button mSignOut;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mSignOut = (Button) findViewById(R.id.signOut);
        mSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Toast.makeText(ProfileActivity.this, "You have successfully logged out", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(ProfileActivity.this, MainActivity.class));

            }
        });

        mNameTextView = (TextView) findViewById(R.id.nameTextView);
        mFindListButton = (Button)findViewById(R.id.findListButton);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        mNameTextView.setText("Hello, " + name + ". Welcome!");
        mFindListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, ListActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

    }
}