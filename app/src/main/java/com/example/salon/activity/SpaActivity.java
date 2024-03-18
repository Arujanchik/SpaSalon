package com.example.salon.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.salon.R;

public class SpaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spa);
    }
    public void spaOnDescriptionClick(View view) {
        DescriptionMassage bottomSheet = new DescriptionMassage();
        bottomSheet.show(getSupportFragmentManager(), "DescriptionSpa");
    }
    public void onContinueClickManicure(View view) {
        Intent intent = new Intent(this, SpaBookActivity.class);
        startActivity(intent);
    }
}