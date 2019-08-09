package com.example.charityselection;

import com.example.charityselection.models.CharityResponse;
import com.example.charityselection.models.DataItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CharityClient {
    @GET("v1/charitysearch")
    Call<CharityResponse> charitiesForCategory(
            @Query("user_key")String user_key,
            @Query("searchTerm")String searchTerm,
            @Query("rows")String rows

    );
}
