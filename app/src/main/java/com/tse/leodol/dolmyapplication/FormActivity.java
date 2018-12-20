package com.tse.leodol.dolmyapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    //private Button saveButton;
    private Button submitButton;
    private EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initViews();
    }

    private void initViews(){
        //saveButton = findViewById(R.id.activity_form_button);
        submitButton = findViewById(R.id.activity_form_button);
        editTextName = findViewById(R.id.activity_form_textview_editTextName);
        /*saveButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               saveData();
           }
        });*/
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitData();
                Intent intent = new Intent(FormActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    /*private void saveData(){
        Intent intent = new Intent();

        intent.putExtra("USERNAME", editTextName.getText().toString());

        setResult(RESULT_OK, intent);

        String name = editTextName.getText().toString();

        if (!name.isEmpty()){
            DataManager.getInstance().addItem();
        } else {
            Toast.makeText(this, "Veuillez saisir votre nom", Toast.LENGTH_SHORT).show();
        }

        finish();
    }*/

    private void submitData(){
        String name = editTextName.getText().toString();

        if (!name.isEmpty()){
            DataManager.getInstance().addItem(name);
        } else {
            Toast.makeText(this, "Erreur", Toast.LENGTH_SHORT).show();
        }
    }
}
