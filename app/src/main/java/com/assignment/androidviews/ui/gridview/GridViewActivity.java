package com.assignment.androidviews.ui.gridview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityGridViewBinding;

public class GridViewActivity extends AppCompatActivity {
    
    private ActivityGridViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGridViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("GridView Demo");
        }
        
        String[] numbers = new String[30];
        for (int i = 0; i < 30; i++) {
            numbers[i] = "Item " + (i + 1);
        }
        
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
            this, android.R.layout.simple_list_item_1, numbers);
        binding.gridView.setAdapter(adapter);
        
        binding.gridView.setOnItemClickListener((parent, view, position, id) -> {
            String selected = numbers[position];
            Toast.makeText(this, "Selected: " + selected, Toast.LENGTH_SHORT).show();
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
