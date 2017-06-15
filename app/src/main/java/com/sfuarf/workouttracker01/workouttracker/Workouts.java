package com.sfuarf.workouttracker01.workouttracker;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Workouts extends Fragment {


    public Workouts() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workouts,
                container, false);

        Button workBtn1 = (Button) view.findViewById(R.id.workBtn1);
        workBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Exercises fragment = new Exercises();
                android.support.v4.app.FragmentTransaction fragmentTransaction =
                        getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container, fragment);
                fragmentTransaction.commit();
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

}
