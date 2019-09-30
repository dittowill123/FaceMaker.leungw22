package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Spinner Spinner; //creates dropdown for hairstyles on the spinner

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * External Citation
         *   Date: 29 September 2019
         *   Problem: Did not know how to get spinner options
         *   Resource: https://www.youtube.com/watch?v=npckz4GGxEs
         *
         *   Solution: I followed similar directions from the video.
         */
        Spinner = findViewById(R.id.hairStyleSpinner);
        ArrayList<String> list = new ArrayList<>();
        list.add("Hairstyle 1"); //options for each hairstyle
        list.add("Hairstyle 2");
        list.add("Hairstyle 3");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this ,
                android.R.layout.simple_spinner_dropdown_item, list);
        Spinner.setAdapter(adapter);

        Face face = findViewById(R.id.currentFace);
    }

}
