package com.example.dell.studynteach;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ViewAdapter extends RecyclerView.Adapter<ViewAdapter.ViewHolder>{


    ArrayList<String> course_name;
    Context context;
    public ViewAdapter(Context context, ArrayList<String> course_name){
        this.context=context;
        this.course_name=course_name;
    }

@Override
public ViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
        .inflate(R.layout.read_list, parent, false);
        return new ViewHolder(itemView);
        }


@Override
public void onBindViewHolder(ViewAdapter.ViewHolder holder, final int position) {

holder.textView.setText(course_name.get(position));
}
@Override
public int getItemCount() {
        return course_name.size();
        }

public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


    TextView textView;

    public ViewHolder(View itemView) {
        super(itemView);
            textView= (TextView) itemView.findViewById(R.id.course_name);
    itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent =new Intent(context,ReadCard.class);
        context.startActivity(intent);
    }
}
}
