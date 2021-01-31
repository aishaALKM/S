package com.example.space4;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SpaceAdapter extends RecyclerView.Adapter {

    ArrayList<Inventionsjavaclass> p_arrayList ;
    Context context;

    public SpaceAdapter(ArrayList<Inventionsjavaclass> arrayList, Context context) {
        this.p_arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.space_list_item,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img2.setImageResource(p_arrayList.get(position).getImg());
        ((ViewHolder) holder).topic.setText(p_arrayList.get(position).getTopic()+"");
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,MainActivity3.class);
                i.putExtra("key",p_arrayList.get(position));
                context.startActivity(i);
            }
        });


    }

    @Override
    public int getItemCount() {
        return p_arrayList.size() ;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView img2 ;
        public TextView topic;
        public View view ;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            img2 = itemView.findViewById(R.id.imageView10);
            topic = itemView.findViewById(R.id.textView7);
        }

    }
}
