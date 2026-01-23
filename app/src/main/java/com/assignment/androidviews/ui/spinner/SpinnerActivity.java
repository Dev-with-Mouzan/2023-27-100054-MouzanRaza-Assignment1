package com.assignment.androidviews.ui.spinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.R;
import com.assignment.androidviews.databinding.ActivitySpinnerBinding;

public class SpinnerActivity extends AppCompatActivity {
    
    private ActivitySpinnerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySpinnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Spinner Demo");
        }
        
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
            this, R.array.countries, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinner.setAdapter(adapter);
        
        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                binding.tvResult.setText("Selected: " + selected);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        
        binding.btnShow.setOnClickListener(v -> {
            String selected = binding.spinner.getSelectedItem().toString();
            Toast.makeText(this, "You selected: " + selected, Toast.LENGTH_SHORT).show();
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
