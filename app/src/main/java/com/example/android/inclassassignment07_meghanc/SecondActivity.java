package com.example.android.inclassassignment07_meghanc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    Animal newAnimal;
    String animals = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String name = intent.getStringExtra(Keys.NAME);
        String numLegs = intent.getStringExtra(Keys.LEGS);
        String furString = intent.getStringExtra(Keys.BOOLEAN);
        boolean fur = Boolean.parseBoolean(furString);
        String funFact = intent.getStringExtra(Keys.STRING);
        newAnimal = new Animal(name, numLegs, fur, funFact);
        String animalList = intent.getStringExtra(Keys.ARRAY);
        animals = animalList;
        display();
    }
    public void addAnimal(View view){
        Intent intent = new Intent();
        intent.putExtra(Keys.ANIMAL, newAnimal);
        setResult(RESULT_OK, intent);
        finish();
    }
    public void display() {
        TextView text = (TextView) findViewById(R.id.display);
        String animalInfo = "\n"+ newAnimal.toString();
        animals += animalInfo;
        text.setText(animals);
    }
}
