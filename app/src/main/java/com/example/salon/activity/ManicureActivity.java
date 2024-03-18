package com.example.salon.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.salon.Fragments.DescriptionManicure;
import com.example.salon.R;

public class ManicureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manicure);
    }
    public void manicureOnDescriptionClick(View view) {
        DescriptionManicure bottomSheet = new DescriptionManicure();
        bottomSheet.show(getSupportFragmentManager(), "DescriptionManicure");
    }

    public void onBackClick(View view) {
        finish();
    }
    public void onContinueClickManicure(View view) {
        Intent intent = new Intent(this, ManicureBookActivity.class);
        startActivity(intent);
    }
}
