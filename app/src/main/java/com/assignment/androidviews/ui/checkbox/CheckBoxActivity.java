package com.assignment.androidviews.ui.checkbox;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityCheckBoxBinding;
import java.util.ArrayList;
import java.util.List;

public class CheckBoxActivity extends AppCompatActivity {
    
    private ActivityCheckBoxBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("CheckBox Demo");
        }
        
        binding.btnShow.setOnClickListener(v -> {
            List<String> selected = new ArrayList<>();
            
            if (binding.cbJava.isChecked()) {
                selected.add("Java");
            }
            if (binding.cbKotlin.isChecked()) {
                selected.add("Kotlin");
            }
            if (binding.cbPython.isChecked()) {
                selected.add("Python");
            }
            if (binding.cbJavascript.isChecked()) {
                selected.add("JavaScript");
            }
            
            if (selected.isEmpty()) {
                Toast.makeText(this, "No language selected", Toast.LENGTH_SHORT).show();
            } else {
                String message = "Selected: " + String.join(", ", selected);
                binding.tvResult.setText(message);
                Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
            }
        });
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
