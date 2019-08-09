package com.example.seshack;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.seshack.model.CharityResponse;
import com.example.seshack.model.DataItem;

import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CharityActivity extends AppCompatActivity {
    private ListView listView;
    public List<CharitiesItem> allcharities;
    public String selectedItemText="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.charities_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        //Interceptor Code
        HttpLoggingInterceptor logging =new HttpLoggingInterceptor();
        logging.level(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .connectTimeout(5000, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .build();
        final Retrofit builder=new Retrofit.Builder()
                .baseUrl("https://data.orghunter.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient)
                .build();

        //Getting ListView
        listView=(ListView)findViewById(R.id.paginationList);
        final ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(aa);
        String selected = spinner.getSelectedItem().toString();
        Toast.makeText(getApplicationContext(),selected,Toast.LENGTH_SHORT).show();

        //String text = spinner.getSelectedItem().toString();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedItemText = (String) adapterView.getItemAtPosition(i);
                Toast.makeText
                        (getApplicationContext(), "Selected : " + selectedItemText, Toast.LENGTH_SHORT)
                        .show();
                //Calling the API
                CharityClient client = builder.create(CharityClient.class);

                Call<CharityResponse> call= client.charitiesForCategory("5ccf3fdb30b8bea29185a75b07530d03",selectedItemText,"5");
                call.enqueue(new Callback<CharityResponse>() {
                    public String charName;
                    @Override
                    public void onResponse(Call<CharityResponse> call, Response<CharityResponse> response) {
                        CharityResponse response1 = response.body();
                        List<DataItem> charities= response1.getData();
                        aa.clear();
                        for (DataItem dataitem:charities) {
                            charName=dataitem.getCharityName();
                            aa.add(charName);
                        }
                    }
                    @Override
                    public void onFailure(Call<CharityResponse> call, Throwable t) {
                        Toast.makeText(CharityActivity.this,"Error!", Toast.LENGTH_SHORT).show();
                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

    }
}