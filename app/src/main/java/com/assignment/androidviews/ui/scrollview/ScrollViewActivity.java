package com.assignment.androidviews.ui.scrollview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityScrollViewBinding;

public class ScrollViewActivity extends AppCompatActivity {
    
    private ActivityScrollViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityScrollViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("ScrollView Demo");
        }
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
