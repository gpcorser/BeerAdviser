package com.georgecorser.beeradviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // Call when button is clicked
    public void onClickFindBeer(View view) {

        // Get reference to the TextView
        TextView brands = (TextView) findViewById(R.id.brands);

        // Get reference to Spinner
        Spinner color = (Spinner) findViewById(R.id.color);

        // Get selected line item in Spinner
        String beerType = String.valueOf(color.getSelectedItem());

        BeerExpert expert = new BeerExpert();

        // Get recommendations from BeerExpert class
        List<String> brandsList = expert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }

        // Display beers
        // brands.setText(beerType);
        brands.setText(brandsFormatted);
    }
}

