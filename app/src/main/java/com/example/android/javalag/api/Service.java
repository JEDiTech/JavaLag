package com.example.android.javalag.api;

import com.example.android.javalag.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Master on 18/8/2017.
 */

public interface Service {
    @GET("/search/users?q=language:java+location:lagos&per_page=100")
    Call <ItemResponse> getItems();
}
