package com.tbx.fitness.graphy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Activity_page extends Fragment {

    Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_page , container , false);

        toolbar = (Toolbar) ((MainActivity)getContext()).findViewById(R.id.toolbar);

       return  v ;
    }

    @Override
    public void onResume() {
        super.onResume();

        toolbar.setTitle("ACTIVITY");

    }

}
