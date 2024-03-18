package com.example.salon.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.salon.R;

public class PillingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilling);
    }
    public void pillingOnDescriptionClick(View view) {
        DescriptionPilling bottomSheet = new DescriptionPilling();
        bottomSheet.show(getSupportFragmentManager(), "DescriptionPilling");
    }

    public void onBackClick(View view) {
        finish();
    }
    public void onContinueClickPilling(View view) {
        Intent intent = new Intent(this, PillingBookActivity.class);
        startActivity(intent);
    }
}