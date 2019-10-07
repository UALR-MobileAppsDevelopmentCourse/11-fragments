package edu.ualr.fragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// TODO 01. We create a new XML file to define the layout of the fragment
// TODO 02. We define the corresponding "controller" by creating a Fragment java class
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
