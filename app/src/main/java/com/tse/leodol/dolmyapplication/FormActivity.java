package com.tse.leodol.dolmyapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    private Button saveButton;
    private Button submitButton;
    private EditText editTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        initViews();
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
        /*Intent intent = new Intent();

        intent.putExtra("USERNAME", editTextName.getText().toString());

        setResult(RESULT_OK, intent);*/

        String name = editTextName.getText().toString();

        if (!name.isEmpty()){
            DataManager.getInstance().addItem();
        } else {
            Toast.makeText(this, "Veuillez saisir votre nom", Toast.LENGTH_SHORT).show();
        }

        finish();
    }
}
