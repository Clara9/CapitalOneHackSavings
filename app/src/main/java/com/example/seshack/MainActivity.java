package com.example.seshack;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureNewSavingButton();

        PieChart pieChart = (PieChart) findViewById(R.id.chart2);

        PieChart pieChart2 = (PieChart) findViewById(R.id.chart);
        pieChart.setUsePercentValues(true);

        ArrayList<Entry> yvalues = new ArrayList<Entry>();
        ArrayList<String> xVals = new ArrayList<String>();

        yvalues.add(new Entry(50f, 0));
        yvalues.add(new Entry(35f, 1));
        yvalues.add(new Entry(89f, 2));
        yvalues.add(new Entry(93f, 3));
        yvalues.add(new Entry(135f, 4));

        xVals.add("Food");
        xVals.add("Transportation");
        xVals.add("Entertainment");
        xVals.add("Fashion");
        xVals.add("Other");

        PieDataSet dataSet = new PieDataSet(yvalues, "");

        PieData data = new PieData(xVals, dataSet);
        pieChart.setData(data);
        pieChart2.setData(data);

        pieChart.invalidate();
        pieChart2.invalidate();

        pieChart.setDrawHoleEnabled(true);
        pieChart.setTransparentCircleRadius(50f);
        pieChart.setHoleRadius(50f);

        pieChart2.setDrawHoleEnabled(true);
        pieChart2.setTransparentCircleRadius(50f);
        pieChart2.setHoleRadius(50f);

        dataSet.setColors(ColorTemplate.VORDIPLOM_COLORS);
        data.setValueTextSize(13f);
        data.setValueTextColor(Color.DKGRAY);
        pieChart.setDescription("");
        pieChart2.setDescription("");

        pieChart.getLegend().setPosition(Legend.LegendPosition.RIGHT_OF_CHART_CENTER);
        pieChart2.getLegend().setPosition(Legend.LegendPosition.RIGHT_OF_CHART_CENTER);

        pieChart.setDrawSliceText(false);
        pieChart2.setDrawSliceText(false);

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
