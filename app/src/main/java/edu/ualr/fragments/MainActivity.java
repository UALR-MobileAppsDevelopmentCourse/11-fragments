package edu.ualr.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

// TODO 01. We create a new XML file to define the layout of the fragment
// TODO 02. We define the corresponding "controller" by creating a Fragment java class
// TODO 02.01. We define one member per element in the layout
// TODO 02.02. We override the OnCreate method to inflate the layout of the fragment
// TODO 02.03. We override the onViewCreated method to get a reference to the elements in the corresponding layout
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO 04. Getting a reference of the fragment by using the findFragmentById method from the SupportFragmentManager
        Fragment demoFragment = getSupportFragmentManager().findFragmentById(R.id.demoFragment);
    }
}
