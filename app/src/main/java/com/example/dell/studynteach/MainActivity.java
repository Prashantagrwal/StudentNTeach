package com.example.dell.studynteach;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.create:
                    Toast.makeText(MainActivity.this,"Create Course",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.account:
                    Toast.makeText(MainActivity.this,"This is your Account",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.search:
                    Toast.makeText(MainActivity.this,"Search for course",Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.new_courses:
                    Toast.makeText(MainActivity.this,"Add new course",Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        }

    };

    GridLayoutManager mLayoutManager;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        mLayoutManager= new GridLayoutManager(MainActivity.this,2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, dpToPx(10), true));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<String> course_name=new ArrayList<>();
        course_name.add("C++");
        course_name.add("Python");
        course_name.add("Android");
        course_name.add("Matlab");
        course_name.add("Core Java");
        course_name.add("Advance Java");
        course_name.add("Web Development");
        course_name.add("Hybrid Apps");
        ViewAdapter adapter=new ViewAdapter(MainActivity.this,course_name);
        recyclerView.setAdapter(adapter);
    }

    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }


}

