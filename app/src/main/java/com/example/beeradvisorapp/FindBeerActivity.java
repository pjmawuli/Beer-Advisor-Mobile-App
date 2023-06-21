package com.example.beeradvisorapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class FindBeerActivity extends AppCompatActivity {


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

        brands.setText(beerType);
    }
}