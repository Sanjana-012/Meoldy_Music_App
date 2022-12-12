package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        // if the action bar is present it hides it using getSupportActionBar method
        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }


        ImageButton loginButton = findViewById(R.id.signin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            //creating onClick method
            public void onClick(View view) {
                EditText usernameTxt = findViewById(R.id.username);
                String username = usernameTxt.getText().toString();

                EditText passwordTxt = findViewById(R.id.password);
                String password = passwordTxt.getText().toString();

                //to check if the password and login is correct. if it is correct then it will go to MainActivity
                if (username.equals("admin") && password.equals("123")){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this, "Incorrect username/password", Toast.LENGTH_LONG).show();

                }

            }
        });

        TextView textView = findViewById(R.id.redirectToSignup);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, CreateNewAccountActivity.class);
                startActivity(intent);
            }
        });


    }

    public void forgetPasswordPage(View view) {
        Intent intent = new Intent(LoginActivity.this, ForgetPasswordActivity.class);
        startActivity(intent);
    }
}