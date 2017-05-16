package com.example.taozihan.gitlabapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText userNameText = (EditText)findViewById(R.id.register_username);
        final EditText passwordText = (EditText)findViewById(R.id.register_password);
        final EditText confirmPasswordText = (EditText)findViewById(R.id.register_confirmPassword);
        Button register = (Button)findViewById(R.id.register_registerButton);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = userNameText.getText().toString();
                String psw = passwordText.getText().toString();
                String confirmPsw = confirmPasswordText.getText().toString();

                if(psw.equals(confirmPsw)){
                    Intent intent = new Intent();
                    intent.putExtra("com.username", username);
                    intent.putExtra("com.password", confirmPsw);
                    intent.setClass(RegisterActivity.this, PersonalInfoActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
