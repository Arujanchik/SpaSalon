package com.example.salon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.salon.activity.MainActivity;
import com.example.salon.activity.MakeUpBookActivity;
import com.example.salon.activity.SuccessActivity;

public class SuccessPageActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_page);
        Button buyButton = findViewById(R.id.btn_back_home);
        buyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMainPage();
            }


        });
    }
    private void goToMainPage() {
        Intent intent = new Intent(SuccessPageActivity.this, MainActivity.class);
        startActivity(intent);
    }
    public void onBackClick(View view) {
        finish();
    }

}