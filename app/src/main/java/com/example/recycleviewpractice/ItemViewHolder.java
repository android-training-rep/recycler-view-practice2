package com.example.recycleviewpractice;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ItemViewHolder extends RecyclerView.ViewHolder {
    public View itemView;
    public TextView title, description, number;
    public ItemViewHolder(View v) {
        super(v);
        itemView = v;
        title = itemView.findViewById(R.id.item_title);
        description = itemView.findViewById(R.id.item_description);
        number = itemView.findViewById(R.id.item_number);
    }
}
