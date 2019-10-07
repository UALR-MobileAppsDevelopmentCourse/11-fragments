package edu.ualr.fragments.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.textfield.TextInputEditText;

import edu.ualr.fragments.R;
import edu.ualr.fragments.model.PersonViewModel;

/**
 * Created by irconde on 2019-10-07.
 */

public class FormFragment extends Fragment {

    private TextInputEditText firstNameEditText;
    private TextInputEditText lastNameEditText;
    private TextInputEditText ageEditText;
    private PersonViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO 02. We get an instance of the ViewModel from the first fragment. Note that we are
        //  using the corresponding activity as scope of the viewmodel
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.form_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        firstNameEditText = getActivity().findViewById(R.id.first_name_edittext);
        lastNameEditText = getActivity().findViewById(R.id.last_name_edittext);
        ageEditText = getActivity().findViewById(R.id.age_edittext);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    public void saveProfileData() {
        // TODO 03. We store data in the viewmodel
    }

}
