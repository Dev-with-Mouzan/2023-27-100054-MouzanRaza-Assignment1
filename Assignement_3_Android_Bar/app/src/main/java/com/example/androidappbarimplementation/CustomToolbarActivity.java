package com.example.androidappbarimplementation;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

/**
 * CustomToolbarActivity demonstrates using a custom layout inside a Toolbar.
 */
public class CustomToolbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_toolbar);

        // Find the toolbar
        Toolbar toolbar = findViewById(R.id.custom_toolbar);
        setSupportActionBar(toolbar);

        // Hide default title as we are using a custom one
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowTitleEnabled(false);
            // Enable back navigation
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        // Access views within the custom toolbar layout
        ImageButton btnCustomAction = findViewById(R.id.btnCustomAction);

        // Handle custom action button click
        btnCustomAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CustomToolbarActivity.this, "Custom Action Button Clicked!", Toast.LENGTH_SHORT).show();
            }
        });

        // Handle back navigation
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
