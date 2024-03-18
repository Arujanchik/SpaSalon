package com.example.salon.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.salon.MassageActivity;
import com.example.salon.activity.MakeupActivity;
import com.example.salon.activity.SpaActivity;
import com.example.salon.activity.ManicureActivity;
import com.example.salon.activity.HaircutActivity;
import com.example.salon.R;
import com.example.salon.activity.PillingActivity;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        setupServiceClickListeners(view);

        return view;
    }

    private void setupServiceClickListeners(View view) {
        view.findViewById(R.id.img_haircut).setOnClickListener(v -> startActivity(new Intent(getActivity(), HaircutActivity.class)));
        view.findViewById(R.id.img_manicure).setOnClickListener(v -> startActivity(new Intent(getActivity(), ManicureActivity.class)));
        view.findViewById(R.id.img_pilling).setOnClickListener(v -> startActivity(new Intent(getActivity(), PillingActivity.class)));
        view.findViewById(R.id.img_ulitka).setOnClickListener(v -> startActivity(new Intent(getActivity(), SpaActivity.class)));
        view.findViewById(R.id.img_makeup).setOnClickListener(v -> startActivity(new Intent(getActivity(), MakeupActivity.class)));
        view.findViewById(R.id.img_massage).setOnClickListener(v -> startActivity(new Intent(getActivity(), MassageActivity.class)));
        //view.findViewById(R.id.btn_all_services).setOnClickListener(v -> startActivity(new Intent(getActivity(), AllServicesActivity.class)));
    }
}
