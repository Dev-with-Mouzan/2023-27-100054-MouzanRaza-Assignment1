package com.assignment.androidviews.ui.switch_view;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivitySwitchBinding;

public class SwitchActivity extends AppCompatActivity {
    
    private ActivitySwitchBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySwitchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Switch Demo");
        }
        
        binding.switchWifi.setOnCheckedChangeListener((buttonView, isChecked) -> 
            binding.tvWifiStatus.setText("WiFi: " + (isChecked ? "ON" : "OFF")));
        
        binding.switchBluetooth.setOnCheckedChangeListener((buttonView, isChecked) -> 
            binding.tvBluetoothStatus.setText("Bluetooth: " + (isChecked ? "ON" : "OFF")));
        
        binding.switchLocation.setOnCheckedChangeListener((buttonView, isChecked) -> 
            binding.tvLocationStatus.setText("Location: " + (isChecked ? "ON" : "OFF")));
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
