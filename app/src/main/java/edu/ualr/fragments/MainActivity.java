package edu.ualr.fragments;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// TODO 01. We create a new XML file to define the layout of the fragment [Already done in branch "fragment-static_binding"]
// TODO 02. We define the corresponding "controller" by creating a Fragment java class [Already done in branch "fragment-static_binding"]
public class MainActivity extends AppCompatActivity {

    private static final String FRAGMENT_TAG = "FirstFragment";
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO 04. Add dynamically a new fragment to the activity
        // Begin the transaction
        // Replace the contents of the container with the new fragment
        // Complete the changes added above
        // TODO 05. Look up the fragment by tag
    }
}
