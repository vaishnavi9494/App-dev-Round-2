package com.example.myapplication;

import android.app.LauncherActivity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder> {

    private List<listItem> listItems;
    private Context context;

    public myAdapter(List<listItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View v = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.list_item, parent, false);
       return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
     final listItem  listItem = listItems.get(position);

     holder.textViewHead.setText(listItem.getHead());
        holder.textViewDes.setText(listItem.getDes());
        holder.textViewCost.setText(listItem.getCost());
        holder.imageView.setImageResource(listItem.getImageResource());
        holder.textViewBook.setText(listItem.getBook());

        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Congratulations! You are in for ' " + listItem.getHead() + " ' Enjoy!!", Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textViewHead;
        public TextView textViewDes;
        public TextView textViewCost;
        public TextView textViewBook;
        public ImageView imageView;
        public RelativeLayout relativeLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewHead = (TextView) itemView.findViewById(R.id.textViewHead);
            textViewDes = (TextView) itemView.findViewById(R.id.textViewDes);
            textViewCost = (TextView) itemView.findViewById(R.id.textViewCost);
            textViewBook = (TextView) itemView.findViewById(R.id.textViewBook);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            relativeLayout = (RelativeLayout) itemView.findViewById(R.id.relativeLayout);
        }
    }
}

