package com.example.salon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ServiceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_detail);

        // Получение и установка данных
        ImageView serviceImage = findViewById(R.id.service_detail_image);
        TextView serviceTitle = findViewById(R.id.service_detail_title);
        TextView serviceDescription = findViewById(R.id.service_detail_description);
        TextView servicePrice = findViewById(R.id.service_detail_price); // Добавлено
        TextView serviceAddress = findViewById(R.id.service_detail_address); // Добавлено
        Button buttonBook = findViewById(R.id.button_book); // Добавлено

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String title = extras.getString("TITLE");
            String description = extras.getString("DESCRIPTION");
            int imageResourceId = extras.getInt("IMAGE_RESOURCE_ID");
            String price = extras.getString("PRICE"); // Добавлено
            String address = extras.getString("ADDRESS"); // Добавлено

            serviceTitle.setText(title);
            serviceDescription.setText(description);
            serviceImage.setImageResource(imageResourceId);
            servicePrice.setText(price); // Установить цену
            serviceAddress.setText(address); // Установить адрес
        }

        // Обработчик нажатия для кнопки бронирования
        buttonBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Здесь добавьте логику для бронирования или перехода на другой экран
            }
        });
    }
}
