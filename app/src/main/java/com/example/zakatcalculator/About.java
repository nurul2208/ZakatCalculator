/*
 * Copyright © [2023] by [Nurul Qistina Binti Osman Talib]. All rights reserved.
 *
 * This work is for course ICT602 , Sir Hafiz .
 * This work, including all text, images, and other content, is a proprietary of me .
 * Any unauthorized use, reproduction, or distribution is strictly prohibited.
 *
 *
 *
 */

package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;


public class About extends AppCompatActivity {

    Toolbar aboutToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        aboutToolBar = findViewById(R.id.about_toolbar);
        setSupportActionBar(aboutToolBar);
        getSupportActionBar().setTitle("About");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home) {
            super.onBackPressed();
        }
        return true;
    }

}