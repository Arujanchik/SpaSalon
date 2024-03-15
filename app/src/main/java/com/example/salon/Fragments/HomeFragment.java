package com.example.salon.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.salon.activity.HaircutActivity;
import com.example.salon.R;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ImageView haircutImageView = view.findViewById(R.id.img_haircut);
        if (haircutImageView != null) {
            haircutImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onHaircutClick(v);
                }
            });
        }
        return view;
    }
    public void onHaircutClick(View view) {
        // Здесь код для обработки клика, например, запуск новой активности
        Intent intent = new Intent(getActivity(), HaircutActivity.class);
        startActivity(intent);
    }

}
