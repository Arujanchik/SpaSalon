package com.example.salon.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.salon.R;
import com.example.salon.Salon;
import com.example.salon.adapter.SalonAdapter;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class SearchFragment extends Fragment {

    private RecyclerView recyclerView;
    private SalonAdapter salonAdapter;
    private List<Salon> salonList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Инициализируем список салонов и адаптер
        salonList = new ArrayList<>();
        salonAdapter = new SalonAdapter(salonList);
        recyclerView.setAdapter(salonAdapter);

        // Заполняем список салонов данными (в вашем случае здесь могут быть предопределенные данные)
        loadSalons();

        return view;
    }

    private void loadSalons() {
        // Это заглушка. Вы должны добавить настоящие данные салонов.
        salonList.add(new Salon("Salon 1", "Kutpanova 1", 4.5, R.drawable.kutpanova));
        salonList.add(new Salon("Salon 2", "Respublica 2", 4.0, R.drawable.respublica));
        // ... добавьте больше салонов

        salonAdapter.notifyDataSetChanged();
    }
}
