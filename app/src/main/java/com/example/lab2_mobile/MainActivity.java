package com.example.lab2_mobile;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView surnameTextView = findViewById(R.id.surnameTextView);
        ImageView flagImageView = findViewById(R.id.flagImageView);
        ImageView coatOfArmsImageView = findViewById(R.id.coatOfArmsImageView);

        surnameTextView.setText(getString(R.string.surname));
        flagImageView.setImageResource(R.drawable.national_flag);
        coatOfArmsImageView.setImageResource(R.drawable.national_coat_of_arms);
    }
}
