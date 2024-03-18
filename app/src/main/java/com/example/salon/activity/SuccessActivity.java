package com.example.salon.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.salon.R;
import com.example.salon.activity.MainActivity;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
    }
    public void onBackHomeClick(View view) {
        // Intent to navigate back to HomeActivity
        Intent intent = new Intent(this, MainActivity.class);
        // Clear all other activities and bring HomeActivity to the front
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    public void onOrderHistoryClick(View view) {
        finish();
    }

}