package com.example.practice_music_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ForgetPasswordActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_password2);

        //hide action bar
        if( getSupportActionBar() != null ){
            getSupportActionBar().hide();
        }
    }
    //creating onClick method
    public void onClick(View view) {

        EditText codeTxt = (EditText) findViewById(R.id.code);
        String code = codeTxt.getText().toString();
        //checks to see if the code is 000000 if not a msg is sent
        if (code.equals("000000")) {
            Intent intent = new Intent(ForgetPasswordActivity2.this, MainActivity.class);
            startActivity(intent);

        }
        else{
            Toast.makeText(ForgetPasswordActivity2.this, "The code is incorrect. Please try again", Toast.LENGTH_LONG).show();
        }
    }


}