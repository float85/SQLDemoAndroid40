package com.tethys.sqldemoandroid40;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.tethys.sqldemoandroid40.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    SQLHelper sqlHelper;
    List<Foods> foodsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        sqlHelper = new SQLHelper(this);
        foodsList = new ArrayList<>();
        foodsList = sqlHelper.getAllFoods();

        binding.btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = binding.etName.getText().toString();
                float price = Float.valueOf(binding.etPrice.getText().toString());
                int number = Integer.valueOf(binding.etNumber.getText().toString());
                String des = binding.etDes.getText().toString();

                Foods foods = new Foods(name, price, number, des);

                sqlHelper.insertFoods(foods);
                clearData();
            }
        });

    }

    private void clearData() {
        binding.etName.setText("");
        binding.etDes.setText("");
        binding.etNumber.setText("");
        binding.etPrice.setText("");
    }
}