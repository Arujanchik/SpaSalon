package com.example.salon.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.salon.R;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Настройте здесь свои кнопки и обработчики нажатий
        Button haircutButton = view.findViewById(R.id.button_haircut);
        haircutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Запуск DetailActivity с информацией о стрижке
                // Используйте Intent для передачи данных
            }
        });

        // Создайте обработчики для других услуг аналогично
        // ...

        return view;
    }
}
