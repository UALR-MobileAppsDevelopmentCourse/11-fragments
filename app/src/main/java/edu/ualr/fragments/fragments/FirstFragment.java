package edu.ualr.fragments.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import edu.ualr.fragments.R;

/**
 * Created by irconde on 2019-10-07.
 */
public class FirstFragment extends Fragment {

    private static final String INT_VALUE_KEY = "IntValue";
    private static final String TITLE_VALUE_KEY = "TitleValue";
    private static final String TAG = FirstFragment.class.getSimpleName();

    private Button button;
    private TextView label;

    // TODO 04. We define a static method to create a new instance of the fragment
    //  and use the setArguments method to set certain arguments into the fragment for later access

    public static FirstFragment newIntance (int intValue, String title) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putInt(INT_VALUE_KEY, intValue);
        args.putString(TITLE_VALUE_KEY, title);
        fragment.setArguments(args);
        return fragment;
    }

    // TODO 05. Access the arguments of the fragment within onCreate

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int intValue = getArguments().getInt(INT_VALUE_KEY);
        String msg = getArguments().getString(TITLE_VALUE_KEY);
        Log.d(TAG, String.format(msg, intValue));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.first_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        button = view.findViewById(R.id.button);
        label = view.findViewById(R.id.textLabel);
        // TODO 06. Access the arguments of the fragment within onViewCreated to populate widgets with the data in
        // the arguments
        String msg = getArguments().getString(TITLE_VALUE_KEY);
        int intValue = getArguments().getInt(INT_VALUE_KEY);
        label.setText(String.format(msg, intValue));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {}
        });
    }
}
