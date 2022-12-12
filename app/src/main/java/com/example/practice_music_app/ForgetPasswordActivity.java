package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password);

        //hide action bar
        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
    }

//creating onClick method
    public void onClick(View view) {

        EditText emailTxt = (EditText) findViewById(R.id.code);
        String email = emailTxt.getText().toString();

        //checks if the email is admin@gmail.com if not a msg is sent
        if (email.equals("admin@gmail.com")) {
            Intent intent = new Intent(ForgetPasswordActivity.this, ForgetPasswordActivity2.class);
            startActivity(intent);

        }
        else{
            Toast.makeText(ForgetPasswordActivity.this, "Please type in a valid email address", Toast.LENGTH_LONG).show();
        }
    }
}