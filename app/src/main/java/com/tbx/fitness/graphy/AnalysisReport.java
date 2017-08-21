package com.tbx.fitness.graphy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tvs on 8/19/2017.
 */

public class AnalysisReport extends Fragment {

    Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.daily_analysis_report , container , false);

        toolbar = (Toolbar) ((MainActivity)getContext()).findViewById(R.id.toolbar);



        return v;
    }

    @Override
    public void onResume() {
        super.onResume();

        toolbar.setTitle("ANALYSIS REPORT");

    }

}
