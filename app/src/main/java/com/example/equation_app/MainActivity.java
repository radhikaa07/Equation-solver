package com.example.equation_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.equation_app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainBinding= DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

        MyEquation equation = new MyEquation(mainBinding);
        mainBinding.setMyEquation(equation);






    }
}