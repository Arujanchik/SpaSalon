package com.example.salon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ServiceDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_detail);

        ImageView serviceImage = findViewById(R.id.service_detail_image);
        TextView serviceTitle = findViewById(R.id.service_detail_title);
        TextView serviceDescription = findViewById(R.id.service_detail_description);

        // Получение данных из Intent
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String title = extras.getString("TITLE");
            String description = extras.getString("DESCRIPTION");
            int imageResourceId = extras.getInt("IMAGE_RESOURCE_ID");

            serviceTitle.setText(title);
            serviceDescription.setText(description);
            serviceImage.setImageResource(imageResourceId);
        }
    }
}
