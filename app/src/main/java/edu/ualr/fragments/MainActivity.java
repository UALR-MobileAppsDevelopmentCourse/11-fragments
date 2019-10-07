package edu.ualr.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import edu.ualr.fragments.fragments.FormFragment;
import edu.ualr.fragments.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    FormFragment formFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        formFragment = new FormFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.fragment_placeholder, formFragment);
        ft.commit();
    }

    public void onSaveDataButtonClicked(View view) {
        formFragment.saveProfileData();
        view.setVisibility(View.GONE);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_placeholder, new ProfileFragment());
        ft.commit();
    }
}
