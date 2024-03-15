package com.example.salon.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.salon.activity.HaircutActivity;
import com.example.salon.R;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        return view;
    }
    public void onHaircutClick(View view) {
        Intent intent = new Intent(getContext(), HaircutActivity.class);
        startActivity(intent);
    }

}
