package edu.ualr.fragments.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import edu.ualr.fragments.R;

/**
 * Created by irconde on 2019-10-07.
 */

// TODO 01. We create a interface to communicate events from the fragment to the activity.

public class FirstFragment extends Fragment {

    private Button addTextBtn;
    private EditText editText;
    private TextView textCountLabel;

    // TODO 03. Define the listener using the interface type defined

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        addTextBtn = view.findViewById(R.id.addButton);
        addTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddButtonClicked();
            }
        });
        editText = view.findViewById(R.id.inputText);
        textCountLabel = view.findViewById(R.id.number_texts_added);
    }

    // TODO 07. Now we can fire the event when the user clicks the "Add text" button

    private void updateCounter() {
        int textCount = Integer.parseInt(this.textCountLabel.getText().toString());
        this.textCountLabel.setText(String.valueOf(++textCount));
    }

    // TODO 04. Store the listener (activity) that will have events fired once the fragment is attached
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    // TODO 09. We can just add a new method to the fragment class

    // TODO 02. We define the listener interface as an inner type of the Fragment class
    // We define the events that the fragment will use to communicate

}
