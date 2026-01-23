package com.assignment.androidviews.ui.textview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityTextViewBinding;

public class TextViewActivity extends AppCompatActivity {
    
    private ActivityTextViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTextViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("TextView Demo");
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
