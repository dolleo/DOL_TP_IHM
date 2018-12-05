package com.tse.leodol.dolmyapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewName;
    Button buttonEdition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewName = findViewById(R.id.activity_main_textview_name);
        buttonEdition = findViewById(R.id.activity_main_button_edit);

        buttonEdition.setOnClickListener(this);
    }

    @ Override
    public void onClick(View view){
        switch (view.getId()){

            case R.id.activity_main_button_edit:
                break;
        }
    }
}
