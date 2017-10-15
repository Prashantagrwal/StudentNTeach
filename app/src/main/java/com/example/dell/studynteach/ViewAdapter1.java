package com.example.dell.studynteach;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by DELL on 15/10/2017.
 */

public class ViewAdapter1 extends RecyclerView.Adapter<ViewAdapter1.ViewHolder>{


    ArrayList<String> course_name;
    Context context;
    public ViewAdapter1(Context context, ArrayList<String> course_name){
        this.context=context;
        this.course_name=course_name;
    }

    @Override
    public ViewAdapter1.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.new_read, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
holder.textView.setText(course_name.get(position));
    }

    @Override
    public int getItemCount() {
        return course_name.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  {


        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.textView);

        }


    }
}
