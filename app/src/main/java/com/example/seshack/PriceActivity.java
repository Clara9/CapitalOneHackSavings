package com.example.seshack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PriceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        configureBackButton();
        testIntent();
    }

    private void configureBackButton() {
        Button backButton = (Button) findViewById(R.id.back2);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void testIntent() {
        TextView category = (TextView) findViewById(R.id.category);
        Intent intent = getIntent();
        if (intent != null) {
            String data = intent.getStringExtra("SAVING_CATEGORY");
            category.setText(String.valueOf(data));
        }
    }

}
