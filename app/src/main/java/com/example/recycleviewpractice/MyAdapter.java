package com.example.recycleviewpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public List<Data> dataList;
    public MyAdapter(List<Data> dataList) {
        this.dataList = dataList;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
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

    class HeaderViewHolder extends RecyclerView.ViewHolder {
        public View itemView;
        public TextView title;
        public HeaderViewHolder(View v) {
            super(v);
            itemView = v;
            title = itemView.findViewById(R.id.item_title);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        switch (viewType) {
            case Data.TYPE_HEADER:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_header, parent, false);
                return new MyAdapter.HeaderViewHolder(itemView);
            case Data.TYPE_ITEM:
                itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
                return new MyAdapter.ItemViewHolder(itemView);
        }
        return null;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Data currentData = dataList.get(position);
        switch (currentData.getType()) {
            case Data.TYPE_HEADER:
                ((MyAdapter.HeaderViewHolder)holder).title.setText(currentData.getTitle());
                break;
            case Data.TYPE_ITEM:
                ((MyAdapter.ItemViewHolder)holder).title.setText(currentData.getTitle());
                ((MyAdapter.ItemViewHolder)holder).description.setText(currentData.getDescription());
                ((MyAdapter.ItemViewHolder)holder).number.setText("" + currentData.getNumber());
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        return dataList.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}