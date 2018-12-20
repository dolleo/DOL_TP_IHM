package com.tse.leodol.dolmyapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NameViewHolder extends RecyclerView.ViewHolder {
    TextView textViewName;

    public NameViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewName = itemView.findViewById(R.id.item_name_text);
        // textViewName = itemView.findViewById(R.id.activity_form_textview_editTextName);
    }

    public void setContent(String name) {
        this.textViewName.setText(name);
    }
}
