package com.example.seshack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewSavingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_saving);

        configureBackButton();
        configureSavingCategories();
    }

    private void configureBackButton() {
        Button backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void configureSavingCategories() {
        Button foodDrinkButton = (Button) findViewById(R.id.foodDrink);
        foodDrinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewSavingActivity.this, PriceActivity.class);
                intent.putExtra("SAVING_CATEGORY", "foodDrink");
                startActivity(intent);
            }
        });

        Button entertainmentButton = (Button) findViewById(R.id.entertainment);
        entertainmentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewSavingActivity.this, PriceActivity.class);
                intent.putExtra("SAVING_CATEGORY", "entertainment");
                startActivity(intent);
            }
        });

        Button transportationButton = (Button) findViewById(R.id.transportation);
        transportationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewSavingActivity.this, PriceActivity.class);
                intent.putExtra("SAVING_CATEGORY", "transportation");
                startActivity(intent);
            }
        });

        Button clothesButton = (Button) findViewById(R.id.clothes);
        clothesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NewSavingActivity.this, PriceActivity.class);
                intent.putExtra("SAVING_CATEGORY", "clothes");
                startActivity(intent);
            }
        });
    }
}
