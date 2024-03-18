package com.example.salon.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.salon.Fragments.CalendarFragment;
import com.example.salon.Fragments.HomeFragment;
import com.example.salon.Fragments.SearchFragment;
import com.example.salon.Fragments.UserFragment;
import com.example.salon.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        if (savedInstanceState == null) {
            int initialFragment = getIntent().getIntExtra("NAVIGATE_TO", -1);
            if (initialFragment != -1) {
                bottomNav.setSelectedItemId(initialFragment); // This will trigger the navigation listener
            } else {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HomeFragment()).commit();
            }
        }

        // При запуске приложения показываем HomeFragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new HomeFragment()).commit();
        }
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    int id = item.getItemId();
                    if (id == R.id.nav_home) {
                        selectedFragment = new HomeFragment();
                    } else if (id == R.id.nav_search) {
                        selectedFragment = new SearchFragment();
                    } else if (id == R.id.nav_calendar) {
                        selectedFragment = new CalendarFragment();
                    }

                    if (selectedFragment != null) {
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                                selectedFragment).commit();
                    }

                    return true;
                }
            };
}
