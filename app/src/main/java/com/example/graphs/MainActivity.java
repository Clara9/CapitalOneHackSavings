package com.example.graphs;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PieChart pieChart = (PieChart) findViewById(R.id.chart2);

        PieChart pieChart2 = (PieChart) findViewById(R.id.chart);
        pieChart.setUsePercentValues(true);

        ArrayList<Entry> yvalues = new ArrayList<Entry>();
        ArrayList<String> xVals = new ArrayList<String>();

        yvalues.add(new Entry(8, 0));
        yvalues.add(new Entry(15, 1));
        yvalues.add(new Entry(12, 2));
        yvalues.add(new Entry(25, 3));
        yvalues.add(new Entry(23, 4));

        xVals.add("January");
        xVals.add("February");
        xVals.add("March");
        xVals.add("April");
        xVals.add("May");

        PieDataSet dataSet = new PieDataSet(yvalues, "");

        PieData data = new PieData(xVals, dataSet);
        pieChart.setData(data);
        pieChart2.setData(data);

        pieChart.invalidate();
        pieChart2.invalidate();

        pieChart.setDrawHoleEnabled(true);
        pieChart.setTransparentCircleRadius(30f);
        pieChart.setHoleRadius(30f);

        pieChart2.setDrawHoleEnabled(true);
        pieChart2.setTransparentCircleRadius(30f);
        pieChart2.setHoleRadius(30f);

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
}
