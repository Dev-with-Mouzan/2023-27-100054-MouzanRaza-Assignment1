package com.assignment.androidviews.ui.ratingbar;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityRatingBarBinding;

public class RatingBarActivity extends AppCompatActivity {
    
    private ActivityRatingBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("RatingBar Demo");
        }
        
        binding.ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                binding.tvRatingValue.setText("Rating: " + rating + " / 5.0");
            }
        });
        
        binding.btnShow.setOnClickListener(v -> {
            float rating = binding.ratingBar.getRating();
            Toast.makeText(this, "You rated: " + rating + " stars", Toast.LENGTH_SHORT).show();
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
