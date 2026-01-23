package com.assignment.androidviews.ui.button;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityButtonBinding;

public class ButtonActivity extends AppCompatActivity {
    
    private ActivityButtonBinding binding;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Button Demo");
        }
        
        binding.btnNormal.setOnClickListener(v -> {
            clickCount++;
            binding.tvClickCount.setText("Click Count: " + clickCount);
            Toast.makeText(this, "Normal Button Clicked!", Toast.LENGTH_SHORT).show();
        });
        
        binding.btnColored.setOnClickListener(v -> 
            Toast.makeText(this, "Colored Button Clicked!", Toast.LENGTH_SHORT).show());
        
        binding.btnOutlined.setOnClickListener(v -> 
            Toast.makeText(this, "Outlined Button Clicked!", Toast.LENGTH_SHORT).show());
    }
    
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}
