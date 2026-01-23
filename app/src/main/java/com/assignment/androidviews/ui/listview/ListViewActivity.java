package com.assignment.androidviews.ui.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityListViewBinding;

public class ListViewActivity extends AppCompatActivity {
    
    private ActivityListViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("ListView Demo");
        }
        
        String[] items = {
            "Android Development", "iOS Development", "Web Development",
            "Machine Learning", "Data Science", "Cloud Computing",
            "Cybersecurity", "DevOps", "Blockchain", "UI/UX Design",
            "Game Development", "Mobile App Testing", "Database Management",
            "API Development", "Flutter Development"
        };
        
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
            this, android.R.layout.simple_list_item_1, items);
        binding.listView.setAdapter(adapter);
        
        binding.listView.setOnItemClickListener((parent, view, position, id) -> {
            String selected = items[position];
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
