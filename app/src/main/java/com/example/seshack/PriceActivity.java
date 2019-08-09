package com.example.seshack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PriceActivity extends AppCompatActivity {
    private EditText priceInput;
    private Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        priceInput = (EditText) findViewById(R.id.priceInput);
        confirmButton = (Button) findViewById(R.id.confirm);

        configureBackButton();
        configureConfirmButton();
        configurePriceInput();
    }

    private void configurePriceInput() {
        priceInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (!priceInput.getText().toString().isEmpty()) {
                    confirmButton.setEnabled(true);
                } else {
                    confirmButton.setEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
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

    private void configureConfirmButton() {
        confirmButton.setEnabled(false);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PriceActivity.this, ConfirmationActivity.class);
                intent.putExtra("SAVING_CATEGORY", getIntent().getStringExtra("SAVING_CATEGORY"));
                intent.putExtra("AMOUNT_SAVED", priceInput.getText().toString());
                startActivity(intent);
            }
        });
    }


}
