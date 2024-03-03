package com.example.salon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements ServicesAdapter.ItemClickListener {

    private List<ServiceItem> serviceItems = new ArrayList<>();
    private RecyclerView recyclerView;
    private ServicesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Инициализация данных услуг
        initializeServiceData();

        recyclerView = findViewById(R.id.services_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ServicesAdapter(this, serviceItems);
        adapter.setClickListener(this);
        recyclerView.setAdapter(adapter);
    }

    private void initializeServiceData() {
        // Добавьте ваши данные услуг здесь
        serviceItems.add(new ServiceItem("Пиллинг лица","В салоне по адресу 'Мағжан Жұмабаева 14' делаем пиллинг лица",R.drawable.tock,"3000 теңге","Адрес: Құрманғазы 55А"));
        serviceItems.add(new ServiceItem("Маска для лица", "Маска для лица – это косметическое средство с выраженным эффектом, с помощью которого можно глубоко очистить кожу, обеспечить ей дополнительное питание или увлажнение.", R.drawable.tock, "Цена: 5000 тенге", "Адрес: Құрманғазы 55А"));



        // Добавьте больше услуг
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this, ServiceDetailActivity.class);
        ServiceItem item = serviceItems.get(position);
        // Передача данных услуги в ServiceDetailActivity
        intent.putExtra("TITLE", item.getTitle());
        intent.putExtra("DESCRIPTION", item.getDescription());
        intent.putExtra("IMAGE_RESOURCE_ID", item.getImageResourceId());
        startActivity(intent);
    }
}
