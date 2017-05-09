package com.example.taozihan.gitlabapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        TextView usernameText = (TextView)findViewById(R.id.usernameTextView);
        TextView passwordText = (TextView)findViewById(R.id.passwordTextView);

        Intent intent = getIntent();
        if(intent == null){
            Toast.makeText(PersonalInfoActivity.this, "出错啦！", Toast.LENGTH_LONG);
        }

        usernameText.setText(intent.getStringExtra("com.username"));
        passwordText.setText(intent.getStringExtra("com.password"));
    }
}
