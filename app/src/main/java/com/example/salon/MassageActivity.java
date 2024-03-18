package com.example.salon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.salon.activity.DescriptionMassage;
import com.example.salon.activity.SpaBookActivity;

public class MassageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_massage);
    }
    public void massageOnDescriptionClick(View view) {
        DescriptionMassage bottomSheet = new DescriptionMassage();
        bottomSheet.show(getSupportFragmentManager(), "DescriptionMassage");
    }
    public void onContinueClickMassage(View view) {
        Intent intent = new Intent(this, MassageBookActivity.class);
        startActivity(intent);
    }
    public void onBackClick(View view) {
        finish();
    }

}