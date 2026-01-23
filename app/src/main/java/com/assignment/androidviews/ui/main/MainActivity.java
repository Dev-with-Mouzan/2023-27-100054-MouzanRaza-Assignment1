package com.assignment.androidviews.ui.main;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.assignment.androidviews.databinding.ActivityMainBinding;
import com.assignment.androidviews.ui.button.ButtonActivity;
import com.assignment.androidviews.ui.checkbox.CheckBoxActivity;
import com.assignment.androidviews.ui.constraintlayout.ConstraintLayoutActivity;
import com.assignment.androidviews.ui.edittext.EditTextActivity;
import com.assignment.androidviews.ui.framelayout.FrameLayoutActivity;
import com.assignment.androidviews.ui.gridview.GridViewActivity;
import com.assignment.androidviews.ui.imageview.ImageViewActivity;
import com.assignment.androidviews.ui.linearlayout.LinearLayoutActivity;
import com.assignment.androidviews.ui.listview.ListViewActivity;
import com.assignment.androidviews.ui.progressbar.ProgressBarActivity;
import com.assignment.androidviews.ui.radiobutton.RadioButtonActivity;
import com.assignment.androidviews.ui.ratingbar.RatingBarActivity;
import com.assignment.androidviews.ui.recyclerview.RecyclerViewActivity;
import com.assignment.androidviews.ui.relativelayout.RelativeLayoutActivity;
import com.assignment.androidviews.ui.scrollview.ScrollViewActivity;
import com.assignment.androidviews.ui.seekbar.SeekBarActivity;
import com.assignment.androidviews.ui.spinner.SpinnerActivity;
import com.assignment.androidviews.ui.switch_view.SwitchActivity;
import com.assignment.androidviews.ui.textview.TextViewActivity;
import com.assignment.androidviews.ui.togglebutton.ToggleButtonActivity;

public class MainActivity extends AppCompatActivity {
    
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        
        setupClickListeners();
    }
    
    private void setupClickListeners() {
        binding.btnTextView.setOnClickListener(v -> 
            startActivity(new Intent(this, TextViewActivity.class)));
        
        binding.btnEditText.setOnClickListener(v -> 
            startActivity(new Intent(this, EditTextActivity.class)));
        
        binding.btnButton.setOnClickListener(v -> 
            startActivity(new Intent(this, ButtonActivity.class)));
        
        binding.btnImageView.setOnClickListener(v -> 
            startActivity(new Intent(this, ImageViewActivity.class)));
        
        binding.btnCheckBox.setOnClickListener(v -> 
            startActivity(new Intent(this, CheckBoxActivity.class)));
        
        binding.btnRadioButton.setOnClickListener(v -> 
            startActivity(new Intent(this, RadioButtonActivity.class)));
        
        binding.btnSwitch.setOnClickListener(v -> 
            startActivity(new Intent(this, SwitchActivity.class)));
        
        binding.btnToggleButton.setOnClickListener(v -> 
            startActivity(new Intent(this, ToggleButtonActivity.class)));
        
        binding.btnSpinner.setOnClickListener(v -> 
            startActivity(new Intent(this, SpinnerActivity.class)));
        
        binding.btnListView.setOnClickListener(v -> 
            startActivity(new Intent(this, ListViewActivity.class)));
        
        binding.btnRecyclerView.setOnClickListener(v -> 
            startActivity(new Intent(this, RecyclerViewActivity.class)));
        
        binding.btnGridView.setOnClickListener(v -> 
            startActivity(new Intent(this, GridViewActivity.class)));
        
        binding.btnProgressBar.setOnClickListener(v -> 
            startActivity(new Intent(this, ProgressBarActivity.class)));
        
        binding.btnSeekBar.setOnClickListener(v -> 
            startActivity(new Intent(this, SeekBarActivity.class)));
        
        binding.btnRatingBar.setOnClickListener(v -> 
            startActivity(new Intent(this, RatingBarActivity.class)));
        
        binding.btnLinearLayout.setOnClickListener(v -> 
            startActivity(new Intent(this, LinearLayoutActivity.class)));
        
        binding.btnRelativeLayout.setOnClickListener(v -> 
            startActivity(new Intent(this, RelativeLayoutActivity.class)));
        
        binding.btnConstraintLayout.setOnClickListener(v -> 
            startActivity(new Intent(this, ConstraintLayoutActivity.class)));
        
        binding.btnFrameLayout.setOnClickListener(v -> 
            startActivity(new Intent(this, FrameLayoutActivity.class)));
        
        binding.btnScrollView.setOnClickListener(v -> 
            startActivity(new Intent(this, ScrollViewActivity.class)));
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}
