package com.tse.leodol.dolmyapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormActivity extends AppCompatActivity {

    Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
    }

    private void initViews(){
        saveButton = findViewById(R.id.activity_form_button);
        saveButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               saveData();
           }
        });
    }

    private void saveData(){
        Intent intent = new Intent();

        intent.putExtra("USERNAME", "Bob");

        setResult(RESULT_OK, intent);

        finish();
    }
}
