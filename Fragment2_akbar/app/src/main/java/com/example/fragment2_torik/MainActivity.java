package com.example.fragment2_torik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.fragment2_torik.Fragment.MultipleFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void multiple(View view)
    {
        Intent multiple = new Intent(MainActivity.this, MultipleFragment.class);
        startActivity(multiple);
    }
}
