package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class CreateNewAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_account);

        // if the action bar is present it hides it using getSupportActionBar method
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ImageButton signupButton = findViewById(R.id.signup);
        signupButton.setOnClickListener(new View.OnClickListener() {


            //creating onClick method
            @Override
            public void onClick(View view) {

                EditText usernameTxt = (EditText) findViewById(R.id.create_username);
                String username = usernameTxt.getText().toString();

                EditText emailTxt = (EditText) findViewById(R.id.code);
                String email = emailTxt.getText().toString();

                EditText passwordTxt = (EditText) findViewById(R.id.create_password2);
                String password = passwordTxt.getText().toString();

                EditText retypePasswordTxt = (EditText) findViewById(R.id.create_password3);
                String retypePassword = retypePasswordTxt.getText().toString();


                //checks to see if the email is admin@gmail.com
                if (email.equals("admin@gmail.com")) {
                    //checks if both password and retyped password are equal
                    if (password.equals("123") && retypePassword.equals("123")) {
                        Intent intent = new Intent(CreateNewAccountActivity.this, MainActivity.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(CreateNewAccountActivity.this, "Password does not match the retyped password", Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(CreateNewAccountActivity.this, "Please type in a valid email address", Toast.LENGTH_LONG).show();
                }
            }

        });



    }

    public void login(View view) {
        Intent intent = new Intent(CreateNewAccountActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}