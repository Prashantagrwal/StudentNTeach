package com.example.dell.studynteach;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class Login extends AppCompatActivity{

    TextView new_user,already;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        new_user= (TextView) findViewById(R.id.new_user);
        already= (TextView) findViewById(R.id.already);

        new_user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Login.this,NewUser.class);
                startActivity(intent);

            }
        });

        already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Login.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
