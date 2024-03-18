package com.example.salon.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.salon.R;
import com.example.salon.models.Salon;
import com.example.salon.adapter.SalonAdapter;

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
        salonList.add(new Salon("Bonanza", "Kutpanova 12", 4.2, R.drawable.bonanza));
        salonList.add(new Salon("Redken", "Тәуелсіздік 15", 4.2, R.drawable.redkenslogo));
        salonList.add(new Salon("Tiara Nails","Таха Хусейна",3.5,R.drawable.salonnoman));
        salonList.add(new Salon("Bogema","Петрова 20",3.5,R.drawable.bogema));
        salonList.add(new Salon("Imbit Thai Spa","Қажымұқан 1",5,R.drawable.imbirslogan));
        salonList.add(new Salon("Asia Spa","Янушкевич 17",5,R.drawable.massagsalon));

        salonAdapter.notifyDataSetChanged();
    }
}
