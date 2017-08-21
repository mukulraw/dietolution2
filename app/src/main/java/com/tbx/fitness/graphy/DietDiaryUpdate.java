package com.tbx.fitness.graphy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class DietDiaryUpdate extends Fragment {

    Toolbar toolbar;
    TextView analysis;
    RelativeLayout lv;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.diet_diary_update ,container , false);

        toolbar = (Toolbar) ((MainActivity)getContext()).findViewById(R.id.toolbar);

        analysis = (TextView)v.findViewById(R.id.analysis);

        lv = (RelativeLayout) v.findViewById(R.id.linearlog);
        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(),Search.class);
                startActivity(i);
            }
        });

        analysis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager =((MainActivity) getContext()).getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                Daily_Analysis fragment = new Daily_Analysis();
                ft.replace(R.id.replace, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.addToBackStack(null);
                ft.commit();

            }
        });

        return v;
    }

    @Override
    public void onResume() {
        super.onResume();

        toolbar.setTitle("DIET DIARY");

    }
}
