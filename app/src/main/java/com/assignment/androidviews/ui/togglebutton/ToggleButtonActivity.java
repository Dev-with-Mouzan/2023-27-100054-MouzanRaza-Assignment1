package com.assignment.androidviews.ui.togglebutton;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityToggleButtonBinding;

public class ToggleButtonActivity extends AppCompatActivity {
    
    private ActivityToggleButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToggleButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("ToggleButton Demo");
        }
        
        binding.toggleSound.setOnCheckedChangeListener((buttonView, isChecked) -> 
            binding.tvSoundStatus.setText("Sound: " + (isChecked ? "ON" : "OFF")));
        
        binding.toggleVibrate.setOnCheckedChangeListener((buttonView, isChecked) -> 
            binding.tvVibrateStatus.setText("Vibrate: " + (isChecked ? "ON" : "OFF")));
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
