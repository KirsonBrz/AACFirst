package com.example.aacfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button decreaseButton, increaseButton;
    private MainActivityViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        model = new ViewModelProvider(this).get(MainActivityViewModel.class);

        MutableLiveData<Integer> countLiveData = model.getCurrentValue();

        countLiveData.observe(this, integer -> textView.setText(String.valueOf(integer)));


        textView = findViewById(R.id.countText);
        textView.setText(String.valueOf(model.getCurrentValue()));
        decreaseButton = findViewById(R.id.decreaseButton);
        increaseButton = findViewById(R.id.increaseButton);

        decreaseButton.setOnClickListener(view -> model.getDecreasedValue());

        increaseButton.setOnClickListener(view -> model.getIncreasedValue());


    }
}