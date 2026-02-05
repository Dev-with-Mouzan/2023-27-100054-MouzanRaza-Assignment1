package com.example.androidappbarimplementation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Enable Edge-to-Edge to prevent System UI conflicts
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Handle window insets (Status bar/Navigation bar padding)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Setup toolbar
        Toolbar toolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);

        Button btnActionBar = findViewById(R.id.btnActionBar);
        Button btnToolbar = findViewById(R.id.btnToolbar);
        Button btnCustomToolbar = findViewById(R.id.btnCustomToolbar);

        btnActionBar.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ActionBarActivity.class)));
        btnToolbar.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ToolbarActivity.class)));
        btnCustomToolbar.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, CustomToolbarActivity.class)));
    }
}
