package edu.ualr.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import edu.ualr.fragments.fragments.FirstFragment;

// TODO 05. In the activity we have to implement the OnItemSelectedListener listener

// TODO 08. The activity needs to make the fragment perform a clear action when the user taps the "clear all" button

public class MainActivity extends AppCompatActivity implements FirstFragment.OnNewTextAddedListener {

    private TextView textList;
    private MaterialButton clearButton;
    private FirstFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textList = findViewById(R.id.textList);
        clearButton = findViewById(R.id.clearButton);
        // TODO 10. In the activity we get access to the fragment using the fragment manager.
        fragment = (FirstFragment) getSupportFragmentManager().findFragmentById(R.id.demoFragment);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClearButtonClicked();
            }
        });
    }

    // TODO 11. We invoke the corresponding method
    private void onClearButtonClicked() {
        this.textList.setText(getResources().getString(R.string.text_output_placeholder));
        if (fragment != null && fragment.isInLayout()) {
            fragment.clearAll();
        }
    }

    // TODO 06. Define the action to take in the activity when the fragment event fires
    @Override
    public void onTextAdded(String text) {
        textList.append("\n" + text);
    }
}
