package com.example.dell.studynteach;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class ReadCard extends AppCompatActivity {


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.like:
                    Toast.makeText(ReadCard.this,"You like the content",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.share:
                    Toast.makeText(ReadCard.this,"You wanna share the content",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.remove:
                    Toast.makeText(ReadCard.this,"Thankyou for your feedback",Toast.LENGTH_SHORT).show();
                    return true;

            }
            return false;
        }

    };



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(R.layout.read_cart);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation1);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
}
