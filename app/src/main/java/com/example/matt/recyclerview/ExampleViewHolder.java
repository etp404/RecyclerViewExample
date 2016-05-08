package com.example.matt.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ExampleViewHolder extends RecyclerView.ViewHolder {

    public final TextView tvText;

    public ExampleViewHolder(View itemView) {
        super(itemView);

        tvText = (TextView) itemView.findViewById(R.id.text_view_id);
    }

    public void bind(String textValue) {
        tvText.setText(textValue);
    }
}
