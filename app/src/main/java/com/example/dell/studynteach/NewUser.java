package com.example.dell.studynteach;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;


public class NewUser extends AppCompatActivity {

    GridLayoutManager mLayoutManager;
    RecyclerView recyclerView;
    Button create;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_user);

        create= (Button) findViewById(R.id.b_create);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(NewUser.this,CreateTopic.class);
                startActivity(intent);
            }
        });
        recyclerView = (RecyclerView) findViewById(R.id.recycle);
        mLayoutManager= new GridLayoutManager(NewUser.this,2);
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
        ViewAdapter1 adapter=new ViewAdapter1(NewUser.this,course_name);
        recyclerView.setAdapter(adapter);
    }

    private int dpToPx(int dp) {
        Resources r = getResources();
        return Math.round(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics()));
    }
}
