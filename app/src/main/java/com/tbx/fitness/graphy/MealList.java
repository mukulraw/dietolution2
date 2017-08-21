package com.tbx.fitness.graphy;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MealList extends Fragment {

    RecyclerView grid;
    GridLayoutManager manager;
    Meal_Adapter adapter;
    Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.meal_list , container ,false);

        toolbar = (Toolbar) ((MainActivity)getContext()).findViewById(R.id.toolbar);

        adapter = new Meal_Adapter(getContext());

        grid = (RecyclerView)v.findViewById(R.id.grid);
        manager = new GridLayoutManager(getContext() , 1);

        grid.setLayoutManager(manager);
        grid.setAdapter(adapter);


        return v;
    }

    public class Meal_Adapter extends RecyclerView.Adapter<Meal_Adapter.MyViewHolder> {

        Context context;


        public Meal_Adapter(Context context){
            this.context = context;
        }
        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View v = inflater.inflate(R.layout.meal__list_model, parent, false);
            return new MyViewHolder(v);



        }

        @Override
        public void onBindViewHolder(MyViewHolder holder, int position) {

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    FragmentManager fragmentManager =((MainActivity) context).getSupportFragmentManager();
                    FragmentTransaction ft = fragmentManager.beginTransaction();
                    Product fragment = new Product();
                    ft.replace(R.id.replace, fragment);
                    ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                    ft.addToBackStack(null);
                    ft.commit();

                }
            });

        }

        @Override
        public int getItemCount() {
            return 15;
        }

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public MyViewHolder(View itemView) {
                super(itemView);
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        toolbar.setTitle("MEAL LIST");

    }


}
