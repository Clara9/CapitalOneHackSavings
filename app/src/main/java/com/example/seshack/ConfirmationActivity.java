package com.example.seshack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        Intent intent = getIntent();
        TextView moneySaved = (TextView) findViewById(R.id.moneySaved);
        TextView category = (TextView) findViewById(R.id.category);
        category.setText("On " + intent.getStringExtra("SAVING_CATEGORY"));
        moneySaved.setText("$ " + intent.getStringExtra("AMOUNT_SAVED"));

        configureDonateButton();
    }

    private void configureDonateButton() {
        Button donateButton = (Button) findViewById(R.id.donateCharity);
        donateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(ConfirmationActivity.this, CharityActivity.class);
                startActivity(intent2);
            }
        });

    }
}
