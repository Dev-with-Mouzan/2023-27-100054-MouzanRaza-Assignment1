package com.assignment.androidviews.ui.edittext;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityEditTextBinding;

public class EditTextActivity extends AppCompatActivity {
    
    private ActivityEditTextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditTextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("EditText Demo");
        }
        
        binding.btnSubmit.setOnClickListener(v -> {
            String name = binding.etName.getText().toString();
            String email = binding.etEmail.getText().toString();
            String notes = binding.etMultiline.getText().toString();
            
            if (name.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show();
            } else {
                String message = "Name: " + name + "\nEmail: " + email + "\nNotes: " + notes;
                Toast.makeText(this, message, Toast.LENGTH_LONG).show();
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
