package com.example.matt.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MattAdapter extends RecyclerView.Adapter<ExampleViewHolder> {
    private final LayoutInflater mInflater;
    private List<String> valueStrings;

    public MattAdapter(Context context, List<String> valueStrings) {
        this.valueStrings = valueStrings;
        mInflater = LayoutInflater.from(context);

    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final ExampleViewHolder holder = new ExampleViewHolder(mInflater.inflate(R.layout.holder, null));
        holder.tvText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MattAdapter.this.valueStrings.remove(holder.getAdapterPosition());
                MattAdapter.this.notifyItemRemoved(holder.getAdapterPosition());
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        holder.bind(valueStrings.get(position));
    }

    @Override
    public int getItemCount() {
        return valueStrings.size();
    }
}
