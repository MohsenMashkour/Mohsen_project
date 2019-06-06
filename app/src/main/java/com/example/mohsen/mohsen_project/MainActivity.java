package com.example.mohsen.mohsen_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button beginnerButton;
    private Button experiencedbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.beginnerButton = findViewById(R.id.button_Beginner); // creation of an id of the button for an action

        beginnerButton.setOnClickListener(new View.OnClickListener() {  // what we want to do when click on beginnerbutton
            @Override
            public void onClick(View v) {

                Intent int1 = new Intent(getApplicationContext(), activity_beginner.class); //if click on this button, start new activity
                startActivity(int1);
                // finish(); //stop the previous activity
            }
        });


        this.experiencedbutton = findViewById(R.id.button_Experienced); // creation of an id of the button for an action

        experiencedbutton.setOnClickListener(new View.OnClickListener() {  // what we want to do when click on experiencedbutton
            @Override
            public void onClick(View v) {

                Intent int2 = new Intent(getApplicationContext(), activity_experienced.class); //if click on this button, start new activity
                startActivity(int2);
                // finish(); //stop the previous activity
            }
        });
    }
    
}
