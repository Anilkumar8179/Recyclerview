package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Member;

public class Adapter extends RecyclerView.Adapter<Adapter.MyHolder>{
String myMember[];

    public Adapter(String[] myMember) {
        this.myMember = myMember;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layoutdata,parent,false);
        return (new MyHolder(view));
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.text1.setText(myMember[position]);

    }

    @Override
    public int getItemCount() {
        return myMember.length;
    }

    class MyHolder extends RecyclerView.ViewHolder {

        ImageView imagview ;
        TextView text1;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            imagview =(ImageView) itemView.findViewById(R.id.imagview);
            text1=(TextView) itemView.findViewById(R.id.text1);
        }
    }
}
