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
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Toolbar myToolbar;
    EditText editTextGoldValue, editTextGoldGram;
    Button btnCalculateZakat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
        getSupportActionBar().setTitle(R.string.app_name);

        Spinner spinnerOptions = findViewById(R.id.spinner_options);
        ArrayAdapter<CharSequence> adapterOptions = ArrayAdapter.createFromResource(this, R.array.spinner_options, android.R.layout.simple_spinner_item);
        adapterOptions.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerOptions.setAdapter(adapterOptions);
        spinnerOptions.setOnItemSelectedListener(this);

        editTextGoldValue = findViewById(R.id.editTextGoldValue);
        editTextGoldGram = findViewById(R.id.editTextGoldGram);
        btnCalculateZakat = findViewById(R.id.btnCalculateZakat);

        btnCalculateZakat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculateZakat();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.item_share) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Please use my application - https://github.com/nurul2208");
            startActivity(Intent.createChooser(shareIntent, null));
            return true;
        } else if (item.getItemId() == R.id.item_about) {
            Intent aboutIntent = new Intent(this, About.class);
            startActivity(aboutIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void calculateZakat() {
        try {
            double goldWeight = Double.parseDouble(editTextGoldGram.getText().toString());
            Spinner spinnerOptions = findViewById(R.id.spinner_options);
            String selectedOption = (String) spinnerOptions.getSelectedItem();

            String goldType = (String) spinnerOptions.getSelectedItem();
            double currentGoldValue = Double.parseDouble(editTextGoldValue.getText().toString());


            double totalGoldValue = goldWeight - getXValue(goldType);
            double zakatPayableValue = Math.max(totalGoldValue, 0) * currentGoldValue;
            double totalZakat = 0.025 * zakatPayableValue;

            // Display the results in TextViews
            TextView tGold = findViewById(R.id.TGold);
            tGold.setText("Total Value Of Gold (Gram) :"+String.format(" %.2f", totalGoldValue));

            TextView tZPayable = findViewById(R.id.TZPayable);
            tZPayable.setText("Total Zakat Payable (RM)    :"+String.format(" %.2f", zakatPayableValue));

            TextView tZakat = findViewById(R.id.TZakat);
            tZakat.setText("Total Zakat (RM)                   :"+String.format(" %.2f", totalZakat));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Please enter valid numbers for gold weight and value", Toast.LENGTH_SHORT).show();
        }
    }


    private double getXValue(String goldType) {
        double XValue = 0.0; // You need to set an appropriate default value
        // Implement the logic to determine the XValue based on goldType
        if ("Keep".equals(goldType)) {
            XValue = 85.0;
        } else if ("Wear".equals(goldType)) {
            XValue = 200.0;
        }
        return XValue;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // Implement if needed
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Implement if needed
    }
}
