package com.assignment.androidviews.ui.imageview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityImageViewBinding;

public class ImageViewActivity extends AppCompatActivity {
    
    private ActivityImageViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("ImageView Demo");
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
