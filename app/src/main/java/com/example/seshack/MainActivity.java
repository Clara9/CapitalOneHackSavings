package com.example.seshack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureNewSavingButton();
    }

    private void configureNewSavingButton() {
        Button newSavingButton = (Button) findViewById(R.id.newSavingButton);
        newSavingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, NewSavingActivity.class));
            }
        });
    }

}
