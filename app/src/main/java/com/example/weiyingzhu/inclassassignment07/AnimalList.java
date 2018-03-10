package com.example.weiyingzhu.inclassassignment07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class AnimalList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_list);}



    public void submit(View view) {

        int age = Integer.parseInt(((EditText) findViewById(R.id.age)).getText().toString());
        String a = ((EditText) findViewById(R.id.name)).getText().toString();
        boolean eat = Boolean.parseBoolean(((CheckBox) findViewById(R.id.eat)).getText().toString());

        Animal animal = new Animal(a,age,eat);

        Intent data = new Intent();
        data.putExtra(Keys.ANIMALS, animal);
        setResult(RESULT_OK, data);
        finish();
    }




    }

