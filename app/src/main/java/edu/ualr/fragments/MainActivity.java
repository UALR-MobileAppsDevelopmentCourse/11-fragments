package edu.ualr.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// TODO 01. We create a new XML file to define the layout of the fragment: first_fragment.xml
// Simple layout with a TextView and a Button
// TODO 02. We define the corresponding "controller" by creating a Fragment java class: FirstFragment.java
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO 04. Finding fragment by id
    }
}
