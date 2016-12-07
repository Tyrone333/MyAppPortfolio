package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //All my buttons
        Button moviesButton = (Button) findViewById(R.id.movies_button);
        Button stockHawkButton = (Button) findViewById(R.id.stock_hawk_button);
        Button buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        Button materialAppButton = (Button) findViewById(R.id.material_button);
        Button ubiquitousButton = (Button) findViewById(R.id.ubiquitous_button);
        Button capstoneButton = (Button) findViewById(R.id.capstone_button);
        
        //On click listener for the popular movies button
        moviesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.toast_movies, Toast.LENGTH_LONG).show();
            }
        });
        //On click listener for the stock hawk button
        stockHawkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.toast_hawk, Toast.LENGTH_LONG).show();
            }
        });
        //On click listener for the build it bigger button
        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.toast_bigger, Toast.LENGTH_LONG).show();
            }
        });
        //On click listener for the material button
        materialAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.toast_material, Toast.LENGTH_LONG).show();
            }
        });
        //On click listener for the ubiquitous button
        ubiquitousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.toast_ubiquitous, Toast.LENGTH_LONG).show();
            }
        });
        //On click listener for the capstone button
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.toast_capstone, Toast.LENGTH_LONG).show();
            }
        });
    }
}
