package com.example.taozihan.gitlabapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        final EditText userNameText = (EditText)findViewById(R.id.username);
        final EditText passwordText = (EditText)findViewById(R.id.password);
        Button signIn2 = (Button)findViewById(R.id.signIn2);
        Button register2 = (Button)findViewById(R.id.register2);

        signIn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userNameText.getText().toString();
                String password = passwordText.getText().toString();

                Intent intent = new Intent();
                intent.putExtra("com.username", username);
                intent.putExtra("com.password", password);
                intent.setClass(SignInActivity.this, PersonalInfoActivity.class);
                startActivity(intent);

            }
        });

        register2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(SignInActivity.this, RegisterActivity.class);
                startActivity(intent);

            }
        });
    }
}
