package com.example.task5.linear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.task5.R;

public class LinearLayoutActivity extends AppCompatActivity {

    private Button buttonHorizontal;
    private Button buttonVertical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        buttonHorizontal = findViewById(R.id.buttonHorizontal);
        buttonVertical = findViewById(R.id.buttonVertical);

        setOnClickListeners();
    }

    private void setOnClickListeners() {
        buttonHorizontal.setOnClickListener((v) -> {
            Intent intent = new Intent(LinearLayoutActivity.this, HorizontalLinearLayoutActivity.class);
            startActivity(intent);
        });

        buttonVertical.setOnClickListener((v) -> {
            Intent intent = new Intent(LinearLayoutActivity.this, VerticalLinearLayoutActivity.class);
            startActivity(intent);
        });
    }
}