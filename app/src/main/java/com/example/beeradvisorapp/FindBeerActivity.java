package com.example.beeradvisorapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    private BeerExpert expert = new BeerExpert();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    // called when the user clicks a button with id: find_beer
    public void onClickFindBeer(View view){
        // Get a reference to the text view
        TextView brands = (TextView) findViewById(R.id.brands);

        // Get a reference to the Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());

        // Get recommendations from the BeerExpert class
        List<String> recommendationList = expert.getBrands(beerType);
        String recommendations = String.join(", ", recommendationList);

        brands.setText(recommendations);
    }
}