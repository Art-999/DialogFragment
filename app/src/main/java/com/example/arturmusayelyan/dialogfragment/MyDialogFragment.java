package com.example.arturmusayelyan.dialogfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by artur.musayelyan on 25/12/2017.
 */

public class MyDialogFragment extends DialogFragment implements View.OnClickListener {
    private Button yes, no;
    private Comunicator comunicator;

    public MyDialogFragment() {

    }

    public static MyDialogFragment newInstance() {
        Bundle args = new Bundle();
        MyDialogFragment fragment = new MyDialogFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_dialog_fragment, container, false);
        comunicator = (Comunicator) getActivity();
        yes = view.findViewById(R.id.yes_fragment_dialog_button);
        no = view.findViewById(R.id.no_fragment_dialog_button);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
        setCancelable(false);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.yes_fragment_dialog_button:
                dismiss();
                //Toast.makeText(getActivity(),"Yes button was clicked",Toast.LENGTH_SHORT).show();
                comunicator.onDialogMessage("Yes war clicked");
                break;
            case R.id.no_fragment_dialog_button:
                //Toast.makeText(getActivity(),"No button was clicked",Toast.LENGTH_SHORT).show();
                dismiss();
                comunicator.onDialogMessage("No was clicked");
                break;
        }
    }
}
