package com.example.fragmentadvance;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmentcourse extends Fragment {

    View view;


    public Fragmentcourse() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =(View) inflater.inflate(R.layout.fragment_fragmentcourse, container, false);
        return view;
    }

}
