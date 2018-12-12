package com.tse.leodol.dolmyapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textViewName;
    Button buttonEdition;
    RecyclerView recycleView;
    NameListAdapter nameListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameListAdapter = new NameListAdapter();

        //textViewName = findViewById(R.id.activity_main_textview_name)
    }

    // On en a plus besoin depuis qu'on passe par un singleton pour sauvegarder les choses qu'on veut passer d'une page à une autre
    /*@Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK && data.getExtras() != null){
                Bundle args = data.getExtras();
                String name = args.getString("USERNAME");
                textViewName.setText(name);
            } else {

            }
        }
    }*/

    @Override
    protected void onResume(){
        super.onResume();

        List<String> nameList = DataManager.getInstance().getNameList();
        //textViewName.setText(nameList);
        recycleView.setAdapter(nameListAdapter);
    }

    @ Override
    public void onClick(View view){
        switch (view.getId()){

            case R.id.activity_main_button_edition:
                Intent intent = new Intent(this, FormActivity.class);
                startActivityForResult(intent, 1);

                break;
        }
    }

    private void initViews() {
        recycleView = findViewById(R.id.activity_main_recycleview);
        buttonEdition = findViewById(R.id.activity_main_button_edition);

        buttonEdition.setOnClickListener(this);
    }

    private void initList() {
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recycleView.setLayoutManager(linearLayoutManager);
        recycleView.setAdapter(nameListAdapter);
    }
}
