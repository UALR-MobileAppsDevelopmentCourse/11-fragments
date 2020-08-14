package edu.ualr.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;

import edu.ualr.fragments.fragments.FirstFragment;

// TODO 01. We create a new XML file to define the layout of the fragment [Already done in previous branches]
// TODO 02. We define the corresponding "controller" by creating a Fragment java class [Already done in previous branches]
public class MainActivity extends AppCompatActivity {

    private static final String FRAGMENT_TAG = "FirstFragment";
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO 07. Load the fragment dynamically
        FirstFragment fragment = null;
        if (fragment == null) return;
        // Begin the transaction
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        // Replace the contents of the container with the new fragment
        ft.replace(R.id.fragment_placeholder, fragment, FRAGMENT_TAG);
        // or ft.add(R.id.your_placeholder, new FooFragment());
        // Complete the changes added above
        ft.commit();
    }
}
