package com.assignment.androidviews.ui.progressbar;

import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityProgressBarBinding;

public class ProgressBarActivity extends AppCompatActivity {
    
    private ActivityProgressBarBinding binding;
    private Handler handler = new Handler();
    private int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("ProgressBar Demo");
        }
        
        binding.btnStart.setOnClickListener(v -> startProgress());
    }
    
    private void startProgress() {
        progress = 0;
        binding.progressBarDeterminate.setProgress(0);
        
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (progress < 100) {
                    progress += 10;
                    binding.progressBarDeterminate.setProgress(progress);
                    binding.tvProgress.setText("Progress: " + progress + "%");
                    handler.postDelayed(this, 500);
                }
            }
        }, 500);
    }
    
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
        binding = null;
    }
}
