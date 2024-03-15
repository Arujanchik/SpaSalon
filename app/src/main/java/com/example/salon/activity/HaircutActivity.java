package com.example.salon.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.salon.Fragments.DescriptionBottomSheetDialogFragment;
import com.example.salon.R;

public class HaircutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haircut);
    }
    public void onDescriptionClick(View view) {
        DescriptionBottomSheetDialogFragment bottomSheet = new DescriptionBottomSheetDialogFragment();
        bottomSheet.show(getSupportFragmentManager(), "DescriptionBottomSheet");
    }
}