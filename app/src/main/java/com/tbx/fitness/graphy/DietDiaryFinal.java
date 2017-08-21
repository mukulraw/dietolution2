package com.tbx.fitness.graphy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class DietDiaryFinal extends Fragment {
    LinearLayout lv,lv1;
    Button btn;
    RelativeLayout rl;
    Toolbar toolbar;
    RelativeLayout activity , analysis;




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.diet_diary_final , container , false);

        toolbar = (Toolbar) ((MainActivity)getContext()).findViewById(R.id.toolbar);

        btn = (Button) v.findViewById(R.id.recomm);
        lv = (LinearLayout)v.findViewById(R.id.lin);
        lv1 = (LinearLayout)v.findViewById(R.id.timeline);
        rl = (RelativeLayout)v.findViewById(R.id.relative);
        activity = (RelativeLayout)v.findViewById(R.id.activity);
        analysis = (RelativeLayout)v.findViewById(R.id.analysis);


        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager =((MainActivity) getContext()).getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                Activity_page fragment = new Activity_page();
                ft.replace(R.id.replace, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.addToBackStack(null);
                ft.commit();

            }
        });

        analysis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fragmentManager =((MainActivity) getContext()).getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                AnalysisReport fragment = new AnalysisReport();
                ft.replace(R.id.replace, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.addToBackStack(null);
                ft.commit();

            }
        });

        lv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager =((MainActivity) getContext()).getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                DietDiaryUpdate fragment = new DietDiaryUpdate();
                ft.replace(R.id.replace, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager =((MainActivity) getContext()).getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                DietDiaryUpdate fragment = new DietDiaryUpdate();
                ft.replace(R.id.replace, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager =((MainActivity) getContext()).getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                MealList fragment = new MealList();
                ft.replace(R.id.replace, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        lv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager =((MainActivity) getContext()).getSupportFragmentManager();
                FragmentTransaction ft = fragmentManager.beginTransaction();
                MyTimeLine fragment = new MyTimeLine();
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

        toolbar.setTitle("MY CHART");

    }
}
