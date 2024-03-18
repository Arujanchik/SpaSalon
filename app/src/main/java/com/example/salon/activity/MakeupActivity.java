package com.example.salon.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.salon.R;

public class MakeupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makeup);
    }
    public void makeupOnDescriptionClick(View view) {
        DescriptionMakeup bottomSheet = new DescriptionMakeup();
        bottomSheet.show(getSupportFragmentManager(), "DescriptionMakeup");
    }

    public void onBackClick(View view) {
        finish();
    }
    public void onContinueClickMakeup(View view) {
        Intent intent = new Intent(this, MakeUpBookActivity.class);
        startActivity(intent);
    }
}