package com.example.salon.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.salon.R;

public class ManicureBookActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etPhone;
    private Button btnBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manicure_book);

        etName = findViewById(R.id.et_name);
        etPhone = findViewById(R.id.et_phone);
        btnBook = findViewById(R.id.btn_book);

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bookNow();
            }
        });
    }

    private void bookNow() {
        String name = etName.getText().toString().trim();
        String phone = etPhone.getText().toString().trim();

        if (name.isEmpty() || phone.isEmpty()) {
            Toast.makeText(this, "Пожалуйста, заполните все поля.", Toast.LENGTH_LONG).show();
            return;
        }

        Intent intent = new Intent(ManicureBookActivity.this, SuccessActivity.class);
        startActivity(intent);
    }
}