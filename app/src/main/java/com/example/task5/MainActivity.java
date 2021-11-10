package com.example.task5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.task5.linear.LinearLayoutActivity;
import com.example.task5.relative.RelativeLayoutActivity;
import com.example.task5.scroll.ScrollViewActivity;
import com.example.task5.table.TableLayoutActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonLinearLayout;
    private Button buttonRelativeLayout;
    private Button buttonTableLayout;
    private Button buttonScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define views
        buttonLinearLayout = findViewById(R.id.buttonLinearLayout);
        buttonRelativeLayout = findViewById(R.id.buttonRelativeLayout);
        buttonTableLayout = findViewById(R.id.buttonTableLayout);
        buttonScrollView = findViewById(R.id.buttonScrollView);

        setOnClickListeners();
    }

    private void setOnClickListeners() {
        buttonLinearLayout.setOnClickListener((v) -> {
            Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
            startActivity(intent);
        });
        buttonRelativeLayout.setOnClickListener((v) -> {
            Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
            startActivity(intent);
        });
        buttonTableLayout.setOnClickListener((v) -> {
            Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
            startActivity(intent);
        });
        buttonScrollView.setOnClickListener((v) -> {
            Intent intent = new Intent(MainActivity.this, ScrollViewActivity.class);
            startActivity(intent);
        });
    }
}