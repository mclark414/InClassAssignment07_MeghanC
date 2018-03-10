package com.example.android.inclassassignment07_meghanc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String name;
    String numlegs;
    boolean fur;
    String funFact;
    String animals = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void launchActivty(View view){
        Editable nameInput = ((EditText) findViewById(R.id.name)).getText();
        String tempName = nameInput.toString();
        Editable legsInput = ((EditText) findViewById(R.id.legs)).getText();
        String tempLegs = legsInput.toString();
        boolean tempFur = ((CheckBox) findViewById(R.id.fur)).isChecked();
        Editable factInput = ((EditText) findViewById(R.id.fact)).getText();
        String tempFact = factInput.toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Keys.NAME, tempName);
        intent.putExtra(Keys.LEGS, tempLegs);
        intent.putExtra(Keys.BOOLEAN, tempFur);
        intent.putExtra(Keys.STRING, tempFact);
        intent.putExtra(Keys.ARRAY, animals);
        startActivityForResult(intent, RequestCode.ADD_ANIMAL);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if((requestCode == RequestCode.ADD_ANIMAL)&&(resultCode == RESULT_OK)) {
            Animal temp = (Animal) data.getSerializableExtra(Keys.ANIMAL);
            animals += "\n" + temp.toString();
        }
    }
}
