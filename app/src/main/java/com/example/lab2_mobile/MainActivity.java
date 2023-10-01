package com.example.lab2_mobile;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView surnameTextView = findViewById(R.id.surnameTextView);
        ImageView flagImageView = findViewById(R.id.flagImageView);
        ImageView coatOfArmsImageView = findViewById(R.id.coatOfArmsImageView);

        surnameTextView.setText(getString(R.string.surname));

        if(Locale.getDefault().getLanguage().equals("en")){
            flagImageView.setImageResource(R.drawable.flag_of_the_us);
            coatOfArmsImageView.setImageResource(R.drawable.coat_of_arms_of_the_us);
        }else {
            flagImageView.setImageResource(R.drawable.national_flag);
            coatOfArmsImageView.setImageResource(R.drawable.national_coat_of_arms);
        }

    }
}
