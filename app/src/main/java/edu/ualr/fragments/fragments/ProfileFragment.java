package edu.ualr.fragments.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import edu.ualr.fragments.R;
import edu.ualr.fragments.model.Person;
import edu.ualr.fragments.model.PersonViewModel;

/**
 * Created by irconde on 2019-10-10.
 */
public class ProfileFragment extends Fragment {

    private TextView firstNameTV;
    private TextView lastNameTV;
    private TextView ageTV;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void onNewDataReceived(Person person) {
        firstNameTV.setText(person.getFirstName());
        lastNameTV.setText(person.getLastName());
        ageTV.setText(String.valueOf(person.getAge()));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.profile_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        firstNameTV = view.findViewById(R.id.first_name_text);
        lastNameTV = view.findViewById(R.id.last_name_text);
        ageTV = view.findViewById(R.id.age_text);

        // TODO 04. We get an instance of the ViewModel from the second fragment. Note that we are
        //  using the corresponding activity as scope of the viewmodel. That's why we can used the same ViewModel in both fragments

        // TODO 05. In this fragment we are interested in observing changes in the viewmodel just to update the corresponding views anytime there's
        // a change in the viewmodel

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

}
