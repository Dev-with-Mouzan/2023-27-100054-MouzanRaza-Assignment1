package com.assignment.androidviews.ui.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.assignment.androidviews.databinding.ActivityRecyclerViewBinding;
import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    
    private ActivityRecyclerViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRecyclerViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("RecyclerView Demo");
        }
        
        List<Item> items = new ArrayList<>();
        items.add(new Item("Android Studio", "Official IDE for Android development"));
        items.add(new Item("Java", "Primary language for Android apps"));
        items.add(new Item("Kotlin", "Modern language for Android development"));
        items.add(new Item("XML", "Used for layout design"));
        items.add(new Item("Gradle", "Build automation tool"));
        items.add(new Item("Material Design", "Design language by Google"));
        items.add(new Item("Activities", "Core component of Android apps"));
        items.add(new Item("Fragments", "Reusable UI components"));
        items.add(new Item("Intents", "Messaging objects for communication"));
        items.add(new Item("RecyclerView", "Efficient list display widget"));
        
        ItemAdapter adapter = new ItemAdapter(items);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);
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
