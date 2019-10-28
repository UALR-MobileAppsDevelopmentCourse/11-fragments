package edu.ualr.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import edu.ualr.fragments.fragments.FirstFragment;

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
        // TODO 04.01. We use the SupportFragmentManager to make the transaction begin
        // TODO 04.02. Replace the contents of the container with the new fragment.
        //  We can assign a string tag to the fragment just to get a reference of that fragment in the future
        // TODO 04.03. Complete the changes added above. We have to commit the transaction
        // TODO 05. Look up the fragment by tag
    }
}
